package com.pageObjects;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actions.ErrorCheck;

public class CompanyKYCPage1 {
public WebDriver driver;
	
	public CompanyKYCPage1(WebDriver driver) {
		this.driver = driver;
	}
	
    public void gstCheckBox(String check){
    check = check.replaceAll("\\s", "").toLowerCase();
    WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"gstNumber\"]"));
    if (check.equals("yes")){
        if (checkbox.isSelected()) {   } 
        else {checkbox.click();}
    } 
    else if (check.equals("no")){
        if (checkbox.isSelected()) {
        	checkbox.click();
        }
    } }
	
    public void CompanyType(String companyType) {
   	Map<String, Integer> company_type = new HashMap<>();
       company_type.put("privatelimitedcompany", 0);
       company_type.put("privatelimited", 0);
       company_type.put("private", 0);
       company_type.put("publiclimitedcompany", 1);
       company_type.put("publiclimited", 1);
       company_type.put("public", 1);
       company_type.put("partnershipfirm", 2);
       company_type.put("partnership", 2);
       company_type.put("llp", 3);
//        
        
        companyType = companyType.replaceAll("\\s", "").toLowerCase();

        // Wait for the presence of the span element
        WebElement spanCompanyType = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"ant-select-selector\"]//span[@class=\"ant-select-selection-item\"]")));

        
        
            // Perform dropdown selection based on companyType
        if (spanCompanyType.getText().equals("LLP")) {
            drop_down( 2);
        } else if (spanCompanyType.getText().equals("Private Limited Company")) {
            drop_down( 5);
        } else if (spanCompanyType.getText().equals("Public Limited Company")) {
            drop_down( 4);
        } else if (spanCompanyType.getText().equals("Partnership Firm")) {
            drop_down( 3);
        } else if (spanCompanyType.getText().equals("--Select--")) {
            drop_down( 1);
        } 

        Integer value = company_type.get(companyType);
        drop_down(value);

        
    }
    
    public void drop_down(int down_no) {
        WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("companyType"))).get(0);

        element.sendKeys(Keys.ENTER);

        for (int i = 0; i < down_no; i++) {
            element.sendKeys(Keys.ARROW_DOWN);
        }

        element.sendKeys(Keys.ENTER);
    }
    
}


