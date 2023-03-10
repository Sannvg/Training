package com.POS.Testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.POS.BaseClass.BaseClass;
import com.POS.PageObjects.Customer;
import com.POS.PageObjects.HomePage;
import com.POS.PageObjects.Login;
import com.POS.PageObjects.Product;
import com.POS.PageObjects.Store;
import com.POS.PageObjects.Supplier;
import com.POS.PageObjects.Waiter;
import com.POS.Utilities.Log;

public class VerifyHomePageTest extends BaseClass {	

	@Test(priority = 1)
	public void validateElementsDisplay() {		
		Log.startTestCase("VerifyHomePageTest--displayElements");
		act.findElement(driver, objHome.logoImage());
		Assert.assertTrue(objHome.logoImage().isDisplayed());
		act.findElement(driver, objHome.loginLabel());
		Assert.assertTrue(objHome.loginLabel().isDisplayed());
		act.findElement(driver, objHome.loginImage());
		Assert.assertTrue(objHome.logoImage().isDisplayed());
		act.findElement(driver, objHome.logout());
		Assert.assertTrue(objHome.logout().isDisplayed());
		Log.info("Home Page Elements Display");
		Log.endTestCase("VerifyHomePageTest--displayElements");
	}

	@Test(priority = 2)
	public void validateLanguageSelection() {		
		Log.startTestCase("VerifyHomePageTest--languageListed");
		act.isDisplayed(driver, objHome.languageDropdown());
		act.click1(objHome.languageDropdown(), "DropDown for language");
		Log.info("Home Page Language Selection");
		act.selectByValue(objHome.languageDropdown(), "Greek");
		System.out.println(objHome.languageDropdown().getText());
		// act.explicitWait(driver, objHome.languageDropdown(),Duration.ofSeconds(10));
		// Assert.assertEquals(objHome.languageDropdown(), "Greek");
		Log.endTestCase("VerifyHomePageTest--languageListed");
	}

	@Test(priority = 3)
	public void validateMenuDisplay() {	
		Log.startTestCase("VerifyHomePageTest--menuElements");
		Log.info("Home Page Menu Check");
		List<WebElement> menuHome = objHome.menuList();
		List<String> menuList = new ArrayList<String>();
		menuList.add("POS");
		menuList.add("Product");
		menuList.add("Stores");
		menuList.add("People");
		menuList.add("Sales");
		menuList.add("Expense");
		menuList.add("Categories");
		menuList.add("Setting");
		menuList.add("Reports");
		boolean flag = false;
		for (int m = 0; m < menuList.size(); m++) {
			for (WebElement w : menuHome) {
				if ((menuList.get(0).equalsIgnoreCase(w.getText()))) {
					flag = true;
					break;
				}
			}
			flag = false;
		}
		Log.endTestCase("VerifyHomePageTest--menuElements");
		Assert.assertFalse(flag);
	}

	@Test(priority = 4)
	public void validateMenuClick() {				
		Log.startTestCase("VerifyHomePageTest--menuElementsClick");
		Log.info("Home Page Menu Click");
		act.click1(objHome.menuPdt(), "Product Menu");
		Assert.assertTrue(objPdt.tableProduct().isDisplayed());
		act.click1(objHome.menuStore(), "Store Menu");
		Assert.assertTrue(objStore.tableStore().isDisplayed());
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuWaiter(), "Waiter Menu");
		Assert.assertTrue(objWaiter.tableWaiter().isDisplayed());
		act.click1(objHome.menuCustomer(), "Customer Menu");
		Assert.assertTrue(objCustomer.tableCustomer().isDisplayed());
		act.click1(objHome.menuSupplier(), "Supplier Menu");
		Assert.assertTrue(objSupplier.tableSupplier().isDisplayed());	
		Log.endTestCase("VerifyHomePageTest--menuElementsClick");
	}

	@Test(priority = 5)
	public void validatelogOut() {		
		Log.startTestCase("VerifyHomePageTest--logOut");
		objHome.logOutFn();
		Log.endTestCase("VerifyHomePageTest--logOut");
		act.explicitWait(driver, objLogin.dispLogin(), Duration.ofSeconds(10));
		Assert.assertTrue(objLogin.dispLogin().isDisplayed());
	}
}
