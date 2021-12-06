package Selenium4Features;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationProject.CommonMethods;
import com.AutomationProject.Data;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ReactMethodConcept {
	
	WebDriver driver;
	
	@Test
	public void screenshotTest() throws IOException
	{
		
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
           
	
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		WebElement txtUserName=driver.findElement(By.xpath("//input[@type='email']"));
		
		//Selenium 3
		
		Dimension dim=txtUserName.getSize();
		
		System.out.println(dim.getWidth());
		System.out.println(dim.getHeight());
		
		
		Point point=txtUserName.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());
		
		//Selenium 4
		
		Rectangle react=txtUserName.getRect();
		System.out.println(react.width);
		System.out.println(react.height);
		System.out.println(react.getX());
		System.out.println(react.getY());
		
		
		
		
		
		
	
	
		
	}
	
	


}
