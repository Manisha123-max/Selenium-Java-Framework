package com.cases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import com.actions.Actions;
import com.base.Base;
import com.pageObjects.CompanyProductPage;
import com.pageObjects.LoginPage;
import java.util.List;

public class CompanyKYC extends Base  {

	
		
		public static WebDriver driver;
		public Actions actions;
		private static WebDriverWait wait;
		/*public static void main(String[] args) {
			wait = new WebDriverWait(driver,10);
			launchBrowser();
		}*/
		
		private Logger log = LogManager.getLogger(Login.class.getName());
		private static void button(WebDriver driver, String button_text) {
	        try {
	            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(
	                    By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]/span[text()=\"" + button_text + "\"]")));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", nextButton);
	            nextButton.click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		}
		
		private static void file_upload(WebDriver driver, String file_upload_button_id, String file_path) {
	        try {
	            String file_upload_button_xpath = "//*[@id=\"" + file_upload_button_id + "\"]//input[@type=\"file\"]";
	            WebElement file_upload_button = wait
	                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(file_upload_button_xpath)));
	            file_upload_button.sendKeys(file_path);
	        } catch (Exception e) {
	            // e.printStackTrace();
	            // handle Exception
	        }
		}
		public static void notificationAppear(WebDriver driver) {
	        try {
	            // Wait for the notification to appear
	            WebElement notification = new WebDriverWait(driver, 10)
	                    .until(ExpectedConditions.presenceOfElementLocated(By.className("ant-notification-notice")));

	            // Check if the notification element is not null
	            if (notification != null) {
	                // Notification is present

	                // Locate the close button and click it
	                WebElement closeButton = notification.findElement(By.xpath("//a[@class='ant-notification-notice-close']"));
	                ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", closeButton);
	                closeButton.click();
	            }
	            // else {
	            //     // Notification is not present
	            //     System.out.println("Notification is not present - False");
	            // }
	        } catch (Exception e) {
	            System.out.println("Notification");
	            notificationAppear(driver);
	        }
	    }
		@BeforeTest
		public void launchBrowser() throws IOException {
			driver = initializeDriver();
			log.info("Driver is initialized.");
			actions = new Actions(driver);
			wait = new WebDriverWait(driver,10);

			LoginPage lp = new LoginPage(driver);
			
			actions.navigateTo(prop.getProperty("url"));
			actions.enterText(lp.getEmail(),"manisha@karboncard.com");
			actions.click(lp.getsendOTP());
			actions.enterText(lp.getOTP(), "000111");
			actions.click(lp.getlogin());
			notificationAppear(driver);
			log.info("Successfully Logged In");
		}
		@Test
		public void InwardCheckbox() {
			CompanyProductPage cp = new CompanyProductPage (driver);
			try {
			  // Use WebDriverWait to wait for the checkboxes to be present
		       WebDriverWait wait = new WebDriverWait(driver, 10);
		       WebElement[] checkboxes = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ant-checkbox")))
		               .toArray(new WebElement[0]);

		       // Click the checkboxes
		       //checkboxes[0].click(); // Click the InWard Remittance checkbox
		       //checkboxes[1].click(); // Click the OutWard Remittance checkbox
		       //checkboxes[2].click(); // Click the Agree term and condition checkbox
		       WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(
	                    By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]/span[text()=\"Next\"]")));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", nextButton);
	            nextButton.click();
			} catch (Exception e) {
	            System.out.println("inward");
	        }
		       
		       
		}
		
		private static void send_keys_if_empty(WebDriver driver, String element_id, String value) {
	        try {
			    
	        	WebElement input_field = new WebDriverWait(driver, 1).until(ExpectedConditions.presenceOfElementLocated(By.id(element_id)));

	            // Check if the input field is empty
	            if (input_field != null && input_field.getAttribute("value").isEmpty()) {
	                input_field.sendKeys(value);
	            }
	        } catch (Exception e) {
	            System.out.println(element_id + " = " + value);
	        }
	    }

	    private static void drop_down(WebDriver driver, String id, int down_no) {
	        try {
	            List<WebElement> elements = new WebDriverWait(driver, 2).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(id)));

	            elements.get(0).sendKeys(Keys.ENTER);

	            for (int i = 0; i < down_no; i++) {
	                elements.get(0).sendKeys(Keys.ARROW_DOWN);
	            }

	            elements.get(0).sendKeys(Keys.ENTER);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static void radio_button(WebDriver driver, String radio_text) {
	        radio_text = radio_text.toLowerCase().replace(" ", "");

	        String radio_button_xpath = "";
	        if (radio_text.equals("no")) {
	            radio_button_xpath = "//span[text()=\" NO \"]/preceding-sibling::span[@class=\"ant-radio\"]/input[@type=\"radio\"]";
	        } else if (radio_text.equals("yes")) {
	            radio_button_xpath = "//span[text()=\" YES \"]/preceding-sibling::span[@class=\"ant-radio\"]/input[@type=\"radio\"]";
	        } else if (radio_text.equals("eefcaccount") || radio_text.equals("eefc")) {
	            radio_button_xpath = "//span[text()=\"EEFC Account\"]/preceding-sibling::span[@class=\"ant-radio\"]/input[@type=\"radio\"]";
	        } else if (radio_text.equals("currentaccount") || radio_text.equals("current")) {
	            radio_button_xpath = "//span[text()=\"Current Account\"]/preceding-sibling::span[@class=\"ant-radio\"]/input[@type=\"radio\"]";
	        } else {
	            System.out.println("Invalid user input.");
	        }

	        try {
	            WebElement radioButton = wait
	                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(radio_button_xpath)));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", radioButton);
	            radioButton.click();
	        } catch (Exception e) {
	            // Handle the case where the radio button is already selected
	            System.out.println("The radio button for '" + radio_text + "' is already selected.");
	        }
	    }
		@Test
		public void CompanyKYCPage(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Input = ");
			sc.nextLine();
			CompanyKYC ckyc = new CompanyKYC ();
			Map<String, Integer> company_type = new HashMap<>();
	        company_type.put("privatelimitedcompany", 0);
	        company_type.put("privatelimited", 0);
	        company_type.put("private", 0);
	        company_type.put("publiclimitedcompany", 1);
	        company_type.put("publiclimited", 1);
	        company_type.put("public", 1);
	        company_type.put("partnershipfirm", 2);
	        company_type.put("partnership", 2);
	        company_type.put("llp", 3);
	        
	        
	        Map<String, Integer> business = new HashMap<>();
	        business.put("serviceprovider", 1);
	        business.put("manufacturing", 2);
	        business.put("agri", 3);
	        business.put("ngo", 4);
	        business.put("electronics&telecommunications", 5);
	        business.put("electronics", 5);
	        business.put("telecommunications", 5);
	        business.put("hospitality", 6);
	        business.put("digitalservices", 7);
	        business.put("jewellers", 8);
	        business.put("bullion", 9);
	        business.put("informationtechnology", 10);
	        business.put("retail", 11);
	        business.put("sme", 12);
	        business.put("stockbroker", 13);
	        business.put("transport", 14);
	        business.put("regulator", 15);
	        business.put("financialservices", 16);
	        business.put("financial", 16);
	        business.put("ecommerce", 17);
	        business.put("msme", 18);
	        business.put("realestate", 19);
	        business.put("education", 20);
	        business.put("mining", 21);
	        business.put("aviation", 22);
	        business.put("fintech", 23);
	        business.put("trading", 24);
	        business.put("trading(retail/wholesale)", 24);
	        business.put("trust", 25);
	        business.put("explorationofoil/gas/minerals", 26);
	        business.put("explorationofoil", 26);
	        business.put("explorationof", 26);
	        business.put("shipping", 27);
	        business.put("startup", 28);
	        business.put("other", 29);

	        Map<String, String> kyc_info_inward = new HashMap<>();
	        
	        kyc_info_inward.put("panNumber", "AAACG3555M");
	        kyc_info_inward.put("legalName", "Roy");
	        kyc_info_inward.put("website", "https://google.com/");
	        kyc_info_inward.put("productDescription", "create an online Web Service store");
	        kyc_info_inward.put("comapnyEmail", "manisha@karboncard.com");
	        kyc_info_inward.put("cin", "L45670KA1963GOI001622");
	        kyc_info_inward.put("leiNumber", "335800123456789ABC21");
	        kyc_info_inward.put("dateOfIncorporation", "10/10/2023");
	        kyc_info_inward.put("countryOfIncorporation", "India");
	        kyc_info_inward.put("placeOfIncorporation", "Bengaluru");
	        kyc_info_inward.put("importExportCode", "A12BC78");
	        kyc_info_inward.put("tan", "BLRA23456M");
	        kyc_info_inward.put("registeredAddress_addressLineOne", "indiranagar bangalore");
	        kyc_info_inward.put("registeredAddress_addressLineTwo", "road no. 4, kodihalli");
	        kyc_info_inward.put("registeredAddress_city", "Bangalore");
	        kyc_info_inward.put("registeredAddress_state", "Karnataka");
	        kyc_info_inward.put("registeredAddress_pinCode", "560038");
	        kyc_info_inward.put("bankName", "ICICI");
	        kyc_info_inward.put("accountNumber", "017405008968");
	        kyc_info_inward.put("ifscCode", "ICIC0000174");
	        kyc_info_inward.put("annualTurnOver", "8000000");
	        String countryName = "india";
	        String gst_checkBox = "no"; // type no to give gst number
	        String gstNumber = "07AAECR2971C1Z5";

	        // Radio Buttons
	        String companyType = "Public limited Company"; // your companyType name
	        String business_radio = "yes"; // 2nd option is 'no'
	        String bank_radio = "Current Account"; // 2nd option is 'EEFC Account'
	        String eefc_swift_bic = "westgbav"; // if selected 'EEFC Account'
	        String eefc_file_path = "/Users/manishasinghq/Documents/Testing Material/API Automation.pdf"; // Replace with the actual
	                                                                                           // path to your file
	        radio_button(driver, bank_radio);

	        if (bank_radio.toLowerCase().replace(" ", "").equals("eefcaccount")
	                || bank_radio.toLowerCase().replace(" ", "").equals("eefc")) {
	            kyc_info_inward.put("ifscCode", eefc_swift_bic);
	            String button_id = "EEFC_BANK_ACCOUNT_STATEMENT";
	            file_upload(driver, button_id, eefc_file_path);
	        }

	        try {
	            // Find the Registered_business text by its XPath
	            //WebElement Registed_business = driver.findElement(By.xpath("//div[h4[@class=\"ant-typography\" and text()=\"Business Address\"]]"));
	            radio_button(driver, business_radio);
	            if (business_radio.replace(" ", "").toLowerCase().equals("no")) {
	                kyc_info_inward.put("bussinessAddress_addressLineOne", "indiranagar bangalore");
	                kyc_info_inward.put("bussinessAddress_addressLineTwo", "road no. 4, kodihalli");
	                kyc_info_inward.put("bussinessAddress_city", "bangalore");
	                kyc_info_inward.put("bussinessAddress_state", "Karnataka");
	                kyc_info_inward.put("bussinessAddress_pinCode", "560038");
	                System.out.println("Business add done");
	                List<WebElement> country = wait
	                        .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("bussinessAddress_country")));
	                country.get(0).sendKeys("Lebanon"); // give country name
	                country.get(0).sendKeys(Keys.ENTER);
	            }
	            String natureofbusiness = "Electronics & Telecommunications"; // your nature or business name
	            
	            natureofbusiness = natureofbusiness.replace(" ", "").replace("-", "").toLowerCase();
	            drop_down(driver, "natureOfBussiness", business.get(natureofbusiness));
	            System.out.println("bussiness natrue add done");
	            // OR through NUMBER
	            // drop_down(driver, "natureOfBussiness", 10);
	        } catch (Exception e) {
	            System.out.println("No...1");
	        }

	        try {
	            WebElement gst_label = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), \"We don\'t have GSTIN\")]")));
	            System.out.println("gst label "+gst_label);
	            // Find the checkbox within the label
	            WebElement checkbox = gst_label.findElement(By.xpath("./preceding-sibling::span/input[@type=\"checkbox\"]"));
	            System.out.println("gst check box"+checkbox);
	            // Check if the checkbox is not selected
	            if (!checkbox.isSelected() && gst_checkBox.replace(" ", "").toLowerCase().equals("yes")) {
	                // Click the checkbox to select it
	                System.out.println("clicking...");
	                checkbox.click();
	            } else if (checkbox.isSelected() && gst_checkBox.replace(" ", "").toLowerCase().equals("no")) {
	                // Click the checkbox to select it
	                
	                System.out.println("uncheck and fill gst");
	                checkbox.click();
	                System.out.println("filling gst");
	                send_keys_if_empty(driver, "gstNumber", gstNumber);
	            } else if (checkbox.isSelected() && gst_checkBox.replace(" ", "").toLowerCase().equals("yes"))
	            {
	                System.out.println("yes already selected");
	            }  else {
	            	System.out.println("else gst");
	                send_keys_if_empty(driver, "gstNumber", gstNumber);
	            }
	        } catch (Exception e) {
	            send_keys_if_empty(driver, "gstNumber", gstNumber);
	            System.out.println("GST Error");
	        }

	        for (Map.Entry<String, String> entry : kyc_info_inward.entrySet()) {
	            send_keys_if_empty(driver, entry.getKey(), entry.getValue());
	        }

	        // drop_down Section

	        companyType = companyType.replace(" ", "").toLowerCase();
	        // Check if the text of the element is "LLP"
	        WebElement  span_companyType =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"ant-select-selector\"]//span[@class=\"ant-select-selection-item\"]")));
	        System.out.println("Span Company "+span_companyType+"\n"+span_companyType.getText());
	        if ("LLP".equals(span_companyType.getText())) {
	            drop_down(driver,"companyType", 2);
	        } else if ("Private Limited Company".equals(span_companyType.getText())) {
	        	System.out.println("private limited ");
	            drop_down(driver,"companyType", 5);
	        } else if ("Public Limited Company".equals(span_companyType.getText())) {
	            drop_down(driver,"companyType", 4);
	        } else if ("Partnership Firm".equals(span_companyType.getText())) {
	            drop_down(driver,"companyType", 3);
	        } else if ("--Select--".equals(span_companyType.getText())) {
	            drop_down(driver,"companyType", 1);
	        }
	        drop_down(driver, "companyType", company_type.get(companyType));

	        

	        // Country drop_down

	        List<WebElement> country = wait
	                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("registeredAddress_country")));
	        country.get(0).sendKeys(countryName); // give country name
	        country.get(0).sendKeys(Keys.ENTER);

	        // OR Through Number
	         //drop_down(driver, "registeredAddress_country", 10);

	         //NEXT BUTTON
	        button(driver, "Next");
			}
			
}   

		        