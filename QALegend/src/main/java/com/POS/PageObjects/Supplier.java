package com.POS.PageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class Supplier extends BaseClass {
	@FindBy(xpath = "//i[@class='fa fa-truck']")
	WebElement menuSupplier;
	@FindBy(css = "select[name='Table_length']")
	WebElement drpShowSupplier;
	@FindBy(css = "input[type='search']")
	WebElement txtSearchSupplier;
	@FindBy(css = "table[id='Table']")
	WebElement tblSupplier;
	@FindBy(css = "table[id='Table']")
	List<WebElement> listtblSupplier;
	@FindBy(xpath = "//button[@data-target='#AddSupplier']")
	WebElement btnAddSupplier;
	@FindBy(className = "pagination")
	WebElement tblPaginationSupplier;

	public Supplier() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement menuSupplier() {
		return menuSupplier;
	}

	public WebElement showSupplier() {
		return drpShowSupplier;
	}

	public WebElement searchSupplier() {
		return txtSearchSupplier;
	}

	public List<WebElement> listSupplier() {
		return listtblSupplier;
	}

	public WebElement tableSupplier() {
		return tblSupplier;
	}

	public WebElement addSupplier() {
		return btnAddSupplier;
	}

	public WebElement pageIndexSupplier() {
		return tblPaginationSupplier;
	}
}
