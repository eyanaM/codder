package com.Locators.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.qa.Baseclass;

public class ContactPageLocator extends Baseclass {
	
	
	 public ContactPageLocator () {
		 PageFactory.initElements(driver,  this  );
		 
		 
	 }
	 
	 @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
	 public WebElement ContactPage;
	 
	 @FindBy(xpath= "//span[text()='Contact']")
	 public WebElement contactresult;
	 
	 @FindBy(id = "search_query_top")
	 public WebElement searchfield;
	 
	 @FindBy(name = "submit_search")
	 public WebElement searchbutton;
	 
	
	
	

}
