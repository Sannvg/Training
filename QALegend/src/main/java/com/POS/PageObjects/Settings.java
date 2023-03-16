package com.POS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class Settings extends BaseClass {
	@FindBy(xpath = "//a[@href='#users']")
	WebElement btnUsers;	
	@FindBy(xpath = "button[data-target='#AddUser']")
	WebElement btnAddUser;
	@FindBy(id = "username")
	WebElement txtUserName;
	@FindBy(id = "firstname")
	WebElement txtFirstNm;
	@FindBy(id = "lastname")
	WebElement txtLastNm;
	@FindBy(css = "input[value='admin']")
	WebElement rbtnAdmin;
	@FindBy(css = "input[value='sales']")
	WebElement rbtnSales;
	@FindBy(css = "input[value='waiter']")
	WebElement rbtnWaiter;
	@FindBy(css = "input[value='kitchen']")
	WebElement rbtnKitchen;
	@FindBy(id = "email")
	WebElement txtEmail;
	@FindBy(id = "password")
	WebElement txtPassword;
	@FindBy(id = "confirm_password")
	WebElement txtCPassword;
	@FindBy(id = "Avatar")
	WebElement btnInputFile;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement btnSubmit;
	@FindBy(xpath ="(//button[text()='Close'])[1]")
	WebElement btnClose;
	
	public Settings() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement btnUsers() {
		return btnUsers;
	}
	public WebElement btnAddUser() {
		return btnAddUser;
	}
	public WebElement txtFirstNm() {
		return txtFirstNm;
	}
	public WebElement txtLastNm() {
		return txtLastNm;
	}
	public WebElement rbtnAdmin() {
		return rbtnAdmin;
	}
	public WebElement rbtnSales() {
		return rbtnSales;
	}
	public WebElement rbtnWaiter() {
		return rbtnWaiter;
	}
	public WebElement txtEmail() {
		return txtEmail;
	}
	public WebElement txtPassword() {
		return txtPassword;
	}
	public WebElement txtCPassword() {
		return txtCPassword;
	}
	public WebElement btnInputFile() {
		return btnInputFile;
	}
	public WebElement btnSubmit() {
		return btnSubmit;
	}
	public WebElement btnClose() {
		return btnClose;
	}
	
	
}
