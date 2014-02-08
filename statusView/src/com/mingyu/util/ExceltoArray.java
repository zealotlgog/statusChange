package com.mingyu.util;

import java.io.FileInputStream;
import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExceltoArray {

	public ExceltoArray() {

	}
	
	
	//This function is used to read a excel file, and return it context in a String[][]
	//Input: inputPaht , the path of the excel File
	//Output: String[][] which contains all the context fo the excel
	public static String[][] read(String inputPath) {

		String[][] answer = null;

		try {
			Workbook workBook = null;
			// Create a workbook
			InputStream inputStream = new FileInputStream(inputPath);
			workBook = Workbook.getWorkbook(inputStream);
			// Open sheets
			Sheet sheets = workBook.getSheet(0);
			// get the column number
			int sheetColumns = sheets.getColumns();
			// get the row number
			int sheetRows = sheets.getRows();
			// init answer

			answer = new String[sheetRows][sheetColumns];

			for (int i = 0; i < sheetRows; i++) {
				for (int j = 0; j < sheetColumns; j++) {
					// read this cell and put the context into answer
					Cell cell = sheets.getCell(j, i);
					answer[i][j] = cell.getContents().toString();
				}
			}
		} catch (Exception e) {
			System.err.println("Reading Excel Wrong!");
		}
		return answer;
	}
}
