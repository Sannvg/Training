package com.POS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class Waiter extends BaseClass {
	@FindBy(css = "select[name='Table_length']")
	WebElement drpShowWaiter;
	@FindBy(css = "input[type='search']")
	WebElement txtSearchWaiter;
	@FindBy(css = "table[id='Table']")
	WebElement tblWaiter;
	@FindBy(xpath = "//button[@data-target='#AddWaiter']")
	WebElement bnAddWaiter;
	@FindBy(className = "pagination")
	WebElement tblPaginationWaiter;
	@FindBy(xpath = "(//a[@data-toggle='popover'])[1]")
	WebElement deleteWaiter;
	@FindBy(xpath = "//div[@class='popover fade left in']//div//a")
	WebElement btnDltConfirm;
	@FindBy(xpath = "(//a[@data-original-title='Edit'])[1]")
	WebElement editWaiter;
	// Add Waiter
	@FindBy(id = "WaiterName")
	WebElement txtWaiterName;
	@FindBy(id = "WaiterPhone")
	WebElement txtWaiterPhone;
	@FindBy(id = "WaiterEmail")
	WebElement txtWaiterEmail;
	@FindBy(id = "WaiterStore")
	WebElement drpWaiterStore;
	@FindBy(xpath = "//button[text()='Close']")
	WebElement btnCloseAddWaiter;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement btnSubmitAddWaiter;

	public Waiter() {
		PageFactory.initElements(getDriver(), this);
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

	public WebElement btnDltConfirm() {
		return btnDltConfirm;
	}

	public WebElement editWaiter() {
		return editWaiter;
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

	public void beforefnWaiter() {
		objLogin.loginFn();
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuWaiter(), "Waiter Menu");
	}
}
