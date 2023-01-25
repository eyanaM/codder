package com.Actions.qa;

import org.testng.Assert;

import com.Locators.qa.ContactPageLocator;
import com.Utility.qa.Baseclass;
import com.Utility.qa.TestData;

public class ContactPageAction extends Baseclass{
	
	
	ContactPageLocator contactPageLocator = new ContactPageLocator();
	
	public void VerifyCntactUsDisplay() {
		
		boolean verifyContactUs= contactPageLocator.ContactPage.isDisplayed();
		Assert.assertTrue(verifyContactUs);
		
	}
public void enetrWomensearch() {
		
	contactPageLocator.searchfield.sendKeys(TestData.WomanTestSearch);
		
			
		
	}
public void ClickSearchButton() {
	contactPageLocator.searchbutton.click();
	 
	 
}

}
