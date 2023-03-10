package com.POS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class AddWaiter extends BaseClass {	
	
	WebDriver driver;

	@FindBy(id="WaiterName")
	WebElement txtWaiterName;

	@FindBy(id="WaiterPhone")
	WebElement txtWaiterPhone;

	@FindBy(id="WaiterEmail")
	WebElement txtWaiterEmail;
	
	@FindBy(id="WaiterStore")
	WebElement drpWaiterStore;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement btnCloseAddWaiter;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement btnSubmitAddWaiter;
	
	public AddWaiter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	public WebElement waiterName() {
		return txtWaiterName;
	}

	public WebElement waiterPhone() {
		return txtWaiterPhone;
	}

	public WebElement waiterEmail() {
		return txtWaiterEmail;
	}
	public WebElement waiterStore() {
		return drpWaiterStore;
	}
	
	public WebElement waiterAddClose() {
		return btnCloseAddWaiter;
	}	
	public WebElement waiterAddSubmit() {
		return btnSubmitAddWaiter;
	}	

}
