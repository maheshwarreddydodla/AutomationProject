package Selenium4Features;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.AutomationProject.CommonMethods;
import com.AutomationProject.TestNG.Data;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BlankTab {
	
	WebDriver driver;
	
	@Test
	public void BlankTab() throws IOException, InterruptedException
	{
		
           WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
           
	
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		
		driver.get("https://www.gmail.com");
		
		System.out.println("Parent window Title"+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
	
		Thread.sleep(10);
		Set<String> windows=driver.getWindowHandles();
		List<String> li=new ArrayList<String>(windows);
		String parentWindow=li.get(0);
		String childWindow=li.get(1);
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println("Parent window Title"+driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
	}
	
	


}
