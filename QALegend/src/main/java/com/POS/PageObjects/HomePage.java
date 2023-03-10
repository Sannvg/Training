package com.POS.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POS.BaseClass.BaseClass;

public class HomePage extends BaseClass {

	WebDriver driver;
	
	@FindBy(css="img[alt='logo']")
	WebElement imgLogo;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']")
	List<WebElement> listMenu;	
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/products']")
	WebElement menuPdt;
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/stores']")
	WebElement menuStore;	
	@FindBy(xpath="//i[@class='fa fa-users']")
	WebElement menuPeople;
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/waiters']")
	WebElement menuWaiter;	
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/suppliers']")
	WebElement menuSupplier;
	@FindBy(xpath = "//a[@href='https://qalegend.com/restaurant/customers']")
	WebElement menuCustomer;	
	
	@FindBy(css=".img-circle.topbar-userpic.hidden-xs")
	WebElement imgLogin;
	@FindBy(xpath="//span[@class='hidden-xs'][1]")
	WebElement lblLogin;	
	@FindBy(css=".dropdown.language")
	WebElement drplanguage;	
	@FindBy(css="a[title='Logout']")
	WebElement btnLogout;		
	@FindBy(css = ".text-center.choose_store")
	WebElement lblStore;
	@FindBy(xpath = "//ul[@id='storeline']")
	WebElement listStore;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement logoImage() {
		return imgLogo;
	}
	public List<WebElement> menuList() {
		return listMenu;
	}	
	public WebElement menuPdt() {
		return menuPdt;
	}
	public WebElement menuStore() {
		return menuStore;
	}	
	public WebElement menuPeople() {
		return menuPeople;
	}
	public WebElement menuWaiter() {
		return menuWaiter;
	}
	public WebElement menuCustomer() {
		return menuCustomer;
	}
	public WebElement menuSupplier() {
		return menuSupplier;
	}	
	public WebElement loginImage() {
		return imgLogin;
	}
	public WebElement loginLabel() {
		return lblLogin;
	}
	public WebElement languageDropdown() {
		return drplanguage;
	}
	public WebElement logout() {
		return btnLogout;
	}
	public WebElement storeMenu() {
		return lblStore;
	}
	public WebElement storeList() {
		return listStore;
	}
	
	public void logOutFn() {
		act.click1(objHome.logout(), "User Logged Out");
	}

}
