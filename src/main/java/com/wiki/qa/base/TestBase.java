package com.wiki.qa.base;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wiki.qa.util.TestUtil;

public class TestBase {
	
	 public static WebDriver driver;
	
	static Properties prop;
	
	public TestBase() {
		
		try {
		prop=new Properties();
		FileInputStream  fl = new FileInputStream("C:/Users/Zareef/Documents/wikiTest/src/main/java/com"
				+ "/wiki/qa/confiq/confiq.properties");
		prop.load(fl);
	 
	}catch (IOException e) {
		
		e.printStackTrace();
	}

}
	
	public static void initialization() {
		
		String browsername=prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
			
		
		driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		
	}
	
}
