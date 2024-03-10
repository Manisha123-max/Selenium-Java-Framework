package com.cases.error;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actions.ErrorCheck;
import com.actions.send_keys_input_field;
import com.base.Base;
import com.cases.InwardTest;
import com.cases.Login1;
import com.pageObjects.CompanyKYCPage1;

public class KYCErrorScenarios extends Base {

	private InwardTest inward;
	private send_keys_input_field sendKeys;
	private Login1 loginInstance;
	public ErrorCheck errorcheck;
	WebDriver driver;
	public CompanyKYCPage1 companykycpage1;

	@BeforeTest
	public void beforeLogin() throws IOException {
		inward = new InwardTest();
		inward.InWardtest();
		driver = inward.getDriver();
		sendKeys = new send_keys_input_field(driver);
		inward.InwardCheckbox();
		errorcheck = new ErrorCheck(driver);
		companykycpage1 = new CompanyKYCPage1(driver);
		

	}

	@Test(priority = 0)
	public void panFormatCheck() {
		// WebDriver driver = inward.getDriver();
		//errorcheck = new ErrorCheck(driver);
		

		sendKeys.panNumberExisting("KJHGW123H");

		try {
			errorcheck.checkError("Please enter valid PAN!");
		} catch (Exception e) {
			System.out.println("Please enter valid PAN!");
			driver.navigate().refresh();
		}

	}

	@Test(priority = 1)
	public void companyEmailCheck() throws IOException {
		//inward.InwardCheckbox();
		sendKeys.comapnyEmail("manisha");
		try {
			errorcheck.checkError("Please enter valid E-mail!");
		} catch (Exception e) {
			System.out.println("Please enter valid E-mail!");
			driver.navigate().refresh();
		}

	}

	//@Test
	public void productDescriptionCheck() throws IOException {
		WebDriver driver = inward.getDriver();
		loginInstance.performLogin();

		sendKeys = new send_keys_input_field(driver);
		sendKeys.comapnyEmail("manisha");
	}

	@Test(priority = 2)
	public void gstInCheck() throws IOException {
		WebElement checkbox = driver.findElement(By.id("dontHaveGst"));
		checkbox.click();
		
		sendKeys.gstNumber("07AAECR2979CIF");
		
		try {
			errorcheck.checkError("Please enter valid GST!");
		} catch (Exception e) {
			System.out.println("Please enter valid GST!");
			driver.navigate().refresh();
		}
		
	}

	//@Test
	public void eefcAccountCheck() throws IOException {
		WebDriver driver = inward.getDriver();
		loginInstance.performLogin();

		sendKeys = new send_keys_input_field(driver);
		sendKeys.comapnyEmail("manisha");
	}

}
