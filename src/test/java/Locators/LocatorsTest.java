package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsTest {
	
	
	@Test
	public void locatorsTest() throws InterruptedException
	
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		
	
		
		//Tag &ID
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("mahesh");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("mahesh");
		
		//Tag & Class
		
		 //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("mahesh");
	     // driver.findElement(By.cssSelector(".inputtext")).sendKeys("mahesh");
		
		
		
	}

}
