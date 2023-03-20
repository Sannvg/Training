package com.obsqura.pomodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwagLabsHomePage {

	WebDriver driver;

	// inventory images
	By imgslbkpck = By.xpath("//img[@alt='Sauce Labs Backpack']");
	By imgslbolttshirt = By.xpath("//img[@alt='Sauce Labs Bolt T-Shirt']");
	By imgslonesie = By.xpath("//img[@alt='Sauce Labs Onesie']");
	By imgslbikelt = By.xpath("//img[@alt='Sauce Labs Bike Light']");
	By imgslfjacket = By.xpath("//img[@alt='Sauce Labs Fleece Jacket']");
	By imgsltshirtred = By.xpath("//img[@alt='Test.allTheThings() T-Shirt (Red)']");

	// inventory buttons
	By btnslbkpck = By.cssSelector("button[id='add-to-cart-sauce-labs-backpack']");
	By btnslbolttshirt = By.cssSelector("button[id='add-to-cart-sauce-labs-bolt-t-shirt']");
	By btnslonesie = By.cssSelector("button[id='add-to-cart-sauce-labs-onesie']");
	By btnslbikelt = By.cssSelector("button[id='add-to-cart-sauce-labs-bike-light']");
	By btnslfjacket = By.cssSelector("button[id='add-to-cart-sauce-labs-fleece-jacket']");
	By btnsltshirtred = By.cssSelector("button[id='add-to-cart-test.allthethings()-t-shirt-(red)']");

	// sidebar menu
	By btnSideMenu = By.xpath("//button[@id='react-burger-menu-btn']");
	By linkAllItems = By.xpath("//a[@id='inventory_sidebar_link']");
	By linkAbout = By.xpath("//a[@id='about_sidebar_link']");
	By linkLogout = By.xpath("//a[@id='logout_sidebar_link']");
	By linkReset = By.xpath("//a[@id='reset_sidebar_link']");
	By btnSideBarCls = By.xpath("//button[@id='react-burger-cross-btn']");

	// Links
	By lnkTwitter = By.linkText("Twitter");
	By lnkFacebook = By.linkText("Facebook");
	By lnkLinkedIn = By.linkText("LinkedIn");

	// filter dropdown
	// List<WebElement> filterdrpdwn =
	// By.cssSelector("select[class='product_sort_container']");

	public SwagLabsHomePage(WebDriver driver) {
		this.driver = driver;
	}

	//Methods for inventory images
	public WebElement imgBkpack() {
		return driver.findElement(imgslbkpck);
	}

	public WebElement imgBoltTshirt() {
		return driver.findElement(imgslbolttshirt);
	}

	public WebElement imgLonesie() {
		return driver.findElement(imgslonesie);
	}

	public WebElement imgBikelt() {
		return driver.findElement(imgslbikelt);
	}

	public WebElement imgFljacket() {
		return driver.findElement(imgslfjacket);
	}

	public WebElement imgTshirtred() {
		return driver.findElement(imgsltshirtred);
	}

	// methods for add to cart buttons
	public WebElement btnBkpck() {
		return driver.findElement(btnslbkpck);
	}

	public WebElement btnBolttshirt() {
		return driver.findElement(btnslbolttshirt);
	}

	public WebElement btnLonesie() {
		return driver.findElement(btnslonesie);
	}

	public WebElement btnBikelt() {
		return driver.findElement(btnslbikelt);
	}

	public WebElement btnFljacket() {
		return driver.findElement(btnslfjacket);
	}

	public WebElement btnTshirtred() {
		return driver.findElement(btnsltshirtred);
	}

	// Method for Side Bar Menu
	public WebElement btnSideMenu() {
		return driver.findElement(btnSideMenu);
	}

	public WebElement linkAllItems() {
		return driver.findElement(linkAllItems);
	}

	public WebElement linkAbout() {
		return driver.findElement(linkAbout);
	}

	public WebElement linkLogout() {
		return driver.findElement(linkLogout);
	}

	public WebElement linkReset() {
		return driver.findElement(linkReset);
	}

	public WebElement btnSideBarCls() {
		return driver.findElement(btnSideBarCls);
	}

	// Methods for links
	public WebElement lnkTwitter() {
		return driver.findElement(lnkTwitter);
	}

	public WebElement lnkFacebook() {
		return driver.findElement(lnkFacebook);
	}

	public WebElement lnkLinkedIn() {
		return driver.findElement(lnkLinkedIn);
	}
}
