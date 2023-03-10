package com.POS.Testcases;

import java.time.Duration;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.POS.BaseClass.BaseClass;
import com.POS.PageObjects.AddWaiter;
import com.POS.PageObjects.HomePage;
import com.POS.PageObjects.Login;
import com.POS.PageObjects.Waiter;
import com.POS.Utilities.ExcelRead;
import com.POS.Utilities.Log;

public class VerifyWaiterTest extends BaseClass {
	
	@Test(priority = 1)
	public void validateShowCount() {	
		Log.startTestCase("VerifyWaiterTest--validateShowCount");
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuWaiter(), "Waiter Menu");
		Assert.assertTrue(objWaiter.addWaiter().isDisplayed());
		act.selectByVisibleText("50", objWaiter.showWaiterFilter());
		Log.info("Selected show count");
		Log.endTestCase("VerifyWaiterTest--validateShowCount");
		int rwcount = act.getRowCount(objWaiter.tableWaiter());
		Assert.assertEquals(rwcount, 50);
	}

	@Test(priority = 2)
	public void validateSearchWaiter() {
		Log.startTestCase("VerifyWaiterTest--validateSearchWaiter");
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuWaiter(), "Waiter Menu");
		Assert.assertTrue(objWaiter.addWaiter().isDisplayed());
		act.type(objWaiter.searchWaiter(), "Obs");
		Log.info("Search waiter entered");
		Log.endTestCase("VerifyWaiterTest--validateSearchWaiter");
		int tblRowCnt = act.getRowCount(objWaiter.tableWaiter());
		Assert.assertTrue(tblRowCnt > 0, "Searched Waiter is displayed");
	}

	@Test(priority = 3)
	public void validateAddWaiter() throws Exception {
		Log.startTestCase("VerifyWaiterTest--validateAddWaiter");
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuWaiter(), "Waiter Menu");
		Assert.assertTrue(objWaiter.addWaiter().isDisplayed());		
		act.click1(objWaiter.addWaiter(), "Add Waiter");
		ExcelRead data = new ExcelRead();
		ArrayList excelData = data.getData("Waiter");
		act.type(objAddWaiter.waiterName(), (String) excelData.get(0));
		act.type(objAddWaiter.waiterPhone(), (String) excelData.get(1));
		act.type(objAddWaiter.waiterEmail(), (String) excelData.get(2));
		act.type(objAddWaiter.waiterStore(), (String) excelData.get(3));
		act.click1(objAddWaiter.waiterAddSubmit(), "Add Waiter Submit");
		Log.endTestCase("VerifyWaiterTest--validateAddWaiter");
		Assert.assertTrue(objWaiter.addWaiter().isDisplayed(), "Waiter is Added");
	}

	@Test(priority = 4)
	public void validateEditWaiter() {
		Log.startTestCase("VerifyWaiterTest--validateEditWaiter");
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuWaiter(), "Waiter Menu");
		Assert.assertTrue(objWaiter.addWaiter().isDisplayed());		
		act.type(objWaiter.searchWaiter(), "Test");
		act.explicitWait(driver, objWaiter.editWaiter(), Duration.ofSeconds(10));
		act.click1(objWaiter.editWaiter(), "Edit Waiter");
		Log.endTestCase("VerifyWaiterTest--validateEditWaiter");
		int tblRowCnt = act.getRowCount(objWaiter.tableWaiter());
		Assert.assertTrue(tblRowCnt > 0, "Waiter is edited");
	}

	@Test(priority = 5)
	public void validateDeleteWaiter() {
		Log.startTestCase("VerifyWaiterTest--validateDeleteWaiter");
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuWaiter(), "Waiter Menu");
		Assert.assertTrue(objWaiter.addWaiter().isDisplayed());	
		act.type(objWaiter.searchWaiter(), "Test");
		Log.info("Delete waiter entered");
		act.fluentWait(driver, objWaiter.deleteWaiter(), 5);
		act.click1(objWaiter.deleteWaiter(), "Delete Waiter");		
		int tblRowCnt = act.getRowCount(objWaiter.tableWaiter());
		Assert.assertEquals(0, tblRowCnt);
		Log.endTestCase("VerifyWaiterTest--validateDeleteWaiter");
	}
}
