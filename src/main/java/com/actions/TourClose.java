package com.actions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TourClose {
    private WebDriver driver;
    private WebDriverWait wait;

    public TourClose(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);        
        // this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    }

    public  int tourClose() {
        try {
            // WebDriverWait wait = new WebDriverWait(driver, 1);
            // Use WebDriverWait to wait for the button to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-test-id='button-close']"))).click();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    // Additional method for the second Close button
    public  int tourClose2() {
        try {
            // Use WebDriverWait to wait for the button to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-test-id=\"button-primary\" and text()=\"Close\"]"))).click();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

}

