package com.AutomationProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
	
	

	
	public static void highLightElement(WebDriver driver,WebElement element)
	{

		JavascriptExecutor javaScriptExecutor=(JavascriptExecutor)driver;
		
		javaScriptExecutor.executeScript("arguments[0].setAttribute('style','background:yellow;border: 2px solid red;')", element);
		
	}
	
	
	
	public static void webelementScreenshot(WebDriver driver,WebElement element,String fileName) throws IOException
	{
		File src=element.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("./target/Screenshots/"+fileName+".png"));
		
	}
	
	public static void webelementScreenshotOldWay(WebDriver driver,WebElement element,String fileName) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)element;
				
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("./target/Screenshots/"+fileName+".png"));
		
	}

}
