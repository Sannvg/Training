package com.POS.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class Store extends BaseClass {

	WebDriver driver;
	
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/stores']")
	WebElement menuStore;

	@FindBy(css = "select[name='Table_length']")
	WebElement drpShowStore;

	@FindBy(css = "input[type='search']")
	WebElement txtSearchStore;

	@FindBy(css = "table[id='Table']")
	WebElement tblStores;
	
	@FindBy(css = "table[id='Table']")
	List<WebElement> listtblStores;
	
	@FindBy(xpath = "//table[@id='Table']//th")
	List<WebElement> tblStoreHeaders;
	
	@FindBy(xpath = "//button[@data-target='#AddStore']")
	WebElement bnAddStore;
	
	@FindBy(className="pagination")
	WebElement tblPaginationStore;
	//-------------
	@FindBy(xpath="(//a[@data-original-title='Delete'])[1]")
	WebElement deleteStore;
	
	@FindBy(xpath="(//a[@data-original-title='Edit'])[1]")
	WebElement editStore;
	
	@FindBy(xpath="(//a[@data-original-title='manage Tables'])[1]")
	WebElement manageStore;
	
	@FindBy(xpath="//th[@aria-sort='ascending']")
	WebElement ascendingStore;
	
	@FindBy(xpath="//th[@aria-sort='descending']")
	WebElement descendingStore;
	
	@FindBy(xpath="//td[@class='sorting_1']")
	WebElement firstelement;
	
	@FindBy(xpath="//td[@class='dataTables_empty']")
	WebElement noelement;
	
 
	public Store(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement menuStore() {
		return menuStore;
	}
	public WebElement showStore() {
		return drpShowStore;
	}

	public WebElement searchStore() {
		return txtSearchStore;
	}

	public WebElement tableStore() {
		return tblStores;
	}
	public List<WebElement> listtblStores() {
		return listtblStores;
	}
	public List<WebElement> tblStoreHeaders() {
		return tblStoreHeaders;
	}
	public WebElement addStore() {
		return bnAddStore;
	}
	
	public WebElement pageIndexStore() {
		return tblPaginationStore;
	}
	//----
	public WebElement deleteStore() {
		return deleteStore;
	}
	public WebElement editStore() {
		return editStore;
	}

	public WebElement manageStore() {
		return manageStore;
	}

	public WebElement ascendingStore() {
		return ascendingStore;
	}
	public WebElement descendingStore() {
		return descendingStore;
	}
	
	public WebElement firstElement() {
		return firstelement;
	}
	public WebElement noElement() {
		return noelement;
	}
	

}
