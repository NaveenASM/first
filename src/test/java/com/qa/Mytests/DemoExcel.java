package com.qa.Mytests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoExcel {

	public static void main(String[] args) throws IOException {
		
		//to read the ecel
		FileInputStream fi = new FileInputStream("Test-Data/data.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fi);
		
		XSSFSheet sheet =  book.getSheet("invalidLoginTest");
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellcout = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data = new Object[2][3];
		
		DataFormatter format = new DataFormatter();   //incase cell-header has numbers instaed of Strings
		
			
		//to print all cell values
		for (int r=1; r<rowCount;r++)
		{
			for(int c=0;c<cellcout;c++)
			{
				String value = format.formatCellValue(sheet.getRow(r).getCell(c));
				System.out.println(value);
				data[r-1][c] = value;
							
			}
		}
	}

}
