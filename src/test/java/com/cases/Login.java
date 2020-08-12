package com.cases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.actions.Actions;
import com.base.Base;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.pageObjects.BookAppointmentPage;

public class Login extends Base {
	
	public WebDriver driver;
	Actions actions;
	
	private Logger log = LogManager.getLogger(Login.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		actions = new Actions(driver);
		log.info("Driver is initialized.");
	}

	@Test
	public void performLogin() {
		
		HomePage hp = new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		BookAppointmentPage ba = new BookAppointmentPage(driver);
		
		actions.navigateTo(prop.getProperty("url"));
		actions.click(hp.getMenuBtn());
		actions.click(hp.getLogin());
		actions.enterText(lp.getUsername(), "John Doe");
		actions.enterText(lp.getPassword(), "ThisIsNotAPassword");
		actions.click(lp.getLoginBtn());
		Assert.assertTrue(ba.getTitle().isDisplayed());
		log.info("Successfully Logged In");

	}

	@DataProvider
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
	}

	@AfterTest
	public void teardown() {
		driver.close();
		log.info("Driver is closed");
	}
}
