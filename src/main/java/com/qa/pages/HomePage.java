package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.TestBase.TestBase;

public class HomePage extends TestBase {

	private By homepageLabel=By.xpath("//label[normalize-space()='Name']");
	private By calclink=By.xpath("//a[normalize-space()='Calculator']");
	private By name=By.xpath("//input[@id='name']");
	private By fathername=By.xpath("//input[@id='lname']");
	private By posaddress=By.xpath("//input[@id='postaladdress']");
	private By peraddress=By.xpath("//input[@id='personaladdress']");
	private By gender=By.xpath("//div[@class='container']//form");
	private By city=By.xpath("//select[@id='city']");
	private By course=By.xpath("//select[@id='course']");
	private By district=By.xpath("//select[@id='district']");
	private By state=By.xpath("//select[@id='state']");
	private By pincode=By.xpath("//input[@id='pincode']");
	private By emailid=By.xpath("//input[@id='emailid']");
	private By submit=By.xpath("//button[normalize-space()='Submit']");

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

	public CalculatorPage calculatorClick()
	{
		driver.findElement(calclink).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return new CalculatorPage();
	}

	public String getHomePageTitle()
	{
		String title=driver.getTitle();

		return title;
	}
	public void registerNewstudent(String Contactname,String lastname,String address1,
			String address2,String cityname,String coursename,String districtname,String statename,
			String pincodevalue,String email)
	{
		driver.findElement(name).sendKeys(Contactname);
		driver.findElement(fathername).sendKeys(lastname);
		driver.findElement(posaddress).sendKeys(address1);
		driver.findElement(peraddress).sendKeys(address2);
		driver.findElement(gender).click();
		Select selobj1=new Select(driver.findElement(city));
		selobj1.selectByVisibleText(cityname);
		Select selobj2=new Select(driver.findElement(course));
		selobj2.selectByVisibleText(coursename);
		Select selobj3=new Select(driver.findElement(district));
		selobj3.selectByVisibleText(districtname);
		Select selobj4=new Select(driver.findElement(state));
		selobj4.selectByVisibleText(statename);
		driver.findElement(pincode).sendKeys(pincodevalue);
		driver.findElement(emailid).sendKeys(email);
		driver.findElement(submit).click();
	}

}
