package utils;

import java.io.IOException;

public class ExcelUtilsTest 
{

	public static void main(String[] args) throws IOException 
	{
	
		String excelpath = "./data/ExcelDate1.xlsx";
		String sheetName = "data";
		Excelutils excel= new Excelutils(excelpath, sheetName);
		
		excel.getrowcount();
		excel.getcelldata(3, 0);
		excel.getcelldata(3, 1);
		excel.getcelldata(3, 2);
	}
}
