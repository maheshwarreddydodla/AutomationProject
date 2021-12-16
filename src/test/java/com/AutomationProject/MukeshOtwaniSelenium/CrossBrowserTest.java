package com.AutomationProject.MukeshOtwaniSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class CrossBrowserTest {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void verifyPageTitle(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			System.out.println("Driver id not available");
		}
		
		
		driver.get("https://www.gmail.com");
		//Assert.assertEquals("Gmail", driver.getTitle());
		System.out.println(driver.getTitle());
		Assert.assertEquals("Verifying Tilte of Page", "Gmail", driver.getTitle());
		driver.quit();

	}

}
