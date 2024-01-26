

package com.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.base.Base;
import com.pageObjects.CompanyProductPage;
import java.util.List;
import java.util.Scanner;

import com.actions.*;

public class CompanyDocuments1 extends Base {
	
	private static WebDriverWait wait;
	public CustomButtons button;
	public FileUpload fileupload;
	public ErrorCheck errorcheck ;

	private KYCPage kycPage;
	private Login1 loginInstance;

	@BeforeTest
    public void companysetup() throws IOException {
        kycPage = new KYCPage();
        kycPage.beforeLogin();
//       loginInstance = new Login1();
//        loginInstance.launchBrowser(); 
    }

    @Test
    public void companydecoumet() {
        kycPage.KYCForm();
    	WebDriver driver = kycPage.getDriver();
    	
//    	loginInstance.performLogin();
//    	WebDriver driver = loginInstance.getDriver();
//    	
    	
        System.out.println("Inside CompanyDocuments1 companydecoumet test");
        
		button = new CustomButtons(driver);
		fileupload = new FileUpload(driver);
		errorcheck = new ErrorCheck(driver);

//		sc.next();
		String panfile = "/Users/manishasinghq/Documents/Testing Material/API Automation.pdf";
		fileupload.UploadCompanyPan(panfile);
		errorcheck.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
		fileupload.UploadGSTCertificate(panfile);
		errorcheck.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
		// fileupload.UploadPartnerDeed(panfile);
		// errorcheck.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
		
		button.DocumentNextButton();
		 System.out.println("CompanyDocuments1 companydecoumet test finished");
		
    }
    
    public WebDriver getDriver() {
		WebDriver driver = kycPage.getDriver();
//		WebDriver driver = loginInstance.getDriver();
		
		return driver;
		}
    
}
