package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OwnershipDetailPage {

	public static void main(String[] args) {
		
}

	private WebDriver driver;
	
	public OwnershipDetailPage(WebDriver driver) {
		this.driver = driver;
}
	
	private By addBeneficiaryOwnerDetail = By.xpath("//*[@id=\"root\"]/div[1]/div/div/main/div[2]/div/div[1]/div[4]/div/div[2]/button/span");
	
	private By nameListDropdown = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div[2]/div/div/div/div/span[2]");
	
	private By nameList = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div[2]/div/div/div/div/span[2]");
	
	private By addNewName = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/span[2]/span/svg");
	
	private By addButton = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/span[2]/span/svg");
	
	private By ownerNationality1 = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/div/span[2]");
	
	private By uploadPAN = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/div/span[2]");
	
	private By ownerNationality2 = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/div/span[2]");
	
	private By uploadPassport = By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div[3]/div/div/div[2]/div/div/div/div/span[2]");
}