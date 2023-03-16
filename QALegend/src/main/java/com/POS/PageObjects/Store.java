package com.POS.PageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class Store extends BaseClass {
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
	@FindBy(xpath="//ul[@class='pagination']//li")
	List<WebElement> tblPaginationStore;
	@FindBy(css="#Table_info")
	WebElement lblTblInfo;
	@FindBy(xpath="//li[@class='paginate_button active']//a")
	WebElement pageActive;	
	@FindBy(xpath = "(//a[@data-original-title='Delete'])[1]")
	WebElement deleteStore;
	@FindBy(xpath = "(//a[@data-original-title='Edit'])[1]")
	WebElement editStore;
	@FindBy(xpath = "(//a[@data-original-title='manage Tables'])[1]")
	WebElement manageStore;
	@FindBy(xpath = "//th[@aria-sort='ascending']")
	WebElement ascendingStore;
	@FindBy(xpath = "//th[@aria-sort='descending']")
	WebElement descendingStore;
	@FindBy(xpath = "//td[@class='sorting_1']")
	WebElement firstelement;
	@FindBy(xpath = "//td[@class='dataTables_empty']")
	WebElement noRecords;
	//Add Store
	@FindBy(id = "StoreName")
	WebElement txtStoreName;
	@FindBy(id = "email")
	WebElement txtStoreEmail;
	@FindBy(id = "StorePhone")
	WebElement txtStorePhone;
	@FindBy(id = "Country")
	WebElement txtStoreCountry;
	@FindBy(id = "City")
	WebElement txtStoreCity;
	@FindBy(id = "Adresse")
	WebElement txtStoreAdresse;
	@FindBy(id = "CustomeFooter")
	WebElement txtStoreCustFooter;
	@FindBy(xpath = "//button[text()='Close']")
	WebElement btnCloseAddStore;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement btnSubmitAddStore;

	public Store() {
		PageFactory.initElements(getDriver(), this);
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

	public List<WebElement> pageIndexStore() {
		return tblPaginationStore;
	}
	public WebElement lblTblPages() {
		return lblTblInfo;
	}
	public WebElement pageActive() {
		return pageActive;
	}

	// ----
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

	public WebElement noRecords() {
		return noRecords;
	}
//Add Store
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
