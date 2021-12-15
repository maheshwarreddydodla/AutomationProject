package com.AutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopulationEvaluation {
	
	
	public static WebElement totalPop;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		totalPop=driver.findElement(By.xpath("//span[@rel='current_population']"));
		
		while(true)
		{
			String current=totalPop.getText();
			String duplicate="";
			if(!current.equals(duplicate))
			{
				System.out.println(current);
			}
	
			
		}
	}

}
