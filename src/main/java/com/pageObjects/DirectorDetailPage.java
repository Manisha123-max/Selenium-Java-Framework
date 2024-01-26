package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DirectorDetailPage {

	public static void main(String[] args) {
		
	}
		private WebDriver driver;
		
		public DirectorDetailPage(WebDriver driver) {
			this.driver = driver;

	}
		
        private By directorName = By.id("name");
		
		private By directorEmailid = By.id("emailId");
		
		private By directorNationalityDropdown = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/span[2]/span/svg");
		
		private By directorNationality1 = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/div/span[2]");
		
		private By directorNationality2 = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/div/span[2]");
		
		private By directorPANDocument = By.xpath("//*[@id=\"DIRECTOR_PAN\"]/div/div/input");
		
		private By directorPassportDocument = By.xpath("//*[@id=\\\"DIRECTOR_PASSPORT\\\"]/div/div/input");
		
		private By cancel = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[4]/button[1]/span");
		
		private By submit = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[4]/button[2]/span");
		
		// Initializing the Page Objects:
				public DirectorDetailPage() {
					
					PageFactory.initElements(driver, this);
				}
				
				public WebElement getDirectorName() {
					return driver.findElement(directorName);
				}
				
				public WebElement getDirectorEmailid() {
					return driver.findElement(directorEmailid);
				}

				public WebElement getDirectorNationalityDropdown() {
					return driver.findElement(directorNationalityDropdown);
				}
				
				public WebElement getDirectorNationality1() {
					return driver.findElement(directorNationality1);
				}


				public WebElement getDirectorNationality2() {
					return driver.findElement(directorNationality2);
				}

				public WebElement getDirectorPANDocuments() {
					return driver.findElement(directorPANDocument);
				}

				
				public WebElement getDirectorPassportDocument() {
					return driver.findElement(directorPassportDocument);
				}

				
				public WebElement getCancel() {
					return driver.findElement(cancel);
				}

				
				public WebElement getSubmit() {
					return driver.findElement(submit);
				}

		}



