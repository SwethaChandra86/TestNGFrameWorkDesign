package com.qa.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.qa.TestBase.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("before navigating to "+url);
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("after navigated to "+url);
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("navigating back to previous page");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("before navigating to next page");
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("navigated forward to next page");
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("trying to find element by "+by.toString());
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("found element by "+by.toString());
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("before clicking on to "+element.toString());
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println(" clicked on to "+element.toString());
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println(" element value changed to "+element.toString()+" before any changes made");
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println(" element value changed to "+element.toString()+" after any changes made");
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occured " +error);
		TestUtilities tobj=new TestUtilities();
		tobj.takeScreenShotOnFail();
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

}
