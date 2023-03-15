package com.POS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class Customer extends BaseClass {
	@FindBy(css = "select[name='Table_length']")
	WebElement drpShowCustomer;
	@FindBy(css = "input[type='search']")
	WebElement txtSearchCustomer;
	@FindBy(css = "table[id='Table']")
	WebElement tblCustomer;
	@FindBy(xpath = "//button[@data-target='#AddCustomer']")
	WebElement bnAddCustomer;
	@FindBy(className = "pagination")
	WebElement tblPaginationCustomer;
	@FindBy(xpath = "(//a[@data-original-title='Delete'])[1]")
	WebElement deleteCustomer;
	@FindBy(xpath = "//a[@class='btn btn-danger']")
	WebElement deleteConfirm;
	@FindBy(xpath = "(//a[@data-original-title='Edit'])[1]")
	WebElement editCustomer;

	public Customer() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement showCustomer() {
		return drpShowCustomer;
	}

	public WebElement searchCustomer() {
		return txtSearchCustomer;
	}

	public WebElement tableCustomer() {
		return tblCustomer;
	}

	public WebElement addCustomer() {
		return bnAddCustomer;
	}

	public WebElement pageIndexCustomer() {
		return tblPaginationCustomer;
	}

	public WebElement deleteCustomer() {
		return deleteCustomer;
	}

	public WebElement deleteConfirm() {
		return deleteConfirm;
	}

	public WebElement editCustomer() {
		return editCustomer;
	}
}
