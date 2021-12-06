package com.AutomationProject.TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationProject.Data;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProviderParameterTest {
	
	WebDriver driver;
	
	
	@Test(dataProviderClass=Data.class,dataProvider="getData")
	public void registrationNewUser(String browser,String email,String password)
	{
		if(browser.equals("chrome"))
		{
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
           
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		
		
		
	
		
	
		
	}
	
	


}
