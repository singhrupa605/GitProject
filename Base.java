package com.cognixia.training.MavenTestNGSelenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	static WebDriver driver;

	public static void setProperties()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Tool\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Tool\\Selenium\\geckodriver.exe");
	}
	
	public static void openBrowser(String browser)
	{
		setProperties();
		if(browser.equalsIgnoreCase("Chrome"))
		{
		 driver = new ChromeDriver(); 
	}
		else if(browser.equalsIgnoreCase("FireFox"))
		{
		  driver = new FirefoxDriver(); 
		}

	}
}
