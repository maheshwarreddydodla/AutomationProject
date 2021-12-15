package com.AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleDropDowns {
	
	@Test
	public void handleMultipleDropDown()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		WebElement ddnoOfEmployees=driver.findElement(By.name("NoOfEmployees"));
		WebElement ddcountries=driver.findElement(By.name("Country"));
		
		CommonMethods.selectOptionFromDropDown(ddnoOfEmployees, "16 - 20");
		CommonMethods.selectOptionFromDropDown(ddcountries, "Australia");
		
		
		
		
	}
}
