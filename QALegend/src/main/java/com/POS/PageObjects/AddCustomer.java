package com.POS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class AddCustomer extends BaseClass {

	WebDriver driver;

	@FindBy(id="CustomerName")
	WebElement txtCustomerName;

	@FindBy(id="CustomerPhone")
	WebElement txtCustomerPhone;

	@FindBy(id="CustomerEmail")
	WebElement txtCustomerEmail;
	
	@FindBy(id="CustomerDiscount")
	WebElement txtCustomerDisc;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement btnCloseAddCust;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement btnSubmitAddCust;
	
	public AddCustomer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	public WebElement customerName() {
		return txtCustomerName;
	}

	public WebElement customerPhone() {
		return txtCustomerPhone;
	}

	public WebElement customerEmail() {
		return txtCustomerEmail;
	}
	public WebElement customerDiscount() {
		return txtCustomerDisc;
	}
	
	public WebElement custAddClose() {
		return btnCloseAddCust;
	}	
	public WebElement custAddSubmit() {
		return btnSubmitAddCust;
	}	

}
