package com.AutomationProject.TestNG;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.AutomationProject.ExcelUtility;

public class RegistrationData {
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		
		String path=".\\Resources\\DataDrivenTestData.xlsx";
		
		ExcelUtility excelUtility=new ExcelUtility(path);
		int rows=excelUtility.getRowCount("TestData");
		int columns=excelUtility.getCellCount("TestData", rows);
		Object[][] regData=new Object[rows][columns];
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				regData[i-1][j]=excelUtility.getCellData("TestData", i, j);
			}
		}
		
		return regData;
		
	}

}
