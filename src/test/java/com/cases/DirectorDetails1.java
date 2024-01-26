



package com.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.base.Base;

import com.actions.*;

public class DirectorDetails1 extends Base {
	
    
	private static WebDriverWait wait;
		
	
	public CustomButtons button;
	public DropDown dropdown;
	public FileUpload fileupload;
	public send_keys_input_field sendKeys;
	
	private CompanyDocuments1 companydoc;
	private Login1 loginInstance;

    @BeforeTest
    public void DirectorSetup() throws IOException {
       companydoc = new CompanyDocuments1();
        companydoc.companysetup();
   	
//    	loginInstance = new Login1();
//        loginInstance.launchBrowser(); 
    }

    @Test
    public void directorpage() {
    	 System.out.println("Inside DirectorDetails1 directorpage test");
        companydoc.companydecoumet();
        WebDriver driver = companydoc.getDriver();
    	
//    	loginInstance.performLogin();
//    	WebDriver driver = loginInstance.getDriver();
        
		button = new CustomButtons(driver);
		dropdown = new DropDown(driver);
		fileupload = new FileUpload(driver);
		sendKeys = new send_keys_input_field(driver);
		
		button.AddDiorectorButton();
		sendKeys.name("sample");
		sendKeys.emailId("manisha@karboncard.com");
		dropdown.nationality(1); //type 2 for Foreign National
		String panfile = "/Users/manishasinghq/Documents/Testing Material/API Automation.pdf";
		sendKeys.pan("AAACG8115M");
		fileupload.DIRECTOR_PAN(panfile); //DIRECTOR_PASSPORT() for Foreign National
		button.button("Submit");
		button.DirectorNextButton();
		System.out.println("DirectorDetails1 directorpage test completed");
    }
    
    public WebDriver getDriver() {
		WebDriver driver = companydoc.getDriver();
//		WebDriver driver = loginInstance.getDriver();
		
		return driver;
		}
    
}
