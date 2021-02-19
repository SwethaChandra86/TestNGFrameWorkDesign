package com.qa.TestBase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.DriverFactory.ChromeDriver;
import com.qa.utilities.WebEventListener;

public class TestBase {
	
	public static ConfigReader confobj=new ConfigReader();
	public static Properties prop;
	public static String browsername;
	public static ChromeDriver chromeobj;
	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
		
	public static void init_Browser()
	{
		prop=confobj.init_properties();
		System.out.println("prop hi");
		browsername=prop.getProperty("browser");
		System.out.println(browsername);
		chromeobj=new ChromeDriver();
		chromeobj.createWebDriver(browsername);
		driver=chromeobj.getDriver();
		//create object of eventfiringwebdriver
		e_driver=new EventFiringWebDriver(driver);
	    eventListener=new WebEventListener();
	 // Now create object of EventListerHandler to register it with EventFiringWebDriver
	    
	    e_driver.register(eventListener);
	    driver=e_driver;
	    
		driver.get(prop.getProperty("url"));
		System.out.println("url is "+ prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	    
	
	
}

	
	
	
	
	
	
	
	


