package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CompanyDocumentsPage {

	public static void main(String[] args) {
	}
		private WebDriver driver;
		
		public CompanyDocumentsPage(WebDriver driver) {
			this.driver = driver;
		}
		
		private By companyPANCard = By.xpath("//*[@id=\"COMPANY_PAN_CARD\"]/div/div/input");
		
		private By companyGSTCertificate = By.xpath("//*[@id=\"GST_CERTIFICATE\"]/div/div/inpute");
		
		private By next = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[2]/div/span[1]/button/span");
		
		private By previous = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[2]/div/span[3]/button/span");

	
	
	// Initializing the Page Objects:
		public CompanyDocumentsPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getCompanyPANCard() {
			return driver.findElement(companyPANCard);
		}
		
		public WebElement getComapnyGSTCertificate() {
			return driver.findElement(companyGSTCertificate);
		}

		public WebElement getNext() {
			return driver.findElement(next);
		}
		
		public WebElement getPrevious() {
			return driver.findElement(previous);
		}


}
