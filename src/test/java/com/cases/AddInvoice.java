package com.cases;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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


public class AddInvoice extends Base  {

	
		
		public Actions actions;
		private Login1 loginInstance;
		private OwnershipDetails owerdetail;
		public ErrorCheck errorcheck ;
		public CustomButtons button;
		public DropDown dropdown;
		public FileUpload fileupload;
		public send_keys_input_field sendKeys;
		public RadioButton radiobutton;
		private Logger log = LogManager.getLogger(Login.class.getName());
		
		@BeforeTest
	    public void beforeLogin() throws IOException {
 		    //owerdetail = new OwnershipDetails();
			//owerdetail.UBOsetup();
			
	        loginInstance = new Login1();
	        loginInstance.launchBrowser(); 
//			
			
	    }
		
		@Test
		public void KYCForm() throws InterruptedException {
			Scanner sc =new Scanner(System.in);
			Random random = new Random();
			
            		//	WebDriver driver = owerdetail.getDriver();
            	//		owerdetail.UBODetail();

		WebDriver driver = loginInstance.getDriver();
			loginInstance.performLogin();

			errorcheck = new ErrorCheck(driver);
			button = new CustomButtons(driver);
			System.out.println("KYCPage");
			dropdown = new DropDown(driver);
			fileupload = new FileUpload(driver);
			sendKeys = new send_keys_input_field(driver);
			radiobutton = new RadioButton(driver);
			
			button.InwardDashBoard();
            
	                ///////////////////// INVOICE Buttons ///////////////////
         button.AddInvoiceButton();
//         // button.ReceivePaymentInward();
	        
//	         
         dropdown.InvoiceNickName(1);
	         
	         //sendKeys.InvoiceNickname("Rohan");
	         /*sendKeys.legalName("john Doe");
	         sendKeys.InvoiceEmail("john.doe@example.com");
	         sendKeys.InvoiceAddressLineOne("sample");        
	         sendKeys.InvoiceAddressLineTwo("sample1");
	         sendKeys.InvoiceCity("sample");
	         sendKeys.InvoiceState("samplestate");
	         dropdown.InvoiceCountry("United States of America");*/
////	         	
//	         ////////////////////// INVOICE DETAILS ///////////////
//	         
	         dropdown.InvoiceCurrency(2);
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
//	         	////////////////// CLAIM PART //////////////////
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
	      

//	         button.InvoiceView(3);
//	        button.InvoiceViewDownload(2);
//	         button.InvoiceViewCloseIcon();        


	        ////////////////// download button //////////////////
	         button.InvoiceDownload(1);

	        //////////////// DELETE BUTTON //////////////////
//	         button.InvoiceDelete(3);
//	         button.InvoiceDeleteYesButton();
			
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
        	 
		//WebDriver driver = owerdetail.getDriver();		
        WebDriver driver = loginInstance.getDriver();


		return driver;
		}
    }