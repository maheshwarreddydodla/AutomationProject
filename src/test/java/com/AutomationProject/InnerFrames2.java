package com.AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrames2 {
	
	public class InnerFrames {
		
		
		@Test
		public void innerFrameTest2()
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
			
			driver.switchTo().frame("iframeResult");
			driver.switchTo().frame(0);
			System.out.println(driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText());
			driver.switchTo().parentFrame();
			System.out.println(driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']")).getText());
			
		}
	}


}
