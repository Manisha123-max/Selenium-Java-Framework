package com.cases;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

import com.base.Base;
import com.pageObjects.CompanyProductPage;
import com.pageObjects.LoginPage;
import java.util.List;

import com.cases.Login;
import com.actions.*;



public class FrontPage extends Base{
public static WebDriver driver;
	public Actions actions;
	private static WebDriverWait wait;
    Login login = new Login();
	private Logger log = LogManager.getLogger(Login.class.getName());
	NotificationHandler notificationAppear = new NotificationHandler(driver);
	
		@BeforeTest
		public void launchBrowser() throws IOException {
			driver = initializeDriver();
			log.info("Driver is initialized.");
			actions = new Actions(driver);
			wait = new WebDriverWait(driver,10);

			login.performLogin();
			notificationAppear.handleNotification();
		}    
}
