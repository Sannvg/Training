package com.POS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class AddProduct extends BaseClass {
	@FindBy(id = "Type")
	WebElement drpPdtType;
	@FindBy(id = "ProductCode")
	WebElement txtPdtCode;
	@FindBy(id = "ProductName")
	WebElement txtPdtName;
	@FindBy(id = "Category")
	WebElement drpCategory;
	@FindBy(id = "Supplier")
	WebElement drpSupplier;
	@FindBy(id = "PurchasePrice")
	WebElement drpPurchasePrice;
	@FindBy(id = "Tax")
	WebElement txtTax;
	@FindBy(id = "taxType")
	WebElement drpTaxType;
	@FindBy(id = "Price")
	WebElement drpPrice;
	@FindBy(id = "Unit")
	WebElement txtUnit;
	@FindBy(id = "AlertQt")
	WebElement drpAlertQT;
	@FindBy(id = "ProductOptions")
	WebElement txtPdtOptions;
	@FindBy(id = "ImageInput")
	WebElement filePdtImg;
	@FindBy(css = ".note-editable.panel-body")
	WebElement txtPdtDesc;
	// Product Description
	@FindBy(css = "button[data-original-title='Bold (CTRL+B)']")
	WebElement btnPdtDescBold;
	@FindBy(css = "button[data-original-title='Italic (CTRL+I)']")
	WebElement btnPdtDescItalic;
	@FindBy(css = "button[data-original-title='Underline (CTRL+U)']")
	WebElement btnPdtDescUnderline;
	@FindBy(css = "button[data-original-title='Remove Font Style (CTRL+\\)']")
	WebElement btnPdtDescRemoveFS;
	@FindBy(css = "button[data-original-title='Font Size']")
	WebElement btnPdtDescFontS;
	@FindBy(css = "button[data-original-title='Recent Color']")
	WebElement btnPdtDescRClr;
	@FindBy(css = "button[data-original-title='More Color']")
	WebElement btnPdtDescMClr;
	@FindBy(css = "button[data-original-title='Unordered list (CTRL+SHIFT+NUM7)']")
	WebElement btnPdtDescUL;
	@FindBy(css = "button[data-original-title='Ordered list (CTRL+SHIFT+NUM8)']")
	WebElement btnPdtDescOL;
	@FindBy(css = "button[data-original-title='Paragraph']")
	WebElement btnPdtDescPara;
	@FindBy(css = "button[data-original-title='Line Height']")
	WebElement btnPdtDescLH;

	// Display Color
	@FindBy(id = "option1")
	WebElement rbtnClr1;
	@FindBy(id = "option2")
	WebElement rbtnClr2;
	@FindBy(id = "option3")
	WebElement rbtnClr3;
	@FindBy(id = "option4")
	WebElement rbtnClr4;
	@FindBy(id = "option5")
	WebElement rbtnClr5;
	@FindBy(id = "option6")
	WebElement rbtnClr6;
	@FindBy(id = "option7")
	WebElement rbtnClr7;
	@FindBy(id = "option8")
	WebElement rbtnClr8;

	@FindBy(xpath = "(//button[@data-dismiss='modal' and text()='Close'])[2]")
	WebElement btnPdtClose;
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement btnPdtSubmit;

	public AddProduct() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement pdtType() {
		return drpPdtType;
	}

	public WebElement pdtCode() {
		return txtPdtCode;
	}

	public WebElement pdtName() {
		return txtPdtName;
	}

	public WebElement pdtCategory() {
		return drpCategory;
	}

	public WebElement pdtSupplier() {
		return drpSupplier;
	}

	public WebElement pdtPurchasePrice() {
		return drpPurchasePrice;
	}

	public WebElement pdtTax() {
		return txtTax;
	}

	public WebElement pdtTaxType() {
		return drpTaxType;
	}

	public WebElement pdtPrice() {
		return drpPrice;
	}

	public WebElement pdtUnit() {
		return txtUnit;
	}

	public WebElement pdtAlertqty() {
		return drpAlertQT;
	}

	public WebElement pdtOptions() {
		return txtPdtOptions;
	}

	public WebElement pdtImageInput() {
		return filePdtImg;
	}

	public WebElement pdtDescription() {
		return txtPdtDesc;
	}

	public WebElement pdtDescBold() {
		return btnPdtDescBold;
	}

	public WebElement pdtDescItalic() {
		return btnPdtDescItalic;
	}

	public WebElement pdtDescUnderline() {
		return btnPdtDescUnderline;
	}

	public WebElement pdtDescRemoveFS() {
		return btnPdtDescRemoveFS;
	}

	public WebElement pdtDescFontS() {
		return btnPdtDescFontS;
	}

	public WebElement pdtDescRClr() {
		return btnPdtDescRClr;
	}

	public WebElement pdtDescMClr() {
		return btnPdtDescMClr;
	}

	public WebElement pdtDescUList() {
		return btnPdtDescUL;
	}

	public WebElement pdtDescOList() {
		return btnPdtDescOL;
	}

	public WebElement pdtDescPara() {
		return btnPdtDescPara;
	}

	public WebElement pdtDescLineHt() {
		return btnPdtDescLH;
	}

	public WebElement pdtDescClr1() {
		return rbtnClr1;
	}

	public WebElement pdtDescClr2() {
		return rbtnClr2;
	}

	public WebElement pdtDescClr3() {
		return rbtnClr3;
	}

	public WebElement pdtDescClr4() {
		return rbtnClr4;
	}

	public WebElement pdtDescClr5() {
		return rbtnClr5;
	}

	public WebElement pdtDescClr6() {
		return rbtnClr6;
	}

	public WebElement pdtDescClr7() {
		return rbtnClr7;
	}

	public WebElement pdtDescClr8() {
		return rbtnClr8;
	}

	public WebElement addPdtClose() {
		return btnPdtClose;
	}

	public WebElement addPdtSubmit() {
		return btnPdtSubmit;
	}

}
