

package com.cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actions.CustomButtons;
import com.actions.DropDown;
import com.actions.FileUpload;
import com.actions.send_keys_input_field;
import com.base.Base;

public class OwnershipDetails extends Base {
	
	private static WebDriverWait wait;
	public CustomButtons button;
	public FileUpload fileupload;
	public DropDown dropdown;
	public send_keys_input_field sendKeys;

	private DirectorDetails1 directordetail;
	private Login1 loginInstance;

	@BeforeTest
    public void UBOsetup() throws IOException {
        directordetail = new DirectorDetails1();
        directordetail.DirectorSetup();
//      loginInstance = new Login1();
//       loginInstance.launchBrowser(); 
    }

    @Test
    public void UBODetail() {
        directordetail.directorpage();
    	WebDriver driver = directordetail.getDriver();

//    	loginInstance.performLogin();
//    	WebDriver driver = loginInstance.getDriver();
    	
    	
        System.out.println("Inside Ownership Details UBODetail test");
        
		button = new CustomButtons(driver);
		fileupload = new FileUpload(driver);
        fileupload = new FileUpload(driver);
		sendKeys = new send_keys_input_field(driver);
		dropdown = new DropDown(driver);
		
		String panfile = "/Users/manishasinghq/Documents/Testing Material/API Automation.pdf";
		String  Name = "kum";
		button.AddBeneficiaryOwnerDetailButton();
//		button.button("Add Beneficiary Owner Details");
		dropdown.nameList(Name,0);
		dropdown.nationality(2); //type 2 for Foreign National
		fileupload.UBO_PASSPORT(panfile); //UBO_PASSPORT() for Foreign
		button.BeneficiarySubmit();
		
        button.button("Submit");

        System.out.println("Ownership Details UBODetail test completed");
    }
    
    public WebDriver getDriver() {
		WebDriver driver = directordetail.getDriver();
//    	WebDriver driver = loginInstance.getDriver();
		return driver;
		}
    
}
