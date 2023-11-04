package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// All objects should be defined here
	private By email = By.id("email");
	private By sendOTP = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/form/div/div[2]/button");
	private By OTP = By.id("otp");
	private By login = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/form/div/div[4]/button");
	
	
	// All methods should be defined here
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getsendOTP() {
		return driver.findElement(sendOTP);
	}
	public WebElement getOTP() {
		return driver.findElement(OTP);
	}
	public WebElement getlogin() {
		return driver.findElement(login);
	}

}
