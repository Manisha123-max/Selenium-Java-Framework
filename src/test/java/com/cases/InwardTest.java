


package com.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.base.Base;
import com.pageObjects.CompanyProductPage;
import com.pageObjects.LoginPage1;
import java.util.List;
import com.actions.*;

public class InwardTest extends Base  {

	
		
		public Actions actions;
		private static WebDriverWait wait;
		public LoginPage1 lp;
		private Login1 loginInstance;
		
		public CustomButtons button;
		public DropDown dropdown;
		public FileUpload fileupload;
		public send_keys_input_field sendKeys;
		private Logger log = LogManager.getLogger(Login.class.getName());
		
		@BeforeTest
	    public void InWardtest() throws IOException {
	        loginInstance = new Login1();
	        loginInstance.launchBrowser(); 
			log.info("Browser launched successfully for KYCPage.");
	    }
		
		@Test
		public void InwardCheckbox() {
			WebDriver driver = loginInstance.getDriver();
			wait = new WebDriverWait(driver,2);
			loginInstance.performLogin();
			WebElement[] checkboxes = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ant-checkbox")))
		               .toArray(new WebElement[0]);

		       // Click the checkboxes
		       checkboxes[0].click(); // Click the InWard Remittance checkbox
		       //checkboxes[1].click(); // Click the OutWard Remittance checkbox
		       checkboxes[2].click(); // Click the Agree term and condition checkbox
		       WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]/span[text()=\"Next\"]")));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", nextButton);
	            nextButton.click();
			

	}

		public WebDriver getDriver() {
			WebDriver driver = loginInstance.getDriver();
			return driver;
			}
		
}   


		        
//		@Test
//		public void InwardCheckbox() {
//			CompanyProductPage cp = new CompanyProductPage (driver);
//			
//			  // Use WebDriverWait to wait for the checkboxes to be present
//		       WebDriverWait wait = new WebDriverWait(driver, 10);
//		       WebElement[] checkboxes = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ant-checkbox")))
//		               .toArray(new WebElement[0]);
//
//		       // Click the checkboxes
//		       /*checkboxes[0].click(); // Click the InWard Remittance checkbox
//		       //checkboxes[1].click(); // Click the OutWard Remittance checkbox
//		       checkboxes[2].click(); // Click the Agree term and condition checkbox
//		       WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(
//	                    By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]/span[text()=\"Next\"]")));
//	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", nextButton);
//	            nextButton.click();*/
//		      
//		       
//		       
//		}
//			          
//}



		