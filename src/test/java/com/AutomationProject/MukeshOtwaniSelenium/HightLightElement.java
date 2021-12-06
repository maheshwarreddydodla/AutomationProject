package com.AutomationProject.MukeshOtwaniSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.AutomationProject.CommonMethods;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HightLightElement {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement searchBox=driver.findElement(By.xpath("//*[@title='Search']"));
		CommonMethods.highLightElement(driver, searchBox);
		searchBox.sendKeys("facebook");
	}

}
