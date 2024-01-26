package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class NotificationHandler {
    
    private WebDriver driver;
    private WebDriverWait wait;

    public NotificationHandler(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);        
        // this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));

    }
    public  void handleNotification() {
        try {
            //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            // Wait for the notification to appear
            WebElement notification = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ant-notification-notice")));

            // Check if the notification element is not null
            if (notification != null) {
                // Notification is present

                // Locate the close button and click it
                WebElement closeButton = notification.findElement(By.xpath("//a[@class='ant-notification-notice-close']"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", closeButton);
                closeButton.click();
            }
        } catch (Exception e) {
            System.out.println("Notification handling failed.");
            e.printStackTrace();
        }
    }
}
