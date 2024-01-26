package com.actions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class RadioButton {
    private WebDriver driver;
    private WebDriverWait wait;

    public RadioButton (WebDriver driver) {
        this.driver = driver;
        // this.wait = new WebDriverWait(driver,10);
        this.wait = new WebDriverWait(driver,10);
    }

    public void BankAccountType(String BankType) {
        try {
            
        String BankAccountType = BankType.replaceAll("\\s", "").toLowerCase();
        System.out.println(BankAccountType);
        WebElement radioGroup = driver.findElement(By.id("selectedInwardBankAccountType"));

        List<WebElement> radioButtons = radioGroup.findElements(By.xpath(".//input[@type='radio']"));
            if (BankAccountType.equals("currentaccount"))
            {radioButtons.get(1).click();}
            else if (BankAccountType.equals("eefcaccount"))
            {radioButtons.get(0).click();}
            else{System.err.println("Error: Invalid input. Please enter 'Bank Account Type'.");}
            
        } catch (Exception e) { }
    }
}