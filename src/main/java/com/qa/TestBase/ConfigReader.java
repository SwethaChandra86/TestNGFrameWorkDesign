package com.qa.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader {
	
	public Properties prop;
	
	
	public Properties init_properties()
	{
		prop=new Properties();
		System.out.println("hi");
		String filepath=(System.getProperty("user.dir")+"\\resources\\config.properties");
		System.out.println(filepath);
		try {
			FileInputStream fis=new FileInputStream(filepath);
			try {
				prop.load(fis);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return prop;
		
	}

}
