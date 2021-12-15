package com.AutomationProject.MukeshOtwaniSelenium;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisablePopupChrome {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking","enable-automation"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.naukri.com/");
	}

}
