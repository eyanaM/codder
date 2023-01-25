package com.Locators.qa;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.Baseclass;

public class ProductPageLocator extends Baseclass {
	
	public ProductPageLocator() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(css = "span.lighter")
	public WebElement WomenSearchResult;
	
	@FindBy(xpath = "//p[text()='Printed chiffon knee length dress with tank straps. Deep v-neckline.']")
	public WebElement ClickPrintedChiffon;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div/ul/li[1]/div/h5/a")
	public WebElement clickAddtocart;
	
	
	@FindBy(xpath = "//i[@class='icon-home']")
	public WebElement clickinghomeIcon;
}
