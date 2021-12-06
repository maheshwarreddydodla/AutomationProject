package com.AutomationProject.MukeshOtwaniSelenium;

import java.io.File;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxOptionsDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
	
		FirefoxOptions options=new FirefoxOptions();
		
		ProfilesIni profini=new ProfilesIni();
		FirefoxProfile profile=profini.getProfile("MaheshProfile");
		options.setProfile(profile);
		
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		profile.setPreference("dom.webnotifications.enabled", false);
		
		
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
		
		WebDriver driver=new FirefoxDriver(options);
		
	
		
	}

}
