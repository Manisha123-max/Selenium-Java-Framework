package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
	
	private ErrorCheck error;
    private WebDriver driver;
    private WebDriverWait wait;

    public FileUpload(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.error = new ErrorCheck(driver);
        // this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    }
    
    public void UploadCompanyPan(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"COMPANY_PAN_CARD\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {
            e.printStackTrace(); // You might want to handle the exception appropriately
        }
    }
    public void EEFC_STATEMENT(String filePath) {
    	try {
            String fileUploadButtonXPath = "//*[@id=\"EEFC_BANK_ACCOUNT_STATEMENT\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {}
        
    }
        public void UploadGSTCertificate(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"GST_CERTIFICATE\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");

        } catch (Exception e) {
            e.printStackTrace(); // You might want to handle the exception appropriately
        }
        }
        public void UploadCertificateOfIncorporation(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"CERTIFICATE_OF_INCORPORATION\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");

        } catch (Exception e) {
             // You might want to handle the exception appropriately
        }
    }
        public void DIRECTOR_PASSPORT(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"DIRECTOR_PASSPORT\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");

        } catch (Exception e) {
            
        }
    }

        public void DIRECTOR_PAN(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"DIRECTOR_PAN\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");

        } catch (Exception e) {}
        }

        public void UBO_PASSPORT(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"UBO_PASSPORT\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");

        } catch (Exception e) {}
        }

        public void UBO_PAN(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"UBO_PAN\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");

        } catch (Exception e) {}
        }

        public void UploadCompanyMOA(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"MOA\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {
            e.printStackTrace(); // You might want to handle the exception appropriately
        }
        }
        public void UploadCompanyAOA(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"AOA\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {
            e.printStackTrace(); // You might want to handle the exception appropriately
        }
        
        }
        public void UploadLLPDeed(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"LLP_DEED\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {
            e.printStackTrace(); // You might want to handle the exception appropriately
        }
    }

    public void UploadPartnerDeed(String filePath) {
        try {
            String fileUploadButtonXPath = "//*[@id=\"PARTNERSHIP_DEED\"]//input[@type=\"file\"]";
            // System.out.println("fileUploadButtonXPath = "+fileUploadButtonXPath);
            WebElement fileUploadButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(fileUploadButtonXPath)));
            fileUploadButton.sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {
            e.printStackTrace(); // You might want to handle the exception appropriately
        }
    }



    public void invoice(String filePath) {
        try {
            // System.out.println(filePath);
            
            wait.until(ExpectedConditions.elementToBeClickable(By.id("invoice")))
                    .sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {
            System.out.println("File not uploaded for invoice");
            e.printStackTrace();
        }
    }
 

    public void vendorInvoice(String filePath) {
        try {
            // System.out.println(filePath);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("s3UrlList-7922"))).sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {
            System.out.println("File not uploaded for Vendor Invoice");
            e.printStackTrace();
        }
    }

    public void uploadmakePayment(String filePath) {
        try {
            // System.out.println(filePath);
            
            wait.until(ExpectedConditions.elementToBeClickable(By.id("document")))
                    .sendKeys(filePath);
            error.checkError("Please remove special characters from file name such as [,(),#,!,@,~,&,$,%,*,/,|,?,<,} and re-upload eg. XYZ.pdf or xyz123 file.pdf");
        } catch (Exception e) {
            System.out.println("File not uploaded for invoice");
            e.printStackTrace();
        }
}
    
    
    
}

