package com.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.DriverFactory.ChromeDriver;
import com.qa.TestBase.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginTest extends TestBase {
	
	LoginPage loginobj=new LoginPage();
	HomePage homeobj;
	
	@BeforeMethod
	public void setUp()
	{
		init_Browser();
		chromeobj.getDriver();
	}
	
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=loginobj.getLoginTitle(); 
		Assert.assertEquals("Selenium", title);
		
	}
	
	@Test(priority=2)
	public void loginToApp()
	{
		homeobj=loginobj.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		chromeobj.quitWebDriver();
	}

}
