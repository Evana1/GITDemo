package com.wiki.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.TestBase;

public class MainPage extends TestBase{
	
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement login;
		
		
	public MainPage() {
		
		PageFactory.initElements(driver, MainPage.class);
		
	}

	public String validateloginPageTitle() {
		return driver.getTitle();
		
	}
		public void clickOnSingnInbutton() {
			
			login.click();
			
		}
		
	

	

}
