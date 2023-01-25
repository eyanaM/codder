package com.Utility.qa;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Baseclass {
	
	public static Properties prop;
	public static WebDriver driver;
	

		public Baseclass() {
			try {
				FileInputStream fls= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\config\\qa\\ConfiFile.properties");
				prop= new Properties();
				prop.load(fls);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
		
		public void initBrowser(){
			
			String Broswerset = prop.getProperty("Browser1");
			
			if(Broswerset.equals("Chrome")) {
				
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe" );
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestData.implicitlyWait));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestData.pageloadTimeWait));
				System.out.println(driver.getWindowHandle());
				System.out.println(driver.getTitle());
			
					
				
			}
			else if(Broswerset.equals("FireFox")) {
				
				
			}
			
		}
		
		
		public static void launchingURL(String URL ){
			driver.get(prop.getProperty("URL"));
			

		}
		
		
	}
	


