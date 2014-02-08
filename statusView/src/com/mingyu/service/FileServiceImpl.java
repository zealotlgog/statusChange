package com.mingyu.service;

import java.util.ArrayList;
import java.util.List;

import com.mingyu.domain.Element;
import com.mingyu.util.*;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class FileServiceImpl implements FileService {

	@Override
	// Input: inputFilePath the path of the excel file
	// Output: String[][] which contains all the context
	public String[][] openExcelFile(String inputFilePath) {

		String[][] answer;
		answer = ExceltoArray.read(inputFilePath);
		return answer;
	}

	@Override
	// Input: inputFilePath the path of the excel file
	// Output: ArrayList<Element> which has all the context and every single
	// cell has been changed into an element.
	public List<Element> getElementFromExcel(String inputFilePath) {
		List<Element> answer = new ArrayList<Element>();
		String[][] excelContext = ExceltoArray.read(inputFilePath);

		for (int i = 0; i < excelContext.length; i++) {
			for (int j = 0; j < excelContext[i].length; j++) {
				Element tempElement = new Element();
				tempElement.setColor(0);
				tempElement.setFilename("");
				tempElement.setId(0);
				tempElement.setName(excelContext[i][j]);
				tempElement.setPositionx(i + 1);
				tempElement.setPositiony(j + 1);
				answer.add(tempElement);
			}
		}
		return answer;
	}
}
