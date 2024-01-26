package com.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pageObjects.LoginPage1;
import com.actions.*;


public class Login1 extends Base {
	
	public WebDriver driver;
	public Actions actions;
	public ErrorCheck errorcheck ;
	public NotificationHandler notification;
	public LoginPage1 lp;
	private Logger log = LogManager.getLogger(Login.class.getName());
	

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized.");
		actions = new Actions(driver);
		errorcheck= new ErrorCheck(driver);
		notification=new NotificationHandler(driver);
		lp = new LoginPage1(driver);
		actions.navigateTo(prop.getProperty("url"));

	}
	

	@Test
	public void performLogin() {
        lp.login_page("manisha@karboncard.com", "000111");
//        notification.handleNotification();

	}
	
	public WebDriver getDriver() {
        return driver;
    }
}
