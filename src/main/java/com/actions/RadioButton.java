package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButton {
	private WebDriver driver;
	private WebDriverWait wait;

	public RadioButton(WebDriver driver) {
		this.driver = driver;
		// this.wait = new WebDriverWait(driver,10);
		this.wait = new WebDriverWait(driver, 10);
	}

	public void BankAccountType(String BankType) {
		try {

			String BankAccountType = BankType.replaceAll("\\s", "").toLowerCase();
			System.out.println(BankAccountType);
			WebElement radioGroup = driver.findElement(By.id("selectedInwardBankAccountType"));

			List<WebElement> radioButtons = radioGroup.findElements(By.xpath(".//input[@type='radio']"));
			if (BankAccountType.equals("currentaccount")) {
				radioButtons.get(1).click();
				TimeUnit.SECONDS.sleep(1);

			} else if (BankAccountType.equals("eefcaccount")) {
				radioButtons.get(0).click();
				TimeUnit.SECONDS.sleep(1);
			} else {
				System.err.println("Error: Invalid input. Please enter 'Bank Account Type'.");
			}

		} catch (Exception e) {
		}
	}

	public void freelancer(String freelancerType) {
        try {
            
        String freelancer = freelancerType.replaceAll("\\s", "").toLowerCase();
        System.out.println(freelancer);
        WebElement radioGroup = driver.findElement(By.id("freelancer"));

        List<WebElement> radioButtons = radioGroup.findElements(By.xpath(".//input[@type='radio']"));
        // for (WebElement webElement : radioButtons) {
        //     System.out.println(webElement);
        // }
            if (freelancer.equals("yes"))
            {radioButtons.get(0).click();}
            else if (freelancer.equals("no"))
            {radioButtons.get(1).click();}
            else{System.err.println("Error: Invalid input. Please enter 'Freelancrer Type'.");}
            
        } catch (Exception e) { }
    }
	
	
	
}