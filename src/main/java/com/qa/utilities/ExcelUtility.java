package com.qa.utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtility {

	public static String file;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	int rowcount;
	int colcount;
	String celldata;
	
	public Object[][] Excel(String excelpath,int sheetnumber)
	{
		 try {
			book = new XSSFWorkbook(excelpath);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 sheet = book.getSheetAt(sheetnumber);
		 try {
			 rowcount=getRowCount();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 try {
			 colcount=getColCount();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 Object[][] data=new Object[rowcount-1][colcount];
			
			for(int i=1;i<rowcount;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					try {
						celldata = getCellData(i, j);
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					System.out.println(celldata);
					data[i-1][j]=celldata;
				}
			}
			return data;
	}	
		
	public static int getRowCount() throws IOException {
			
			 int rowcount = sheet.getPhysicalNumberOfRows();
			 System.out.println(rowcount);
			return rowcount;
		}
		public static int getColCount() throws IOException {
			
			 int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			 System.out.println(colCount);
			return colCount;
		}
		
		
		public static String getCellData(int rowcount,int colcount) throws IOException {
			
			 String celldata = sheet.getRow(rowcount).getCell(colcount).toString();
			 return celldata;
		}
	
	
	
		 
	

	
	
	


}
