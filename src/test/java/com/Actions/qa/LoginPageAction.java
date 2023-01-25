package com.Actions.qa;

import com.Locators.qa.LoginPageLocator;

public class LoginPageAction {
	
	LoginPageLocator loginPageLocator= new LoginPageLocator();
	
	public void username() {
		
		loginPageLocator.Email.sendKeys("rozarioeyana@gmail.com");
		
	}
  public void password() {
	loginPageLocator.password.sendKeys("AP1234!");
}
}
