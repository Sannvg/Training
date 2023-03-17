package com.POS.PageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class Product extends BaseClass {
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/products']")
	WebElement menuPdt;
	@FindBy(css = "select[name='Table_length']")
	WebElement drpShowProduct;
	@FindBy(css = "#Table_info")
	WebElement lbltblrows;
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
	@FindBy(linkText = "Download CSV")
	WebElement lnkDownload;
	@FindBy(css = "a[data-target='#ImportProducts']")
	WebElement lnkUpload;
	@FindBy(css = "a[data-target='#PrintMenu']")
	WebElement lnkPrintMenu;
	@FindBy(className = "pagination")
	WebElement tblPaginationPdt;

	// Upload File Window
	@FindBy(xpath = "(//input[@id='ImageInput'])[2]")
	WebElement btnUploadfile;
	@FindBy(linkText = "Download Sample")
	WebElement linkDownload;
	@FindBy(xpath = "(//button[@data-dismiss='modal' and text()='Close'])[2]")
	WebElement btnUFClose;
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	WebElement btnUFSubmit;

	// Print Menu
	@FindBy(xpath = "//button[@onclick='PrintTicket()']/preceding-sibling::button")
	WebElement btnPrintMenuClose;
	@FindBy(xpath = "//button[@onclick='PrintTicket()']")
	WebElement btnPrintMenu;

	public Product() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement menuPdt() {
		return menuPdt;
	}

	public WebElement showProduct() {
		return drpShowProduct;
	}

	public WebElement lblTblRowdtl() {
		return lbltblrows;
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

	public WebElement printMenuClose() {
		return btnPrintMenuClose;
	}

	public WebElement menuPrint() {
		return btnPrintMenu;
	}

}
