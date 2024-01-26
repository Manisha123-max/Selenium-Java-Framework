package com.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pageObjects.LoginPage;
import com.actions.*;


public class Login extends Base {
	
	public WebDriver driver;
	public Actions actions;
	public ErrorCheck errorcheck ;
	public NotificationHandler notification;
	public LoginPage lp;
	private Logger log = LogManager.getLogger(Login.class.getName());
	

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized.");
		actions = new Actions(driver);
		errorcheck= new ErrorCheck(driver);
		notification=new NotificationHandler(driver);
		lp = new LoginPage(driver);
		actions.navigateTo(prop.getProperty("url"));
	}
	

	@Test
	public void performLogin() {
		
		actions.enterText(lp.getEmail(),"manisha@karboncard.com");
		actions.click(lp.getsendOTP());
		errorcheck.checkError("Email id is not registered for Karbon Forex. Please drop a note on forex@karboncard.com");
		actions.enterText(lp.getOTP(), "000111");
		errorcheck.checkError("Please enter valid OTP!");
		actions.click(lp.getlogin());
		errorcheck.checkError("Incorrect OTP!");
		log.info("Successfully Logged In");
		//notification.handleNotification();
	}
 
	/*@DataProvider
	public Object[][] getData() {
		// Each row is set of test data for a test case
		// Each column is a value in a set of test data
		Object[][] data = new Object[2][2];

		// First set of test data
		data[0][0] = "John Doe";
		data[0][1] = "ThisIsNotAPassword";

		// Second set of test data
		data[1][0] = "testuser2";
		data[1][1] = "testpwd2";

		return data;
	}*/

	/*@AfterTest
	public void teardown() {
		driver.close();
		log.info("Driver is closed");
	}*/
	
	/*@AfterTest
	public void logout() {
		driver.close();
		log.info("Driver is closed");
	}*/
}
