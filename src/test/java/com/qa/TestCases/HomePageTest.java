package com.qa.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;
import com.qa.pages.CalculatorPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.ExcelUtility;

public class HomePageTest extends TestBase {
	
	HomePage homeobj;
	CalculatorPage calculatorpageobj;
	LoginPage loginobj=new LoginPage();
	ExcelUtility excelobj=new ExcelUtility();
	
	@BeforeMethod
	public void setUp()
	{
		init_Browser();
		chromeobj.getDriver();
		homeobj=loginobj.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void verifyHomePageHeader()
	{
		String title= homeobj.getHomePageTitle();
		System.out.println("title is "+title);
		Assert.assertEquals("Selenium", title);
		
	}
	
	@Test(priority=2)
	public void clickCalculatorLink()
	{
		calculatorpageobj=homeobj.calculatorClick();
		
	}
	@Test(priority=3,dataProvider = "testDataProvider")
	public void validateNewStudent(String Contactname,String lastname,String address1,
			String address2,String cityname,String coursename ,String districtname,String statename,
			String pincodevalue,String email)
	{
		homeobj.registerNewstudent(Contactname, lastname,address1 ,address2,cityname,coursename,districtname,statename,pincodevalue,email);
	}
	
	@DataProvider(name="testDataProvider")
	public  Object[][] getdata() throws IOException
	{
		Object[][] data=excelobj.Excel("C:\\Users\\ckeng\\Desktop\\Eclipse workspace\\TestNGFrameworkDesign\\resources\\StudentDetails.xlsx", 0);
		return data;
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		chromeobj.quitWebDriver();
	}


}
