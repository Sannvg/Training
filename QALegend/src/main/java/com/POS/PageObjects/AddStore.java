package com.POS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class AddStore extends BaseClass {

	WebDriver driver;

	@FindBy(id="StoreName")
	WebElement txtStoreName;

	@FindBy(id="email")
	WebElement txtStoreEmail;

	@FindBy(id="StorePhone")
	WebElement txtStorePhone;
	
	@FindBy(id="Country")
	WebElement txtStoreCountry;
	
	@FindBy(id="City")
	WebElement txtStoreCity;
	
	@FindBy(id="Adresse")
	WebElement txtStoreAdresse;
	@FindBy(id="CustomeFooter")
	WebElement txtStoreCustFooter;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement btnCloseAddStore;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement btnSubmitAddStore;
	
	public AddStore(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	public WebElement storeName() {
		return txtStoreName;
	}

	public WebElement storeEmail() {
		return txtStoreEmail;
	}

	public WebElement storePhone() {
		return txtStorePhone;
	}
	public WebElement storeCountry() {
		return txtStoreCountry;
	}
	public WebElement storeCity() {
		return txtStoreCity;
	}
	public WebElement storeAddress() {
		return txtStoreAdresse;
	}
	public WebElement storeCustFooter() {
		return txtStoreCustFooter;
	}
	
	public WebElement storeAddClose() {
		return btnCloseAddStore;
	}	
	public WebElement storeAddSubmit() {
		return btnSubmitAddStore;
	}

}
