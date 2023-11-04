package com.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actions.Actions;
import com.base.Base;
import com.codoid.products.fillo.Select;
import com.pageObjects.SignUpPage;

public class SignUpPageTest extends Base {
	
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
	public void performSignUp() {
		
		SignUpPage su = new SignUpPage(driver);
		PageFactory.initElements(driver, SignUpPage.class);
		
		actions.navigateTo(prop.getProperty("url"));
		actions.click(su.getSignupNow());
		actions.click(su.getPrivateLimitedCompany());
		actions.click(su.getNext());
		actions.enterText(su.getCompanyPAN(),"AAACG3665M");
		actions.enterText(su.getYourFullName(),"Rommy");
		actions.enterText(su.getYourEmailId(),"rommy@gmail.com");
		actions.enterText(su.getYourPhoneNumber(),"8368259816");
		//actions.click(su.getSubmit());
		
		//WebElement dropdownlist = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/form/div[1]/div[5]/div/div/div[2]/div/div/div/div"));
		//actions.selectFromDropdown(su.getDirector(),"Director");
		
		/*actions.click(hp.getLogin());
		actions.enterText(Su.(), data.get("Username"));
		actions.enterText(lp.getPassword(), data.get("Password"));
		actions.click(lp.getLoginBtn());
		Assert.assertTrue(ba.getTitle().isDisplayed()); 
		log.info("Successfully Logged In");*/
}
	}
