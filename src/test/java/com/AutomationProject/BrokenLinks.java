package com.AutomationProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<String> urlList=new ArrayList<String>();
		
		for(WebElement element:links)
		{
			//System.out.println(element.getAttribute("href"));
			urlList.add(element.getAttribute("href"));
		}
		
		long startTime=System.currentTimeMillis();
		urlList.parallelStream().forEach(e->{
			
				brokenURL(e);
			
		});
		
		long endTime=System.currentTimeMillis();
		
		System.out.println(endTime-startTime);
		
	}
	
	
	public static void brokenURL(String linkUrl) 
	{
		try
		{
	
		URL url=new URL(linkUrl);
		HttpURLConnection httpUrlConnection=(HttpURLConnection) url.openConnection();
		httpUrlConnection.setConnectTimeout(5000);
		httpUrlConnection.connect();
		
		if(httpUrlConnection.getResponseCode()>=400)
		{
			System.out.println(linkUrl+"Borken URL: "+httpUrlConnection.getResponseMessage());
		}
		else
		{
			System.out.println(linkUrl+" "+httpUrlConnection.getResponseMessage());
		}
		
	}
	
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
		
	}
		
	}	
	
}
