package com.POS.PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class Category extends BaseClass {
	@FindBy(css = "select[name='Table_length']")
	WebElement drpShowCategory;
	@FindBy(css = "input[type='search']")
	WebElement txtSearchCategory;
	@FindBy(css = "table[id='Table']")
	WebElement tblCategory;
	@FindBy(css = "table[id='Table']")
	List<WebElement> listtblCategory;
	@FindBy(xpath = "//table[@id='Table']//th")
	List<WebElement> tblCatHeaders;
	@FindBy(xpath = "//button[@data-target='#Addcategory']")
	WebElement btnAddCat;
	@FindBy(xpath="//ul[@class='pagination']//li")
	List<WebElement> tblPaginationCat;
	@FindBy(css="#Table_info")
	WebElement lblTblInfo;
	@FindBy(xpath="//li[@class='paginate_button active']//a")
	WebElement pageActive;	
	@FindBy(xpath = "(//a[@data-original-title='Delete'])[1]")
	WebElement deleteCat;
	@FindBy(xpath = "(//a[@data-original-title='Edit'])[1]")
	WebElement editCat;
	@FindBy(xpath = "//th[@aria-sort='ascending']")
	WebElement ascendingCat;
	@FindBy(xpath = "//th[@aria-sort='descending']")
	WebElement descendingCat;
	@FindBy(xpath = "//td[@class='sorting_1']")
	WebElement firstelement;
	@FindBy(xpath = "//td[@class='dataTables_empty']")
	WebElement noRecords;
	//Add Category
	@FindBy(id = "CategoryName")
	WebElement txtCatName;
	@FindBy(xpath = "//button[text()='Close']")
	WebElement btnCloseAddCat;
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement btnSubmitAddCat;
	
	public Category() {
		PageFactory.initElements(getDriver(), this);
	}
	public WebElement drpShowCategory() {
		return drpShowCategory;
	}

	public WebElement txtSearchCategory() {
		return txtSearchCategory;
	}

	public WebElement tblCategory() {
		return tblCategory;
	}

	public List<WebElement> listtblCategory() {
		return listtblCategory;
	}

	public List<WebElement> tblCatHeaders() {
		return tblCatHeaders;
	}

	public WebElement ascendingCat() {
		return ascendingCat;
	}

	public WebElement descendingCat() {
		return descendingCat;
	}
	public WebElement btnAddCat() {
		return btnAddCat;
	}

	public List<WebElement> pageIndexCat() {
		return tblPaginationCat;
	}
	public WebElement lblTblPages() {
		return lblTblInfo;
	}
	public WebElement pageActive() {
		return pageActive;
	}
	public WebElement deleteCat() {
		return deleteCat;
	}

	public WebElement editCat() {
		return editCat;
	}
	public WebElement txtCatName() {
		return txtCatName;
	}
	public WebElement btnCloseAddCat() {
		return btnCloseAddCat;
	}

	public WebElement btnSubmitAddCat() {
		return btnSubmitAddCat;
	}

}
