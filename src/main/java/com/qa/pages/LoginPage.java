package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase {
	
	//page factory or object repository
	
	private By emailid=By.xpath("//input[@id='email_field']");
	private By password=By.xpath("//input[@id='password_field']");
	private By login=By.xpath("//button[normalize-space()='Login to Account']");
	
	//initialization of page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String getLoginTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd)
	{
		driver.findElement(emailid).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);	
		driver.findElement(login).click();
		return new HomePage(); 
	}

}
