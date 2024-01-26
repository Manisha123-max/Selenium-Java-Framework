package com.actions;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DropDown {

    private WebDriver driver;
    private WebDriverWait wait;

    public DropDown(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 5);
        // this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    
    public void InvoiceNickName(int nameNo) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nickName")));
            element.sendKeys(Keys.ENTER);

            for (int i = 1; i < nameNo; i++) {
                element.sendKeys(Keys.ARROW_DOWN);
            }
            element.sendKeys(Keys.ENTER);
            TimeUnit.SECONDS.sleep(2);

        } catch (Exception e) {}
    }

    public void InvoiceCurrency(int nameNo) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("currencycode")));
            element.sendKeys(Keys.ENTER);

            for (int i = 1; i < nameNo; i++) {
                element.sendKeys(Keys.ARROW_DOWN);
            }

            element.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void InvoiceCountry(String country) {
        try {
            List<WebElement> countryPath = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("country")));
            countryPath.get(0).sendKeys(country);
            countryPath.get(0).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public void InvoicePurposeCode(String purposeCode) {
        try {
            List<WebElement> purposeCodePath = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("purposeCode")));
            purposeCodePath.get(0).sendKeys(purposeCode);
            purposeCodePath.get(0).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void InvoiceTransactionType(int nameNo) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("transactiontype")));
            element.sendKeys(Keys.ENTER);
            
            for (int i = 1; i < nameNo; i++) {
                element.sendKeys(Keys.ARROW_DOWN);
            }
            
            element.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void docType(int nameNo) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("docType")));
            element.sendKeys(Keys.ENTER);

            for (int i = 1; i < nameNo; i++) {
                element.sendKeys(Keys.ARROW_DOWN);
            }

            element.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nationality(int number) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nationality")));
            element.sendKeys(Keys.ENTER);

            for (int i = 1; i < number; i++) {
                element.sendKeys(Keys.ARROW_DOWN);
            }

            element.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            
        }
    }
    

    public void businessCountry(String country) {
        try {
            List<WebElement> countryPath = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("bussiness_country")));
            countryPath.get(0).sendKeys(country);
            countryPath.get(0).sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


   public  void nameList(String name, int use) {
        try {
            if (use == 1) {
                use = 1;
            } else {
                use = 0;
            }
            List<WebElement> element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("name")));
            element.get(0).sendKeys(Keys.ENTER);

            List<WebElement> namesElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.ant-select-item-option")));
            Map<String, String> namesDict = new HashMap<>();

            for (int idx = 0; idx < namesElements.size(); idx++) {
                String nameId = String.valueOf(idx);
                String content = namesElements.get(idx).findElement(By.className("ant-select-item-option-content")).getText();
                namesDict.put(nameId, content.toLowerCase().replace(" ", ""));
            }

            int name_count=0;
            for (Map.Entry<String, String> entry : namesDict.entrySet()) {
                if (entry.getValue().equals(name.replace(" ", "").toLowerCase())) {
                    System.out.println(name);
                    for (int i = 0; i < Integer.parseInt(entry.getKey()); i++) {
                        element.get(0).sendKeys(Keys.ARROW_DOWN);
                    }
                    element.get(0).sendKeys(Keys.ENTER);
                    name_count=0;
                    break;
                }
                name_count++;
            }
            if (name_count!=0) {
                WebElement inputElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input.ant-input[placeholder=\"Enter Here\"]")));
                inputElement.sendKeys(name);
                WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class=\"ant-btn ant-btn-primary\"]/span[text()=\"Add\"]")));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addButton);
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addButton);

                for (int i = 0; i < namesDict.size() + use; i++) {
                    element.get(0).sendKeys(Keys.ARROW_DOWN);
                }
                element.get(0).sendKeys(Keys.ENTER);
            }
        } catch (Exception e) {
            // Handle exception
        }
    } 


    
}
