package com.AutomationProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelDropDown {

	@Test
	public void handleDropDown()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		Select ddCountry=new Select(driver.findElement(By.id("input-country")));
		
		//ddCountry.selectByVisibleText("Australia");
		//ddCountry.selectByValue("4");
		//ddCountry.selectByIndex(1);
		
		List<WebElement> countries=ddCountry.getOptions();
		
		for(WebElement element:countries)
		{
			if(element.getText().equals("Cuba"))
					{
				element.click();
				break;
				
					}
		}
		
		
		
	}

}
