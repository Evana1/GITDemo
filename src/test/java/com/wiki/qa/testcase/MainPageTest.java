package com.wiki.qa.testcase;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wiki.qa.base.TestBase;
import com.wiki.qa.pages.MainPage;

public class MainPageTest extends TestBase {
	
	MainPage mainPage;
	public MainPageTest() {
		super();
		
		
	}
	@BeforeMethod
	public void setUp() {
		initialization();	
		mainPage = new MainPage();
	}
	
	@Test
	public void verifysignbuttonpagetitle() {
		
		mainPage.clickOnSingnInbutton();
		 
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
