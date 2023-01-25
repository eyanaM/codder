package com.Actions.qa;

import org.testng.Assert;

import com.Locators.qa.ProfilePageLocator;

public class ProfilePaheAction {

	ProfilePageLocator profilePageLocator= new ProfilePageLocator();
	
	
	public void UserprofilePage() {
	boolean profilepage =	 profilePageLocator.loginPage.isDisplayed();
		Assert.assertTrue(profilepage);
}
}