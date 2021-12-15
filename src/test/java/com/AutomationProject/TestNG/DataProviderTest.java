package com.AutomationProject.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	@Test(dataProviderClass=RegistrationData.class,dataProvider="getData")
	public void registrationForm(String firstName,String lastName,String address,String mail,String phone)
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys(firstName);
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys(lastName);
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys(address);
		driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys(mail);
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys(phone);
		
	}

}
