package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.Baseclass;

public class ProfilePageLocator extends Baseclass{
	
	
	
	
	public ProfilePageLocator () {
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(xpath = "//h1[text()='My account']")
	public WebElement loginPage;
	

}
