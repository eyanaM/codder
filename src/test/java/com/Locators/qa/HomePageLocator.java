package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.Baseclass;

public class HomePageLocator extends Baseclass {
	
	
	public HomePageLocator() {
		PageFactory.initElements(driver,this);
		
   }
	
 @FindBy(xpath = "//a[text()='Contact us']")
 public WebElement clickContactUs;
 
@FindBy(xpath = "//a[@title='My Store']")
public WebElement homepagedisplay;

@FindBy(xpath = "//a[@title='Log in to your customer account']")
public WebElement clicksignin;






}
