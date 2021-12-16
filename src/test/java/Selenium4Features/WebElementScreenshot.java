package Selenium4Features;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationProject.CommonMethods;
import com.AutomationProject.TestNG.Data;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebElementScreenshot {
	
	WebDriver driver;
	
	@Test
	public void screenshotTest() throws IOException
	{
		
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
           
	
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.gmail.com");
		
		WebElement txtUserName=driver.findElement(By.xpath("//input[@type='email']"));
		
		//CommonMethods.webelementScreenshot(driver, txtUserName,"emailElement");
		CommonMethods.webelementScreenshotOldWay(driver, txtUserName, "emailElement");
		
		WebElement btnNext=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		
		//CommonMethods.webelementScreenshot(driver, btnNext,"nextElement");
		CommonMethods.webelementScreenshotOldWay(driver, btnNext, "nextElement");
		
	
	
		
	}
	
	


}
