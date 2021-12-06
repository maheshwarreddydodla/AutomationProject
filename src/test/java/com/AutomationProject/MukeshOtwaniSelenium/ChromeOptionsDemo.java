package com.AutomationProject.MukeshOtwaniSelenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
		desiredCapabilities.setAcceptInsecureCerts(true);
		ChromeOptions options= new ChromeOptions();
		//InternetExplorerOptions options=new InternetExplorerOptions();
		//FirefoxOptions options=new FirefoxOptions();
		
		
		options.addExtensions(new File("C:\\Users\\Mahesh\\Downloads\\extension_4_0_5_0.crx"));
		//options.addArguments("--disable-infobars");
		options.setExperimentalOption("excludeSwitches",new String[] { "enable-automation"});
		options.merge(desiredCapabilities);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		
	}

}
