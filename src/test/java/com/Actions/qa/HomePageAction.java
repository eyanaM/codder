package com.Actions.qa;

import org.testng.Assert;

import com.Locators.qa.HomePageLocator;
import com.Utility.qa.Baseclass;
import com.Utility.qa.TestData;

public class HomePageAction extends Baseclass{
	
	
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	public void clickContactUs() {
		homePageLocator.clickContactUs.click();
		
	}
 
 
 public void homePageDisplay() {
	 boolean verifyHomePage= homePageLocator.homepagedisplay.isDisplayed();
	 Assert.assertTrue(verifyHomePage);
	 
	 
 }
 
 public void signin() {
	 homePageLocator.clicksignin.click();
	 
 }
}
