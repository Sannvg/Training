package com.POS.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class Product extends BaseClass {
	WebDriver driver;
	
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/products']")
	WebElement menuPdt;

	@FindBy(css = "select[name='Table_length']")
	WebElement drpShowProduct;

	@FindBy(css = "select[name='filtersupp']")
	WebElement drpFilterSupplier;
	@FindBy(css = "Select[name='filtertype']")
	WebElement drpFilterPdtType;
	@FindBy(xpath = "//button[text()='Apply Filter']")
	WebElement btnApplyFilter;

	@FindBy(css = "input[type='search']")
	WebElement txtSearchPdt;

	@FindBy(css = "table[id='Table']")
	List<WebElement> lsttblPdts;
	@FindBy(css = "table[id='Table']")
	WebElement tblProduct;
	
	@FindBy(xpath = "//button[@data-target='#Addproduct']")
	WebElement bnAddPdt;
	
	@FindBy(linkText="Download CSV")
	WebElement lnkDownload;
	@FindBy(css="a[data-target='#ImportProducts']")
	WebElement lnkUpload;
	@FindBy(css="a[data-target='#PrintMenu']")
	WebElement lnkPrintMenu;
	
	@FindBy(className="pagination")
	WebElement tblPaginationPdt;

	public Product(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement menuPdt() {
		return menuPdt;
	}

	public WebElement showProduct() {
		return drpShowProduct;
	}

	public WebElement supplierFilter() {
		return drpFilterSupplier;
	}

	public WebElement pdtTypeFilter() {
		return drpFilterPdtType;
	}

	public WebElement applyFilter() {
		return btnApplyFilter;
	}

	public WebElement searchPdt() {
		return txtSearchPdt;
	}

	public List<WebElement> lsttableProducts() {
		return lsttblPdts;
	}
	public WebElement tableProduct() {
		return tblProduct;
	}
	
	public WebElement addPdt() {
		return bnAddPdt;
	}
	
	public WebElement downloadFile() {
		return lnkDownload;
	}

	public WebElement uploadFile() {
		return lnkUpload;
	}
	
	public WebElement printMenu() {
		return lnkPrintMenu;
	}
	
	public WebElement pageIndexPdt() {
		return tblPaginationPdt;
	}
	
	//Upload File Window
	@FindBy(id="ImageInput")
	WebElement btnUploadfile;
	@FindBy(linkText="Download Sample")
	WebElement linkDownload;
	@FindBy(xpath="(//button[@data-dismiss='modal' and text()='Close'])[2]")
	WebElement btnUFClose;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement btnUFSubmit;
	
	public WebElement uploadImageFile() {
		return btnUploadfile;
	}
	public WebElement downloadSample() {
		return linkDownload;
	}	
	public WebElement uploadFileClose() {
		return btnUFClose;
	}
	public WebElement uploadFileSubmit() {
		return btnUFSubmit;
	}
	
	//Print Menu
	@FindBy(id="")
	WebElement btnPrintMenuClose;
	@FindBy(xpath="//button[@onclick='PrintTicket()']")
	WebElement btnPrintMenu;
	
	public WebElement printMenuClose() {
		return btnPrintMenuClose;
	}
	public WebElement menuPrint() {
		return btnPrintMenu;
	}

}
