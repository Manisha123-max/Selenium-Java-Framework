package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actions.ErrorCheck;

public class LoginPage1 {
	
	public WebDriver driver;
	
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
	}
	
	public  void login_page(String email_name, String otp_no) {

        ErrorCheck errorcheck = new ErrorCheck(driver);

        WebElement email = new WebDriverWait(driver, 2).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        
        email.sendKeys(email_name);

        WebElement otp_button = new WebDriverWait(driver, 2).until(ExpectedConditions.presenceOfElementLocated(By.className("ant-btn-primary")));
        
        otp_button.click();

        errorcheck.checkError("Email id is not registered for Karbon Forex. Please drop a note on forex@karboncard.com");

        WebElement otp = new WebDriverWait(driver, 2).until(ExpectedConditions.presenceOfElementLocated(By.id("otp")));
        
        otp.sendKeys(otp_no);
        errorcheck.checkError("Please enter valid OTP!");

        WebElement login_button = new WebDriverWait(driver, 2).until(ExpectedConditions.presenceOfElementLocated(By.className("loginBtn")));
        login_button.click();
        errorcheck.checkError("Incorrect OTP!");
  

        
    }

}
