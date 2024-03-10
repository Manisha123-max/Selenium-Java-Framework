package com.cases;

import java.io.IOException;
import java.util.Random;

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
import com.base.Base;
import com.pageObjects.CompanyKYCPage1;

public class freeLancerKYCPage extends Base {

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

	@BeforeTest
	public void beforeLogin() throws IOException {
		inward = new InwardTest();
		inward.InWardtest();

//		        loginInstance = new Login1();
//		        loginInstance.launchBrowser(); 
		log.info("Browser launched successfully for KYCPage.");

	}

	@Test
	public void KYCForm() {
		System.out.println("Inside KYCPage KYCForm test");

		inward.InwardCheckbox();
		WebDriver driver = inward.getDriver();

//				WebDriver driver = loginInstance.getDriver();
//				loginInstance.performLogin();

		companykycpage1 = new CompanyKYCPage1(driver);
		errorcheck = new ErrorCheck(driver);
		button = new CustomButtons(driver);
		dropdown = new DropDown(driver);
		fileupload = new FileUpload(driver);
		sendKeys = new send_keys_input_field(driver);
		radiobutton = new RadioButton(driver);

		String GSTCheckBox = "No"; // 'yes' to check the gstbox
		String countryName = "india";
//		        String companyType = "private limited Company"; // your companyType name
		String BankType = "EEFC Account"; // type 'current account' to switch bank type
		// String ifscCode = "ICIC0080101";
		String SWIFT_BIC = "BBVCFFGG123";
//				String EEfCFilePath = "/Users/manishasinghq/Documents/Testing Material/API Automation.pdf";

//		        button.button("Fetch Details");
//		        errorcheck.checkError("Error fetching details or details not found");

		{
			String pan1 = "FRBPS";
			String pan3 = "B";
			String pan2 = String.format("%04d", random.nextInt(1001));
			String pan = pan1 + pan2 + pan3;
			System.out.println("Print pan no :" + pan);
			sendKeys.panNumber(pan);

			// sendKeys.panNumberExisting("AAACG0763S");
			errorcheck.checkError("Please enter valid PAN!");
			errorcheck.checkError("PAN already exists!");
			
			//driver.navigate().refresh();

			radiobutton.freelancer("no");

			sendKeys.legalName("sample");
			sendKeys.BrandName("sample2");
			sendKeys.comapnyEmail("sample@gmail.com");
			sendKeys.website("www.sample.com");

			companykycpage1.gstCheckBox(GSTCheckBox);
			sendKeys.gstNumber("07AAECR2979CIF");
			errorcheck.checkError("Please enter valid GST!");
			sendKeys.productDescription("this is my product");

			sendKeys.registeredAddress_addressLineOne("sample");
			sendKeys.registeredAddress_addressLineTwo("sample2");
			sendKeys.registeredAddress_city("Newyork");
			sendKeys.registeredAddress_state("Washington");

			sendKeys.registeredAddress_pinCode("123456");
			errorcheck.checkError("Enter valid PIN!");
			sendKeys.registeredAddress_country(countryName);
//				companykycpage1.CompanyType(companyType);

			radiobutton.BankAccountType(BankType);
//				fileupload.EEFC_STATEMENT(EEfCFilePath);
//				errorcheck.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
			sendKeys.bankName("sample bank");
			// sendKeys.accountNumber(("12456732567842222"));
			sendKeys.accountNumber("1245673256" + String.valueOf(random.nextInt(9999999)));
			errorcheck.checkError("Please enter a valid account number!");

			sendKeys.ifscCode(SWIFT_BIC);
			errorcheck.checkError("Please enter a valid SWIFT/BIC");
			// sendKeys.ifscCode(ifscCode);
			// errorcheck.checkError("Please enter a valid IFSC code!");

			button.freeLancerSubmit();

			System.out.println("KYCPage KYCForm test completed");

		}
	}

	public WebDriver getDriver() {
		WebDriver driver = inward.getDriver();
///				WebDriver driver = loginInstance.getDriver();
		return driver;
	}

}
