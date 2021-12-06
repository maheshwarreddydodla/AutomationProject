package com.AutomationProject.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Precedence {
	
	@BeforeSuite
	public void beforeSuite()
	{
		
		System.out.println("This is BeforeSuite");
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("This is BeforeClass");
		
	}
	
	
	
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
	public void registrationTest()
	{
		
		System.out.println("This is RegistrationTest");
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("This is AfterMethod");
		
	}
	
	@AfterTest
	public void afterTest()
	{
		
		System.out.println("This is AfterTest");
		
	}
	
	
	@AfterClass
	public void afterSuite()
	{
		
		System.out.println("This is AfterClass");
		
	}

}
