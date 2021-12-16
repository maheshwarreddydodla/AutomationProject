package com.AutomationProject.TestNG;

import org.testng.annotations.DataProvider;

public class Data {

	
	
	@DataProvider
	public static Object[][] getData()
	{
		Object[][] data=new Object[3][3];
		
		
		data[0][0]="chrome";
		data[0][1]="maheshwerreddy14@gmail.com";
		data[0][2]="Chandana@1996";
		
		data[1][0]="firefox";
		data[1][1]="maheshwerreddy14@gmail.com";
		data[1][2]="Chandana@1996";
		
		data[2][0]="edge";
		data[2][1]="maheshwerreddy14@gmail.com";
		data[2][2]="Chandana@1996";
		
		return data;
		
	}
	
	
}
