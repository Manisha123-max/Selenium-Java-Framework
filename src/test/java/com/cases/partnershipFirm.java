package com.cases;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actions.Actions;
import com.actions.CustomButtons;
import com.actions.DropDown;
import com.actions.ErrorCheck;
import com.actions.FileUpload;
import com.actions.RadioButton;
import com.actions.send_keys_input_field;
import com.pageObjects.CompanyKYCPage1;

public class partnershipFirm {
	public Actions actions;
	private static WebDriverWait wait;
	private Login1 loginInstance;
	private InwardTest inward;
	public ErrorCheck errorcheck;
	public CustomButtons button;
	public DropDown dropdown;
	public FileUpload fileupload;
	public send_keys_input_field sendKeys;
	public RadioButton radiobutton;
	public CompanyKYCPage1 companykycpage1;
	private Logger log = LogManager.getLogger(Login.class.getName());
	Random random = new Random();
	private KYCPage kycPage;
	WebDriver driver;

	@BeforeTest
	public void beforeLogin() throws IOException {
		inward = new InwardTest();
		inward.InWardtest();
		kycPage = new KYCPage();
		log.info("Browser launched successfully for KYCPage.");

	}

	@Test
	public void KYCForm() {
		System.out.println("Inside KYCPage KYCForm test");
		Scanner sc = new Scanner(System.in);

		inward.InwardCheckbox();
		WebDriver driver = inward.getDriver();

		companykycpage1 = new CompanyKYCPage1(driver);
		errorcheck = new ErrorCheck(driver);
		button = new CustomButtons(driver);
		dropdown = new DropDown(driver);
		fileupload = new FileUpload(driver);
		sendKeys = new send_keys_input_field(driver);
		radiobutton = new RadioButton(driver);

		String GSTCheckBox = "No"; // 'yes' to check the gstbox
		String countryName = "india";

		String BankType = "Current Account"; // type 'current account' to switch bank type
		String ifscCode = "ICIC0080101";
		String pan1 = "AAGFE";
		String pan3 = "K";
		String pan2 = String.format("%04d", random.nextInt(1001));
		String pan = pan1 + pan2 + pan3;
		System.out.println("Print pan no :" + pan);
		sendKeys.panNumberExisting(pan);

		errorcheck.checkError("Please enter valid PAN!");
		errorcheck.checkError("PAN already exists!");

		companykycpage1.gstCheckBox(GSTCheckBox);
		sendKeys.gstNumber("07AAECR2979CIF");
		errorcheck.checkError("Please enter valid GST!");

		sendKeys.legalName("sample");
		sendKeys.comapnyEmail("sample@gmail.com");
		sendKeys.website("google.com");
		sendKeys.productDescription("this is my product");
		sendKeys.cin("1234");
		sendKeys.tan("12345");
		sendKeys.importExportCode("1234534");
		sendKeys.registeredAddress_addressLineOne("sample");
		sendKeys.registeredAddress_addressLineTwo("sample2");
		sendKeys.registeredAddress_city("Newyork");
		sendKeys.registeredAddress_state("Washington");

		sendKeys.registeredAddress_pinCode("123456");
		errorcheck.checkError("Enter valid PIN!");
		sendKeys.registeredAddress_country(countryName);

		radiobutton.BankAccountType(BankType);

		sendKeys.bankName("sample bank");

		sendKeys.accountNumber("1245673256" + String.valueOf(random.nextInt(9999999)));
		errorcheck.checkError("Please enter a valid account number!");

		sendKeys.ifscCode("ICIC0080101");
		errorcheck.checkError("Please enter a valid SWIFT/BIC");

		button.button("Next");

		System.out.println("KYCPage KYCForm test completed");

	}

	@Test
	public void directorpage() {

		System.out.println("Inside DirectorDetails1 directorpage test");
		WebDriver driver = inward.getDriver();

		button = new CustomButtons(driver);
		dropdown = new DropDown(driver);
		fileupload = new FileUpload(driver);
		sendKeys = new send_keys_input_field(driver);
		{
/////////////////////////////// 1ST DIRECTOR DETAIL ////////////////////////////////
			button.AddDiorectorButton();
			sendKeys.name("sample");
			sendKeys.emailId("manisha@karboncard.com");
			dropdown.nationality(1); // type 2 for Foreign National
			String panfile = "/Users/manishasinghq/Documents/Testing Material/API Automation.pdf";
			sendKeys.pan("AAACG8115M");

			button.button("Submit");

/////////////////////////////// 1ST DIRECTOR DETAIL ////////////////////////////////
			button.AddDiorectorButton();
			sendKeys.name("sample");
			sendKeys.emailId("manisha@karboncard.com");
			dropdown.nationality(1); // type 2 for Foreign National

			sendKeys.pan("AAACG8115M");

			button.button("Submit");

			button.DirectorNextButton();
			System.out.println("DirectorDetails1 directorpage test completed");
		}
	}
		@Test
	    public void UBODetail() {
			
			System.out.println("Inside Ownership Details UBODetail test");
			WebDriver driver = inward.getDriver();
			button = new CustomButtons(driver);
			fileupload = new FileUpload(driver);
			sendKeys = new send_keys_input_field(driver);
			dropdown = new DropDown(driver);
			//errorcheck = new ErrorCheck(driver);
			//Random random = new Random();
			
			String panfile = "/Users/manishasinghq/Documents/Testing Material/API Automation.pdf";
			String  Name = "kum";
			button.AddBeneficiaryOwnerDetailButton();
//			button.button("Add Beneficiary Owner Details");
			dropdown.nameList(Name,0);
			dropdown.nationality(2); //type 2 for Foreign National
			sendKeys.panIdNumber("AAACG8115M");
//			fileupload.UBO_PASSPORT(panfile); //UBO_PASSPORT() for Foreign
			button.BeneficiarySubmit();
			
	        button.button("Submit");

	        System.out.println("Ownership Details UBODetail test completed");
	        
	        
	}

	public WebDriver getDriver() {
		WebDriver driver = kycPage.getDriver();

		return driver;
	}

}
