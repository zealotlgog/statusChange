package com.mingyu.util;

import java.io.FileInputStream;
import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExceltoArray {

	public ExceltoArray() {

	}

	public static String[][] read(String inputPath) {

		String[][] answer = null;

		try {
			Workbook workBook = null;
			// ����Workbook���� ֻ��Workbook����
			// ֱ�Ӵӱ����ļ�����Workbook
			// ������������Workbook
			InputStream inputStream = new FileInputStream(inputPath);
			workBook = Workbook.getWorkbook(inputStream);
			// Sheet(���������)����Excel������½ǵ�Sheet1,Sheet2,Sheet3���ڳ�����
			// Sheet���±��Ǵ�0��ʼ��
			// ��ȡ��һ��Sheet��
			Sheet sheets = workBook.getSheet(0);
			// ��ȡSheet������������������
			int sheetColumns = sheets.getColumns();
			// ��ȡSheet������������������
			int sheetRows = sheets.getRows();
			// ��ȡָ���µ�Ԫ��Ķ�������

			answer = new String[sheetRows][sheetColumns];

			for (int i = 0; i < sheetRows; i++) {
				for (int j = 0; j < sheetColumns; j++) {
					// ע���ڶ�ȡʱ i��j��λ�á�i������ j�����С�������ǰ ���ں�
					Cell cell = sheets.getCell(j, i);
					answer[i][j] = cell.getContents().toString();
				}
			}
		} catch (Exception e) {
			System.err.println("Reading Excel Wrong!");
		}
		return answer;
	}

	public static void main(String args[]) {
		String inputPath = "/Users/mingyu_zhao/Documents/test1.xls";
		ExceltoArray.read(inputPath);
	}

}
