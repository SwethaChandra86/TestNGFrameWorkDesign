package com.qa.DriverFactory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	
	protected WebDriver driver;
	public abstract void createWebDriver(String bowser);
	public void quitWebDriver()
	{
		driver.quit();
	}

}
