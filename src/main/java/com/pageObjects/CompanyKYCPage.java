package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CompanyKYCPage {

	public static void main(String[] args) {
		
}

	private WebDriver driver;
	
	public CompanyKYCPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By companyPAN = By.id("legalName");
	
	private By companyLegalName = By.id("website");
	
	private By fetchDetails = By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]/span[text()=\"Fetch Details\"]");
	
	private By website = By.id("website");
	
	private By productDescription = By.id("productDescription");
	
	private By companyEmail = By.id("comapnyEmail");
	
	private By companyGSTNumber = By.id("gstNumber");
	
	private By companyCIN = By.id("cin");
	
	private By companyTypeDropdown = By.className("ant-select-selection-item");
	
	private By importExportCode = By.id("importExportCode");
	
	private By companyTAN = By.id("tan");
	
	// Registered Address
	
	private By addressLine1 = By.id("registeredAddress_addressLineOne");
	
	private By addressLine2 = By.id("registeredAddress_addressLineTwo");
	
	private By countryDropdown = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[4]/div/form/div[8]/div/div/div/div[2]/div/div/div/span[2]/span/svg");
	
	private By state = By.id("registeredAddress_state");
	
	private By city = By.id("registeredAddress_city");
	
	private By pinCode = By.id("registeredAddress_pincode");
	
	// Current account
	
	private By bankName = By.id("bankName");
	
	private By accountNumber = By.id("accountNumber");
	
	private By ifscCode = By.id("ifscCode");
	
	private By next = By.className("ant-btn ant-btn-primary");
	
	
	// EEFC Account
	private By eefcAccountRadiobutton = By.className("ant-radio-input");
	
	private By bankName0 = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[3]/div[1]/label[2]/span[1]/input");
	
	private By accountNumber0 = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[3]/div[1]/label[2]/span[1]/input");
	
	private By swiftBIC = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[3]/div[1]/label[2]/span[1]/input");
	
	private By uploadStatement = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[3]/div[1]/label[2]/span[1]/input");
	
	private By next0 = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[3]/div[1]/label[2]/span[1]/input");
	
	
	
	
	
	
	// Initializing the Page Objects:
	public CompanyKYCPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCompanyPAN() {
		return driver.findElement(companyPAN);
	}
	
	public WebElement getComapnyLegalName() {
		return driver.findElement(companyLegalName);
	}

	public WebElement getFetchDetails() {
		return driver.findElement(fetchDetails);
	}

	public WebElement getWebsite() {
		return driver.findElement(website);
	}
	public WebElement getProductDescription() {
		return driver.findElement(productDescription);
	}
	
	public WebElement getCompanyEmail() {
		return driver.findElement(companyEmail);

	}
	
	public WebElement getCompanyGSTNumber() {
		return driver.findElement(companyGSTNumber);
	}

	public WebElement getCompanyCIN() {
		return driver.findElement(companyCIN);
	}

	public WebElement getCompanyTypeDropdown() {
		return driver.findElement(companyTypeDropdown);
	}

	public WebElement getImportExportCode() {
		return driver.findElement(importExportCode);
	}

	public WebElement getCompanyTAN() {
		return driver.findElement(companyTAN);
	}

	// Registered Address
	
	public WebElement getAddressLine1() {
		return driver.findElement(addressLine1);
	}

	public WebElement getAddressLine2() {
		return driver.findElement(addressLine2);
	}

	public WebElement getCountryDropdown() {
		return driver.findElement(countryDropdown);
	}

	public WebElement getState() {
		return driver.findElement(state);
	}

	public WebElement getCity() {
		return driver.findElement(city);
	}

	public WebElement getPincode() {
		return driver.findElement(pinCode);
	}
   
	// Current account
	
	public WebElement getBankName() {
		return driver.findElement(bankName);
	}
   
	public WebElement getAccountNumber() {
		return driver.findElement(accountNumber);
	}
   
	public WebElement getIFSCCode() {
		return driver.findElement(ifscCode);
	}
   
	public WebElement getNext() {
		return driver.findElement(next);
	}
   
	// EEFC Account
	
	public WebElement getEefcAccountRadiobutton() {
		return driver.findElement(eefcAccountRadiobutton);
	}
   
	
	public WebElement getBankName0() {
		return driver.findElement(bankName0);
	}
   
	public WebElement getAccountNumber0() {
		return driver.findElement(accountNumber0);
	}
   
	public WebElement getSwiftBIC() {
		return driver.findElement(swiftBIC);
	}
   
	public WebElement getUploadStatement() {
		return driver.findElement(uploadStatement);
	}
   
	public WebElement getNext0() {
		return driver.findElement(next0);
	}
   
}

