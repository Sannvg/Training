package com.POS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class Waiter extends BaseClass{
	
	WebDriver driver;

	@FindBy(css = "select[name='Table_length']")
	WebElement drpShowWaiter;

	@FindBy(css = "input[type='search']")
	WebElement txtSearchWaiter;

	@FindBy(css = "table[id='Table']")
	WebElement tblWaiter;
	
	@FindBy(xpath = "//button[@data-target='#AddWaiter']")
	WebElement bnAddWaiter;
	
	@FindBy(className="pagination")
	WebElement tblPaginationWaiter;
	
	@FindBy(xpath="(//a[@data-original-title='Delete'])[1]")
	WebElement deleteWaiter;
	
	@FindBy(xpath="(//a[@data-original-title='Edit'])[1]")
	WebElement editWaiter;
	
	
	public Waiter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	public WebElement showWaiterFilter() {
		return drpShowWaiter;
	}

	public WebElement searchWaiter() {
		return txtSearchWaiter;
	}

	public WebElement tableWaiter() {
		return tblWaiter;
	}
	public WebElement addWaiter() {
		return bnAddWaiter;
	}
	
	public WebElement pageIndexWaiter() {
		return tblPaginationWaiter;
	}	
	public WebElement deleteWaiter() {
		return deleteWaiter;
	}
	public WebElement editWaiter() {
		return editWaiter;
	}

}
