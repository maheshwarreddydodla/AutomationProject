package com.AutomationProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	
	public FileInputStream fis;
	public FileOutputStream fos;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	public String path=null;
	
	public ExcelUtility(String path)
	{
		this.path=path;
	
	}
	
	public int getRowCount(String sheetName) throws IOException
	{
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		wb.close();
		fis.close();
		return rowCount;
		
		
	}
	
	public int getCellCount(String sheetName,int rowNum) throws IOException
	{
	
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		int cellCount=row.getLastCellNum();
		wb.close();
		fis.close();
		return cellCount;
		
	}
	
	public String getCellData(String sheetName,int rowNum,int colNum) throws IOException
	{
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		DataFormatter df=new DataFormatter();
		String data;
		data=df.formatCellValue(cell);
		wb.close();
		fis.close();
		return data;
		
		
	}
	
	public void setCellData(String sheetName,int rowNum,int ColNum,String data) throws IOException
	{
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(rowNum);
		cell=row.createCell(ColNum);
		cell.setCellValue(data);
		fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();
		
	}
	
	

}
