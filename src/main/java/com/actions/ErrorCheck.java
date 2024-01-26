package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//public class ErrorCheck extends RuntimeException {
//    
//    private WebDriver driver;
//    private WebDriverWait wait;
//    
//    public ErrorCheck(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver,2);
//    }
//
//    public void throwError(String message) {
//        throw new ErrorCheckException(message);
//    }
//
//    public void checkError(String text) {
//        try {
//            // Find the element containing the text
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), \"" + text + "\")]")));
//
//            // If the element is found, raise a custom exception
//            throwError("Error: "+ text);
//        } catch (org.openqa.selenium.TimeoutException te) {
//            // Element not found, which is the expected behavior
//        }
//    }
//
//    // Custom exception class
//    public static class ErrorCheckException extends RuntimeException {
//        public ErrorCheckException(String message) {
//            super(message);
//        }
//    }
//}








public class ErrorCheck extends RuntimeException {
    
    private WebDriver driver;
    private WebDriverWait wait;
    
    public ErrorCheck(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 2);
    }

    public void throwError(String message) {
        throw new ErrorCheckException(message);
    }

    public void checkError(String text) {
        try {
            // Find the element containing the text
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), \"" + text + "\")]")));

            // If the element is found, raise a custom exception
            throwError("Error: "+ text);
        } catch (org.openqa.selenium.TimeoutException te) {
            // Element not found, which is the expected behavior
        }
    }

    // Custom exception class
    public static class ErrorCheckException extends RuntimeException {
        public ErrorCheckException(String message) {
            super(message);
        }
    }
}
