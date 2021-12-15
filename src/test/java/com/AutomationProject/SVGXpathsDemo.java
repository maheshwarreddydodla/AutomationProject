package com.AutomationProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGXpathsDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		List<WebElement> listOfWebElements=driver.findElements(By.xpath("//*[name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='g']//*[name()='rect']"));
		
		
		
		for(WebElement element:listOfWebElements)
		{
			Actions actions=new Actions(driver);
			actions.moveToElement(element).build().perform();
			System.out.println(driver.findElement(By.xpath("//*[name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']")).getText());
		}
		
	}

	

}
