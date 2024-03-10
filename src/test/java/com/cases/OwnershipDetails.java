

package com.cases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actions.CustomButtons;
import com.actions.DropDown;
import com.actions.ErrorCheck;
import com.actions.FileUpload;
import com.actions.send_keys_input_field;
import com.base.Base;
import java.util.Random;

public class OwnershipDetails extends Base {
	
	private static WebDriverWait wait;
	public CustomButtons button;
	public FileUpload fileupload;
	public DropDown dropdown;
	public send_keys_input_field sendKeys;
	public ErrorCheck errorcheck;
	private DirectorDetails1 directordetail;
	private Login1 loginInstance;
	private static final String PARTNERSHIP_PAN_TYPE = "partnership";
	private static final String LLP_PAN_TYPE = "llp";
	private static final String SOLEPROPRIETOR_PAN_TYPE = "soleproprietor";
	private static final String PVTLTD_PAN_TYPE = "privateltd";

	@BeforeTest
    public void UBOsetup() throws IOException {
        directordetail = new DirectorDetails1();
        directordetail.DirectorSetup();
//      loginInstance = new Login1();
//       loginInstance.launchBrowser(); 
    }

    @Test
    public void UBODetail() {
    	String panType = LLP_PAN_TYPE;
        directordetail.directorpage(panType);
    	WebDriver driver = directordetail.getDriver();

//    	loginInstance.performLogin();
//    	WebDriver driver = loginInstance.getDriver();
    	
    	
        System.out.println("Inside Ownership Details UBODetail test");
        
		button = new CustomButtons(driver);
		fileupload = new FileUpload(driver);
        fileupload = new FileUpload(driver);
		sendKeys = new send_keys_input_field(driver);
		dropdown = new DropDown(driver);
		errorcheck = new ErrorCheck(driver);
		Random random = new Random();
		
		String panfile = "/Users/manishasinghq/Documents/Testing Material/API Automation.pdf";
		String  Name = "kum";
		button.AddBeneficiaryOwnerDetailButton();
//		button.button("Add Beneficiary Owner Details");
		dropdown.nameList(Name,0);
		dropdown.nationality(2); //type 2 for Foreign National
		sendKeys.panIdNumber("AAACG8115M");
//		fileupload.UBO_PASSPORT(panfile); //UBO_PASSPORT() for Foreign
		button.BeneficiarySubmit();
		
        button.button("Submit");

        System.out.println("Ownership Details UBODetail test completed");
        
        
        
        
///////////////////////////////////// ADD INVOICE PAGE ///////////////////////////////
        
        
        button.InwardDashBoard();
        
        ///////////////////// INVOICE Buttons ///////////////////
		button.AddInvoiceButton();
		//// button.ReceivePaymentInward();
		
		
		dropdown.InvoiceNickName(1);
		
		 ///////////////////////// If NickName selected Other /////////////////////////////
		
		 //sendKeys.InvoiceNickname("Rohan");
		 /*sendKeys.legalName("john Doe");
		 sendKeys.InvoiceEmail("john.doe@example.com");
		 sendKeys.InvoiceAddressLineOne("sample");        
		 sendKeys.InvoiceAddressLineTwo("sample1");
		 sendKeys.InvoiceCity("sample");
		 sendKeys.InvoiceState("samplestate");
		 dropdown.InvoiceCountry("United States of America");*/
		
		// ////////////////////// INVOICE DETAILS ///////////////
		
		 dropdown.InvoiceCurrency(0);
		 sendKeys.InvoiceAmount(250);
		 sendKeys.InvoiceReceivableAmount(50);
		 dropdown.InvoicePurposeCode("p0103");
		 fileupload.invoice("/Users/manishasinghq/Documents/Testing Material/API Automation.pdf");
		 sendKeys.InvoiceNumber(random.nextInt(9999999));
		// sendKeys.InvoiceNumber(6464565);
		dropdown.InvoiceTransactionType(0);
		 sendKeys.InvoiceCreationDate("11/01/2024");
		 sendKeys.InvoicedueDate("05/02/2024");
		 button.InvoiceSubmit();
		 button.calculatorClose();
		 
		// button.PagesChange(2);
		// 	////////////////// CLAIM PART //////////////////
		 button.InwardDashBoard();
		 button.InvoiceClaim(1);
		 errorcheck.checkError("No Amount");
		 sendKeys.InvoiceReconcileAmount(50);
		 button.InvoiceClaimSubmit();
		 System.out.print("Claim Done");
		//    
		//////////// VIEW BUTTON //////////////////
		
		button.InvoiceView(1);
		button.InvoiceViewCloseIcon();  
		 //button.InvoiceViewCloseButton();
		// button.calculatorClose();    
		
		
		// button.InvoiceView(3);
		//button.InvoiceViewDownload(2);
		// button.InvoiceViewCloseIcon();        
		
		
		////////////////// download button //////////////////
		 button.InvoiceDownload(1);
		
		//////////////// DELETE BUTTON //////////////////
		// button.InvoiceDelete(3);
		// button.InvoiceDeleteYesButton();
		
		 button.StatementInward();
		///////////////// Statements Menu //////////////////
		button.InwardStatementMenu(1);
		button.InwardStatementMenu(2);
		button.InwardStatementMenu(3);
		button.InwardStatementMenu(4);
		button.InwardStatementMenu(5);
		button.InwardStatementMenu(6);
		button.InwardStatementMenu(1);
		button.PagesChange(2);
		button.InwardStatementReset();
		button.InwardStatementFilter();
		button.InwardStatementDownload();
    }
    
    public WebDriver getDriver() {
		WebDriver driver = directordetail.getDriver();
//    	WebDriver driver = loginInstance.getDriver();
		return driver;
		}
    
}
