package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	private WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By signupNow = By.className("MuiButtonBase-root");
	
	private By privateLimitedCompany = By.xpath("//*[@id=\"companyType\"]/div/div[1]/label/span[1]/input");
	
	private By next = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/form/div[2]/button/span");
	
	private By companyPan = By.id("panNumber");
	
	private By fullName = By.id("userName");
	
	private By emailId = By.id("email");
	
	private By phoneNumber = By.id("phoneNumber");
	
	private By designation = By.id("signUpUserRole");
	
	private By director = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/form/div[1]/div[5]/div/div/div[2]/div/div/div/div/span[2]");
	
	private By submit = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/form/div[2]/div/button[2]/span");
	
	
	
	
	// Initializing the Page Objects:
	public SignUpPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSignupNow() {
		return driver.findElement(signupNow);
	}
	
	public WebElement getPrivateLimitedCompany() {
		return driver.findElement(privateLimitedCompany);
	}

	public WebElement getNext() {
		return driver.findElement(next);
	}

	public WebElement getCompanyPAN() {
		return driver.findElement(companyPan);
	}

	public WebElement getYourFullName() {
		return driver.findElement(fullName);
	}

	public WebElement getYourEmailId() {
		return driver.findElement(emailId );
	}

	public WebElement getYourPhoneNumber() {
		return driver.findElement(phoneNumber);
	}

	public WebElement getYourDesignation() {
		return driver.findElement(designation);
}
   

	public WebElement getDirector() {
		return driver.findElement(director);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(submit);

}
}