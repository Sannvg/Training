package com.POS.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class AddSupplier extends BaseClass {

	WebDriver driver;

	@FindBy(id="SupplierName")
	WebElement txtSupplierName;	

	@FindBy(id="SupplierPhone")
	WebElement txtSupplierPhone;

	@FindBy(id="SupplierEmail")
	WebElement txtSupplierEmail;
	
	//Supplier Description
		@FindBy(css="button[data-original-title='Bold (CTRL+B)']")
		WebElement btnSupDescBold;
		@FindBy(css="button[data-original-title='Italic (CTRL+I)']")
		WebElement btnSupDescItalic;
		@FindBy(css="button[data-original-title='Underline (CTRL+U)']")
		WebElement btnSupDescUnderline;
		@FindBy(css="button[data-original-title='Remove Font Style (CTRL+\\)']")
		WebElement btnSupDescRemoveFS;
		@FindBy(css="button[data-original-title='Font Size']")
		WebElement btnSupDescFontS;
		@FindBy(css="button[data-original-title='Recent Color']")
		WebElement btnSupDescRClr;
		@FindBy(css="button[data-original-title='More Color']")
		WebElement btnSupDescMClr;
		@FindBy(css="button[data-original-title='Unordered list (CTRL+SHIFT+NUM7)']")
		WebElement btnSupDescUL;
		@FindBy(css="button[data-original-title='Ordered list (CTRL+SHIFT+NUM8)']")
		WebElement btnSupDescOL;
		@FindBy(css="button[data-original-title='Paragraph']")
		WebElement btnSupDescPara;
		@FindBy(css="button[data-original-title='Line Height']")
		WebElement btnSupDescLH;
		
	@FindBy(xpath="//button[text()='Close']")
	WebElement btnCloseAddSup;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement btnSubmitAddSup;
	
	public AddSupplier(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	public WebElement supplierName() {
		return txtSupplierName;
	}

	public WebElement supplierPhone() {
		return txtSupplierPhone;
	}

	public WebElement supplierEmail() {
		return txtSupplierEmail;
	}
	public WebElement supDescBold() {
		return btnSupDescBold;
	}
	public WebElement supDescItalic() {
		return btnSupDescItalic;
	}
	public WebElement supDescUnderline() {
		return btnSupDescUnderline;
	}
	public WebElement supDescRemoveFS() {
		return btnSupDescRemoveFS;
	}
	public WebElement supDescFontS() {
		return btnSupDescFontS;
	}
	public WebElement supDescRClr() {
		return btnSupDescRClr;
	}
	public WebElement supDescMClr() {
		return btnSupDescMClr;
	}
	public WebElement supDescUList() {
		return btnSupDescUL;
	}
	public WebElement supDescOList() {
		return btnSupDescOL;
	}
	public WebElement supDescPara() {
		return btnSupDescPara;
	}
	public WebElement supDescLineHt() {
		return btnSupDescLH;
	}
	
	public WebElement supAddClose() {
		return btnCloseAddSup;
	}	
	public WebElement supAddSubmit() {
		return btnSubmitAddSup;
	}	

}
