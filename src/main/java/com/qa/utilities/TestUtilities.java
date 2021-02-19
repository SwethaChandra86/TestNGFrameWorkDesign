package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.TestBase.TestBase;

public class TestUtilities extends TestBase {
	
	
	
	public void takeScreenShotOnFail()
	{
		TakesScreenshot scr=(TakesScreenshot)driver;
		File srcfile=scr.getScreenshotAs(OutputType.FILE);
		File dstfile=new File("C:\\Users\\ckeng\\Desktop\\Eclipse workspace\\TestNGFrameworkDesign\\test-output\\screenshots\\"+System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(srcfile, dstfile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
