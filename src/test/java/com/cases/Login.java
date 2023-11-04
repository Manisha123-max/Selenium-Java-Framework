package com.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actions.Actions;
import com.base.Base;
import com.pageObjects.LoginPage;

public class Login extends Base {
	
	public WebDriver driver;
	public Actions actions;
	
	private Logger log = LogManager.getLogger(Login.class.getName());
	

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized.");
		actions = new Actions(driver);
	}
	

	@Test
	public void performLogin() {
		
		
		LoginPage lp = new LoginPage(driver);
		
		actions.navigateTo(prop.getProperty("url"));
		actions.enterText(lp.getEmail(),"manisha+H@karboncard.com");
		actions.click(lp.getsendOTP());
		actions.enterText(lp.getOTP(), "123456");
		actions.click(lp.getlogin());
		log.info("Successfully Logged In");

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

	@AfterTest
	public void teardown() {
		driver.close();
		log.info("Driver is closed");
	}
}
