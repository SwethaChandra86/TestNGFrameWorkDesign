package com.qa.DriverFactory;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriver extends DriverManager {
		
	
	public void createWebDriver(String browser) {
		System.out.println("browser type is "+browser);
		if(browser.contentEquals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new org.openqa.selenium.chrome.ChromeDriver();
			driver.manage().window().maximize();
			
		}
		//return driver;
		
	}
	
	public  WebDriver getDriver()
	{
		return driver;
	}

}
