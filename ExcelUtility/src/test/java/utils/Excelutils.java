package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils 
{
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public Excelutils(String excelpath, String sheetName ) throws IOException
	{
		 wb=new XSSFWorkbook(excelpath);
		sheet=wb.getSheet(sheetName);		
	}
	
	public static void getcelldata(int rownum,int cellnum) throws IOException
	{
		DataFormatter formatter=new DataFormatter();
		String value = formatter.formatCellValue(sheet.getRow(rownum).getCell(cellnum));
		//	double value = sheet.getRow(1).getCell(2).getNumericCellValue();
		System.out.print(" "+value);
	}
	
	public static void getrowcount() throws IOException
	{

		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("The no of rows is:"+rowcount);
		
		
		
		
		
		
	}
}
