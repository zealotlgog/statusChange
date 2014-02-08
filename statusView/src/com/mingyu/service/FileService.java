package com.mingyu.service;

import java.util.List;

import com.mingyu.domain.*;

public interface FileService {
	
	//This function is used to read excel and return String[][] which has all the context
	public String[][] openExcelFile(String inputFilePath);
	
	//This function is used to read excel file and return all the contexts in a ArrayList<Element>
	public List<Element> getElementFromExcel(String inputFilePath);
}
