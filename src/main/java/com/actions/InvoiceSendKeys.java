package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvoiceSendKeys {

    private WebDriver driver;
    private WebDriverWait wait;

    public InvoiceSendKeys(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 2);        
        // this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    }

    public void invoiceButton() {
        try {
            WebElement addInvoiceButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(., \"Add Invoice\")]")));
            addInvoiceButton.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Select Name
    public void nameDropDown(int nameNo) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nickName")));
            element.sendKeys(Keys.ENTER);

            for (int i = 1; i < nameNo; i++) {
                element.sendKeys(Keys.ARROW_DOWN);
            }

            element.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
