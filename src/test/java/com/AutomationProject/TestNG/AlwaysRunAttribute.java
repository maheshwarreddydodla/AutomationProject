package com.AutomationProject.TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlwaysRunAttribute {
	
	
	
	
	@Test(priority=0)
	public void loginTest()
	{
		
		System.out.println("This is login test");
		Assert.assertTrue(false, "Assertion failed");
		
	}
	
	@Test(priority=1,dependsOnMethods="loginTest",alwaysRun=true,enabled=false)
	public void homePageTest()
	{
		
		System.out.println("This is Home Page Test");
		
	}
	

	

	
	
}
