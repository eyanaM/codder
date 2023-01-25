package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.Baseclass;

public class LoginPageLocator extends Baseclass {
	
	public LoginPageLocator() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(id = "email")
	public WebElement Email;
	
	
	@FindBy(id = "passwd")
	public WebElement password;
	
	@FindBy(xpath = "//p[text()='There is 1 error']")
	public WebElement verifyresult;
	
	

	
	
	

}
