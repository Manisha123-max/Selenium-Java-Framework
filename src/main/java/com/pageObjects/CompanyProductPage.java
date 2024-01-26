package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CompanyProductPage {

	public static void main(String[] args) {
		
	}
		private WebDriver driver;
		
		public CompanyProductPage(WebDriver driver) {
			this.driver = driver;
		}
		
		private By inwardCheckbox = By.xpath("/html/body/div/div[1]/div/div/main/div[2]/div/div[1]/div[3]/div[1]/label[1]/span[1]/input");
		                                     
		private By outwardCheckbox = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[3]/div[1]/label[2]/span[1]/input");
		
		
		
		private By tC = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[3]/div[2]/label/span[1]/input");
		
		private By next = By.className("ant-btn ant-btn-primary");
		
		
		
		
		// Initializing the Page Objects:
		public CompanyProductPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getInwardCheckbox() {
			return driver.findElement(inwardCheckbox);
		}
		
		public WebElement getOutwardCheckbox() {
			return driver.findElement(outwardCheckbox);
		}

		public WebElement getTC() {
			return driver.findElement(tC);
		}

		public WebElement getNext() {
			return driver.findElement(next);
		}

	}