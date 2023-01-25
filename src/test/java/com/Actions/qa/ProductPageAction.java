package com.Actions.qa;

import org.testng.Assert;

import com.Locators.qa.ProductPageLocator;

public class ProductPageAction {
	
	
	ProductPageLocator productPageLocator= new ProductPageLocator();
	
public void verifyProductpage() {
	
	
	boolean verifywoman=  productPageLocator.WomenSearchResult.isDisplayed();
	
	Assert.assertTrue(verifywoman);
	
	
}

public void clickdreass() {
	
	productPageLocator.ClickPrintedChiffon.click();
	
	
}

public void clickaddToCart() {
	productPageLocator.clickAddtocart.click();
	

}


public void clickhomeicon() {
	productPageLocator.clickinghomeIcon.click();
	
	
}


}