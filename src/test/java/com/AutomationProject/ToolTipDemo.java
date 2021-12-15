package com.AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement ddAll=driver.findElement(By.xpath("//*[@aria-describedby='searchDropdownDescription']"));
		Actions actions =new Actions(driver);
		actions.clickAndHold(ddAll).build().perform();
		System.out.println(ddAll.getAttribute("title"));
		
	}

}
