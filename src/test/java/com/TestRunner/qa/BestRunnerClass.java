package com.TestRunner.qa;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.qa.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


 @CucumberOptions(features = {"src/test/resource/Features"},
plugin = {"json:target/cucumber.json"},
  glue = "com.StepDeff.qa")//tags = {"@test"})

public class BestRunnerClass extends AbstractTestNGCucumberTests{
	
	 @BeforeTest
		public void startURL() {
			
		 Baseclass test= new Baseclass();
			test.initBrowser();
			
		}
		
		@AfterTest
		public void closedURL() {
			Baseclass test= new Baseclass();
			test.driver.quit();
			
		}
	
	

}
