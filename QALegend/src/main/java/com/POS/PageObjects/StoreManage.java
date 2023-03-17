package com.POS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class StoreManage extends BaseClass {
	@FindBy(css = ".fa.fa-plus")
	WebElement btnAddZone;
	@FindBy(id = "ZonesName")
	WebElement txtaddZoneName;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement btnaddZoneSubmit;
	@FindBy(xpath = "(//button[text()='Close'])[2]")
	WebElement btnaddZoneClose;
	@FindBy(css = ".fa.fa-pencil.editzone")
	WebElement btnEditZone;
	@FindBy(css = "#ZoneName")
	WebElement txtEditZoneName;
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	WebElement btnEditZoneSubmit;
	@FindBy(xpath = "(//button[text()='Close'])[3]")
	WebElement btnEditZoneClose;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement editStoreTblSubmit;
	@FindBy(xpath = "(//i[@class='fa fa-times deletezone'])[1]")
	WebElement deleteZone;
	@FindBy(xpath = "//button[@class='confirm']")
	WebElement deleteZoneConfirm;
	@FindBy(xpath = "//button[@data-target='#Addtable']")
	WebElement btnaddStoreTable;
	@FindBy(css = "table[class='table table-striped table-bordered']")
	WebElement tblStore;
	@FindBy(xpath = "//input[@id='TableName']")
	WebElement txtAddStoreTblNm;
	@FindBy(xpath = "//select[@id='Zones']")
	WebElement drpAddStoreZone;
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement btnAddStoreTblSubmit;
	@FindBy(xpath = "(//button[text()='Close'])[1]")
	WebElement btnAddStoreTblClose;
	@FindBy(xpath = "//h2[text()='Store Zones']")
	WebElement lblStoreZone;
	@FindBy(xpath = "(//a[@data-original-title='Delete'])[1]")
	WebElement storeTableDelete;
	@FindBy(xpath = "(//a[@data-original-title='Edit'])[1]")
	WebElement storeTableEdit;

	public StoreManage() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement btnaddZone() {
		return btnAddZone;
	}

	public WebElement AddZoneName() {
		return txtaddZoneName;
	}

	public WebElement addZoneSubmit() {
		return btnaddZoneSubmit;
	}

	public WebElement addZoneClose() {
		return btnaddZoneClose;
	}

	public WebElement btnEditZone() {
		return btnEditZone;
	}

	public WebElement editZoneName() {
		return txtEditZoneName;
	}

	public WebElement editZoneSubmit() {
		return btnEditZoneSubmit;
	}

	public WebElement editZoneClose() {
		return btnEditZoneClose;
	}

	public WebElement deleteZone() {
		return deleteZone;
	}

	public WebElement deleteZoneConfirm() {
		return deleteZoneConfirm;
	}

	public WebElement btnaddStoreTable() {
		return btnaddStoreTable;
	}

	public WebElement tblStore() {
		return tblStore;
	}

	public WebElement txtAddStoreTblNm() {
		return txtAddStoreTblNm;
	}

	public WebElement drpAddStoreZone() {
		return drpAddStoreZone;
	}

	public WebElement btnAddStoreTblSubmit() {
		return btnAddStoreTblSubmit;
	}

	public WebElement btnAddStoreTblClose() {
		return btnAddStoreTblClose;
	}

	public WebElement lblStoreZone() {
		return lblStoreZone;
	}

	public WebElement storeTableDelete() {
		return storeTableDelete;
	}

	public WebElement storeTableEdit() {
		return storeTableEdit;
	}

	public WebElement btnEditStoreTblSubmit() {
		return editStoreTblSubmit;
	}

	public void beforefn() {
		objLogin.loginFn();
		act.click1(objStore.menuStore(), "Store Menu");
		act.click1(objStore.searchStore(), "Search Store");
		act.type(objStore.searchStore(), "OBS Store");
		act.click1(objStore.manageStore(), "Manage Store ");
	}
}
