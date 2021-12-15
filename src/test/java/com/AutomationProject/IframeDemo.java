package com.AutomationProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		List<WebElement> listOfFrames=driver.findElements(By.tagName("iframe"));
		WebElement ele=driver.findElement(By.name("iframe_b"));
		
		for(WebElement element:listOfFrames)
		{
			System.out.println(element.getAttribute("name"));
			if(element.getAttribute("name").equals("iframe_b"))
			{
				driver.switchTo().frame(ele);
				driver.findElement(By.id("searchInput")).sendKeys("iframe Testing");
				break;
			}
			
		}
	 // driver.findElement(By.xpath("//input[@name='postCommentSubmit']")).click();
		
		
	}
}
