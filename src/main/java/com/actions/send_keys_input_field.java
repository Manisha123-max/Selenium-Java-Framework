package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class send_keys_input_field {


    private WebDriver driver;
    private WebDriverWait wait;

    public send_keys_input_field(WebDriver driver) {
        this.driver = driver;
        // this.wait = new WebDriverWait(driver, 1);      
        this.wait = new WebDriverWait(driver, 10);

    }

    public void BrandName(String BrandName) {
        sendKeysById("brand", BrandName);
    }
    public void InvoiceNickname(String name) {
        sendKeysById("newNickName", name);
    }

    public void freeLancername(String name) {
        sendKeysById("legalName", name);
    }

    public void doingBusinessAs(String name) {
        sendKeysById("brand", name);
    }

    public void InvoiceEmail(String email) {
        sendKeysById("email", email);
    }

    public void InvoiceAddressLineOne(String addressLineOne) {
        sendKeysById("addressLineOne", addressLineOne);
    }

    public void InvoiceAddressLineTwo(String addressLineTwo) {
        sendKeysById("addressLineTwo", addressLineTwo);
    }

    public void InvoiceCity(String city) {
        sendKeysById("city", city);
    }

    public void InvoiceState(String state) {
        sendKeysById("state", state);
    }

    public void InvoiceAmount(int amount) {
        sendKeysById("amount", String.valueOf(amount));
    }

    public void InvoiceReceivableAmount(int receivableAmount) {
        sendKeysById("amountMaximumReconcilable", String.valueOf(receivableAmount));
    }

    public void InvoiceNumber(int invoiceNumber) {
        sendKeysById("referenceNumber", String.valueOf(invoiceNumber));
    }

    public void InvoiceCreationDate(String invoiceDate) {
        sendKeysById("invoiceCreationDate", String.valueOf(invoiceDate), Keys.ENTER);
    }

    public void InvoicedueDate(String dueDate) {
        sendKeysById("dueDateOfPayment", String.valueOf(dueDate), Keys.ENTER);
    }

    public void InvoiceReconcileAmount(int amount) {
        try{
            // Locate the input element using XPath
            WebElement amountInput = driver.findElement(By.xpath("//input[@type='number' and @placeholder='Enter amount' and @class='ant-input']"));

            String amount1 = String.valueOf(amount);
            // Send keys to the input field (e.g., sending the integer value 123)
            amountInput.sendKeys(amount1);
        } catch (Exception e) {}
    }
    
    
    


    public void legalName(String legalname) {
        sendKeysById("legalName", legalname);
    }

    

    public void panNumber(String panNumber) {
        sendKeysById("panNumber", panNumber);
    }
    public void panNumberExisting(String panNumber) {
        sendKey("panNumber", panNumber); 
    }
    
    public void panIdNumber(String panNumber) {
        sendKeysById("idNumber", panNumber);
    }

    public void website(String website) {
        sendKeysById("website", website);
    }


    public void productDescription(String productDescription) {
        sendKeysById("productDescription", productDescription);
    }


    public void comapnyEmail(String comapnyEmail) {
        sendKeysById("comapnyEmail", comapnyEmail);
    }


    public void gstNumber(String gstNumber) {
        sendKeysById("gstNumber", gstNumber);
    }


    public void cin(String cin) {
        sendKeysById("cin", cin);
    }


    public void importExportCode(String importExportCode) {
        sendKeysById("importExportCode", importExportCode);
    }


    public void tan(String tan) {
        sendKeysById("tan", tan);
    }


    public void registeredAddress_addressLineOne(String registeredAddress_addressLineOne) {
        sendKeysById("registeredAddress_addressLineOne", registeredAddress_addressLineOne);
    }


    public void registeredAddress_addressLineTwo(String registeredAddress_addressLineTwo) {
        sendKeysById("registeredAddress_addressLineTwo", registeredAddress_addressLineTwo);
    }


    public void registeredAddress_city(String registeredAddress_city) {
        sendKeysById("registeredAddress_city", registeredAddress_city);
    }


    public void registeredAddress_state(String registeredAddress_state) {
        sendKeysById("registeredAddress_state", registeredAddress_state);
    }


    public void registeredAddress_pinCode(String registeredAddress_pinCode) {
        sendKeysById("registeredAddress_pinCode", registeredAddress_pinCode);
    }
    
    public void registeredAddress_country(String countryName) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("registeredAddress_country")));
            
                inputField.sendKeys(countryName);
                inputField.sendKeys(Keys.ENTER);
        
        } catch (Exception e) {}
    }


    public void accountNumber(String accountNumber) {
        sendKeysById("accountNumber", accountNumber);
    }


    public void bankName(String bankName) {
        sendKeysById("bankName", bankName);
    }


    public void ifscCode(String ifscCode) {
        sendKeysById("ifscCode", ifscCode);
    }


    

    public void vendorSelect(String vendorSelect) {
        sendKeysById("vendorSelect", vendorSelect, Keys.ENTER);
    }

    public void purposeOfPayment(int purposeOfPayment) {
        sendKeysById(":r1:", String.valueOf(purposeOfPayment), Keys.ENTER);
    }

    public void name(String name) {
        sendKeysById("name", name);
    }
    public void emailId(String emailId) {
        sendKeysById("emailId", emailId);
    }
    public void pan(String pan) {
        sendKeysById("pan", pan);
    }


    public void vendorDate(int vendorDate) {
        sendKeysById(":r5:", String.valueOf(vendorDate), Keys.ENTER);
    }

    private void sendKeysById(String id, String value, CharSequence... keysToSend) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
            if (inputField.getAttribute("value").isEmpty()) {
                inputField.sendKeys(value);
                inputField.sendKeys(keysToSend);
            } else {
                inputField.sendKeys(Keys.COMMAND + "a", Keys.DELETE);
                inputField.sendKeys(value);
                inputField.sendKeys(keysToSend);
            }
        } catch (Exception e) {
        }
    }

    private void sendKey(String id, String value, CharSequence... keysToSend) {
        try {
            WebElement inputField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
                inputField.sendKeys(Keys.COMMAND+"a");
                inputField.sendKeys(value);
                inputField.sendKeys(keysToSend);
        } catch (Exception e) {
            
        }
    }
}
