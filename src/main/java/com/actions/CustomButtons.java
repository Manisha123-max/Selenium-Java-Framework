package com.actions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomButtons {
    private WebDriver driver;
    private WebDriverWait wait;

    public CustomButtons(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,25);
    }

    public void button(String buttonText) {
        try {
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(
            		By.xpath(String.format("//button[@class=\"ant-btn ant-btn-primary\"]/span[text()=\"%s\"]", buttonText))));
            		
        	
                                        
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", nextButton);
            nextButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void freeLancerSubmit() {
        try {
            WebElement nextButton = driver.findElement(By.id("ckyc-submit"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", nextButton);
            nextButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void UploadDoc() {
        try {
        	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div[2]/div[2]/div/div[2]/div[2]/form/div[1]/div[8]/button")));
            // System.out.println("InvoiceSubmitButton click");

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
            // System.out.println("InvoiceSubmitButton scroll");
            
            button.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AddBeneficiary() {
        try {
        	WebElement uboButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, \"ant-btn-primary\") and contains(@class, \"ant-btn-block\")]/span[text()=\"Add Beneficiary Owner Details\"]")));
            uboButton.click();
        } catch (Exception e) {
        }
    }
    
    public void BeneficiarySubmit() {
        try {

            WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[2]/div[2]/button"));
                                                                   

            // Click the submit button
            submitButton.click();
        } catch (Exception e) {}
    }
    
    public void SetupSubmit() {
        try {

            WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[2]/div/span[2]/button"));

            // Click the submit button
            submitButton.click();
        } catch (Exception e) {}
    }

    public void invoiceSubmitButton() {
        try {
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"sliderFooter\"]//button[@type=\"submit\"]")));
            // System.out.println("InvoiceSubmitButton click");

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
            // System.out.println("InvoiceSubmitButton scroll");
            
            button.click();
            // System.out.println("InvoiceSubmitButton click");
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void AddInvoiceButton() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(., 'Add Invoice')]")));
            addInvoiceButton.click();
            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

    public void InwardDashBoard() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/aside/div/ul/li[6]/span/a")));
            addInvoiceButton.click();
            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }
    public void OutwardDashBoard() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/aside/div/ul/li[2]/span/a")));
            addInvoiceButton.click();
            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }
    
public void ReceivePaymentInward() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/aside/div/ul/li[3]/span/a")));
            addInvoiceButton.click();
            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

    public void StatementInward() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/aside/div/ul/li[8]/span/a")));
            addInvoiceButton.click();
            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }
    public void InvoiceHereButton() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form/div[1]/div[16]/div[2]/button")));
            addInvoiceButton.click();
            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

    public void InvoiceSubmit() {
        try {
        	TimeUnit.SECONDS.sleep(2);
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/form/div[2]/button")));
        	
            addInvoiceButton.click();
            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

    public void InvoiceClaimSubmit() {
        try {																						 
           
        	WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/button")));
        	
        	// WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("ant-btn")));
             
        	//addInvoiceButton.click();
        	addInvoiceButton.sendKeys(Keys.ENTER);
            TimeUnit.SECONDS.sleep(5);
            
        } catch (Exception e) {}
    }


    

    public void calculatorClose() {
        try {
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div[2]/div[1]/button")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
            button.click();
        } catch (Exception e) {System.out.println("calculator not closed");        }
    }

public void InvoiceClaim(int ButtonNumber) {
        try {
        	driver.navigate().refresh();
            // Find all buttons containing the text "Claim"
        	WebElement body = driver.findElement(By.tagName("body"));
            // Use the Actions class to send the "END" key to the body element
            Actions actions = new Actions(driver);
            actions.sendKeys(body, Keys.END).perform();
            TimeUnit.SECONDS.sleep(1);
        List<WebElement> buttons = driver.findElements(By.xpath("//button[contains(., 'Claim')]"));

        // Check if the specified index is valid
        if (ButtonNumber > 0 && ButtonNumber <= buttons.size()) {
            // Click the button at the specified index
            buttons.get(ButtonNumber-1).click();
        } else {
            System.out.println("Invalid button index");
        }
            
        } catch (Exception e) {}
    }


public void InvoiceView(int ButtonNumber) {
        try {
        	driver.navigate().refresh();
        	WebElement body = driver.findElement(By.tagName("body"));
            // Use the Actions class to send the "END" key to the body element
            Actions actions = new Actions(driver);
            actions.sendKeys(body, Keys.END).perform();
            TimeUnit.SECONDS.sleep(1);
       // List<WebElement> svgElements = driver.findElements(By.className("anticon-eye"));
            List<WebElement> svgElements = driver.findElements(By.xpath("//*[@id=\"Table2XLSX\"]/tbody/tr[1]/td[10]/div/div[1]/span/svg/"));
                                                                         

            // Check if the specified index is valid
            if (ButtonNumber > 0 && ButtonNumber <= svgElements.size()) {
                // Click the element at the specified index
            	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ButtonNumber-1);
                svgElements.get(ButtonNumber-1).click();
            } else {
                System.out.println("Invalid number. number should be less than "+svgElements.size());
            }
            
        } catch (Exception e) {}
    }

public void InvoiceViewCloseButton() {
        try {

        WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div[5]/button"));

                           
        buttonElement.click();

            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

public void InvoiceViewCloseIcon() {
        try {   

        // Locate the <span> element containing the <img> with the specified src attribute
        WebElement spanElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/span/img"));

        // Click the <span> element
        spanElement.click();

        TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

public void InvoiceViewDownload(int ButtonNumber) {
        try {
        	
        
        List<WebElement> svgElements = driver.findElements(By.xpath("//button[@class='ant-btn ant-btn-default' and span[text()='Download']]"));

            // Check if the specified index is valid
            if (ButtonNumber > 0 && ButtonNumber <= svgElements.size()) {
                // Click the element at the specified index
//            	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ButtonNumber-1);
                svgElements.get(ButtonNumber-1).click();
            } else {
                System.out.println("Invalid number. number should be less than "+svgElements.size());
            }
            
        } catch (Exception e) {}
    }





    public void InvoiceDelete(int ButtonNumber) {
        try {
        	driver.navigate().refresh();
        	WebElement body = driver.findElement(By.tagName("body"));
            // Use the Actions class to send the "END" key to the body element
            Actions actions = new Actions(driver);
            actions.sendKeys(body, Keys.END).perform();
            TimeUnit.SECONDS.sleep(1);
        List<WebElement> svgElements = driver.findElements(By.className("anticon-close"));

            // Check if the specified index is valid
            if (ButtonNumber > 0 && ButtonNumber <= svgElements.size()) {
                // Click the element at the specified index
            	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ButtonNumber-1);
                svgElements.get(ButtonNumber-1).click();
            } else {
                System.out.println("Invalid number. number should be less than "+svgElements.size());
            }
            
        } catch (Exception e) {}
    }


    public void InvoiceDownload(int ButtonNumber) {
        try {
        	driver.navigate().refresh();
        	WebElement body = driver.findElement(By.tagName("body"));
            // Use the Actions class to send the "END" key to the body element
            Actions actions = new Actions(driver);
            actions.sendKeys(body, Keys.END).perform();
            TimeUnit.SECONDS.sleep(1);
        	 List<WebElement> svgElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("anticon-download")));

            // Check if the specified index is valid
            if (ButtonNumber > 0 && ButtonNumber <= svgElements.size()) {
            	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", svgElements);
            	//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);",svgElements);
            	// Scroll to the bottom of the page using JavaScript
                
                // Click the element at the specified index
            	
                svgElements.get(ButtonNumber-1).click();
            } else {
                System.out.println("Invalid number. number should be less than "+svgElements.size());
            }
            
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

public void InvoiceDeleteNoButton() {
        try {
            WebElement buttonElement = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-default ant-btn-sm' and span[text()='No']]"));

            buttonElement.click();

            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

public void InvoiceDeleteYesButton() {
        try {
            // Locate the <button> element with the specified class name and text
        WebElement buttonElement = driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-sm' and span[text()='Yes']]"));

        // Click the <button> element
        buttonElement.click();

            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }
    
    

    public void makePayment() {
        try {
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div[2]/div[2]/button")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
            button.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void StatementOutward() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/aside/div/ul/li[4]/span")));
            addInvoiceButton.click();
            TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }


    public void InwardStatementMenu(int MenuNumber) {
        try {
            String Number = String.valueOf(MenuNumber); 
            WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[1]/button[%s]",Number))));
            //*[@id="root"]/div[1]/div/div/main/div[2]/div/div[1]/div[1]/button[1]
            // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", nextButton);
            nextButton.click();
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void InwardStatementReset() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[2]/button[1]")));
            addInvoiceButton.click();
            // TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

    public void OutwardStatementReset() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[2]/div/div[1]/div[2]/button[3]")));
            addInvoiceButton.click();
            // TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }

    public void InwardStatementDownload() {
        try {
            WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[2]/button[3]")));
            Button.click();
            
        } catch (Exception e) {}
    }
    public void OutwardStatementDownload() {
        try {
            WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[2]/div/div[1]/div[2]/button[2]")));
            Button.click();
            
        } catch (Exception e) {}
    }
    
    public void InwardStatementFilter() {
        try {
            // WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[2]/button[2]")));
            // element.click();
            // element.sendKeys(Keys.ENTER);
            // element.sendKeys(Keys.ENTER);

            // Locate the "Filter" button
        WebElement filterButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[2]/button[2]"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform a hover action on the "Filter" button
        actions.moveToElement(filterButton).build().perform();

        // Wait for a moment (optional)
        Thread.sleep(1000);

        
        // Locate and click the "Data" button
        WebElement dataButton = driver.findElement(By.xpath("//button[contains(div[text(), 'Data')]"));
        dataButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void PagesChange(int PageNumber) {
        try {
           WebElement body = driver.findElement(By.tagName("body"));
        // Use the Actions class to send the "END" key to the body element
        Actions actions = new Actions(driver);
        actions.sendKeys(body, Keys.END).perform();
        TimeUnit.SECONDS.sleep(1);
        actions.sendKeys(body, Keys.END).perform();

        String Number = String.valueOf(PageNumber); 
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//li[@class='ant-pagination-item ant-pagination-item-" + Number + "']/a"))));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", nextButton);
        nextButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void DirectorNextButton() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[2]/div/span[1]/button/span")));
            addInvoiceButton.click();
            // TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }
    public void DocumentNextButton() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[2]/div/span[1]/button/span")));
            addInvoiceButton.click();
            // TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
    }
    
    public void AddDiorectorButton() {
        try {
            WebElement addInvoiceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[4]/div/div[2]/button")));
            addInvoiceButton.click();
            // TimeUnit.SECONDS.sleep(2);
            
        } catch (Exception e) {}
}
    public void AddBeneficiaryOwnerDetailButton() {
//        try {
//        	System.out.println("AddBeneficiaryOwnerDetailButton click start..");
//            WebElement addBeneficiaryOwnerDetailButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("ant-btn ant-btn-primary ant-btn-block")));
//                                                                                                       
//            addBeneficiaryOwnerDetailButton.click();
//            System.out.println("AddBeneficiaryOwnerDetailButton click finished..");
//            TimeUnit.SECONDS.sleep(2);
//            
//        } catch (Exception e) {}
    	
    	try {
    		driver.navigate().refresh();
            WebElement addBeneficiary = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div:nth-child(1) > div > div > main > div.MuiContainer-root.MuiContainer-maxWidthLg.MuiContainer-disableGutters.css-1faoqla-MuiContainer-root > div > div.form-bg-area > div.form-space-area > div > div:nth-child(2) > button > span")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addBeneficiary);
            addBeneficiary.click();
        } catch (Exception e) {

        	try {
        		driver.navigate().refresh();
                WebElement addBeneficiary = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div:nth-child(1) > div > div > main > div.MuiContainer-root.MuiContainer-maxWidthLg.MuiContainer-disableGutters.css-1faoqla-MuiContainer-root > div > div.form-bg-area > div.form-space-area > div > div:nth-child(2) > button > span")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addBeneficiary);
                addBeneficiary.click();
            } catch (Exception ee) {
            	System.out.println("button not found");
            }
        }
}

}

