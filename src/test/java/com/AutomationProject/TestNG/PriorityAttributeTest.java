package com.AutomationProject.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityAttributeTest {
	
	
	
	
	@Test(priority=0)
	public void loginTest()
	{
		
		System.out.println("This is login test");
		
	}
	
	@Test(priority=2)
	public void homePageTest()
	{
		
		System.out.println("This is Home Page Test");
		
	}
	
	
	@Test(priority=1,enabled=false)
	public void logoutTest()
	{
		
		System.out.println("This is logoutTest");
		
	}
	

	
	
}
