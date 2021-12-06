package com.AutomationProject.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Precedence2 {
	
	
	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("This is BeforeTest");
		
	}
	@BeforeMethod
	public void beforeMethid()
	{
		
		System.out.println("This is BeforeMethod");
		
	}
	
	@Test
	public void loginTest()
	{
		
		System.out.println("This is login test");
		
	}
	
	@Test
	public void homePageTest()
	{
		
		System.out.println("This is Home Page Test");
		
	}
	
	
	@Test
	public void logoutTest()
	{
		
		System.out.println("This is logoutTest");
		
	}
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("This is AfterMethod");
		
	}
	
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("This is afterTest");
		
	}
	
	
}
