package com.StepDeff.qa;

import com.Actions.qa.ContactPageAction;
import com.Actions.qa.HomePageAction;
import com.Actions.qa.LoginPageAction;
import com.Actions.qa.ProductPageAction;
import com.Actions.qa.ProfilePaheAction;
import com.Utility.qa.Baseclass;
import com.Utility.qa.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class StepdeffClass extends Baseclass{
	
	
	
	
	HomePageAction homePageAction = new HomePageAction ();
	ContactPageAction contactPageAction = new ContactPageAction();
	LoginPageAction loginPageAction = new LoginPageAction();
	ProductPageAction productPageAction= new ProductPageAction();
	ProfilePaheAction profilePaheAction = new ProfilePaheAction();
	
	
	
	@Given("^Lunching application <\"([^\"]*)\">$")
	public void lunching_application(String URL) throws Throwable {
		
		launchingURL(URL);
	    
	}
	
	@Then("^click contact us link$")
	public void click_contact_us_link() throws Throwable {
		
		homePageAction.clickContactUs();
		
	}

	@Then("^Verify Contact page display$")
	public void verify_Contact_page_display() throws Throwable {
		
		contactPageAction.VerifyCntactUsDisplay();
	    
	}

	
	

	@Then("^enter woman in search field$")
	public void enter_woman_in_search_field() throws Throwable {
		
		contactPageAction.enetrWomensearch();
	    
		

	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
		contactPageAction.ClickSearchButton();
	    
		
		
	}

	@Then("^Verify search result display$")
	public void verify_search_result_display() throws Throwable {
		productPageAction.verifyProductpage();
		Utility.takeMyScreenshot(driver, "Woman Page");
		
	}

	@Then("^click Printed Chiffon Dress link$")
	public void click_Printed_Chiffon_Dress_link() throws Throwable {
		productPageAction.clickdreass();
		
		
	}

	@Then("^click Add to Cart$")
	public void click_Add_to_Cart() throws Throwable {
		productPageAction.clickaddToCart();
	    
		
	}


	@Then("^click home icon to go back to home page$")
	public void click_home_icon_to_go_back_to_home_page() throws Throwable {
		productPageAction.clickhomeicon();
		
	}

	@Then("^verify  Homepage is display$")
	public void verify_Homepage_is_display() throws Throwable {
		homePageAction.homePageDisplay();
		Utility.takeMyScreenshot(driver, "Product Page");
		
	}

	

	@Then("^click singin$")
	public void click_singin() throws Throwable {
		homePageAction.signin();

		
	    
	}

	@Then("^enter username and password and click signin$")
	public void enter_username_and_password_and_click_signin() throws Throwable {
		
		loginPageAction.username();
		Utility.takeMyScreenshot(driver, "sign in Page");
		
	    
	}

	@Then("^verify user can login$")
	public void verify_user_can_login() throws Throwable {
		loginPageAction.password();
	   Thread.sleep(2000);
		
		
	}





}
