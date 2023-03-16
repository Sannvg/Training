package com.POS.Testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.POS.BaseClass.BaseClass;
import com.POS.Utilities.ExcelRead;
import com.POS.Utilities.Log;

public class VerifyStoreTest extends BaseClass {

	@Test(priority = 1)
	public void validateShowCount() {
		Log.startTestCase("VerifyStoreTest--validateShowCount");
		objLogin.loginFn();
		act.click1(objHome.menuStore(), "Store Menu");
		act.selectByVisibleText("50", objStore.showStore());
		int rwcount = act.getRowCount(objStore.tableStore());
		SoftAssert sasst = new SoftAssert();
		sasst.assertEquals(rwcount, 50);
		sasst.assertAll();
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreTest--validateShowCount");
	}

	@Test(priority = 0, groups = { "Smoke" },enabled=false)
	public void validateTableHeaders() {
		Log.startTestCase("VerifyStoreTest--validateTableHeaders");
		objLogin.loginFn();
		act.click1(objHome.menuStore(), "Store Menu");
		List<WebElement> storetblHdrs = objStore.tblStoreHeaders();
		List<String> storeList = new ArrayList<String>();
		boolean flag = false;
		storeList.add("Store Name");
		storeList.add("Email");
		storeList.add("Store Phone");
		storeList.add("Country");
		storeList.add("City");
		storeList.add("Action");
		for (int m = 0; m < storeList.size(); m++) {
			for (WebElement hdr : storetblHdrs) {
				if ((storeList.get(m).equalsIgnoreCase(hdr.getText()))) {
					flag = true;
					break;
				}
			}
			flag = false;
		}
		SoftAssert sasst = new SoftAssert();
		sasst.assertFalse(flag);
		sasst.assertAll();
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreTest--validateTableHeaders");
	}

	@Test(priority = 2)
	public void validateAddStore() throws Exception {
		Log.startTestCase("VerifyStoreTest--validateAddStore");
		objLogin.loginFn();
		act.click1(objHome.menuStore(), "Store Menu");
		act.click1(objStore.addStore(), "Add Store");
		ExcelRead data = new ExcelRead();
		ArrayList excelData = data.getData("Store");
		act.type(objStore.storeName(), (String) excelData.get(0));
		act.type(objStore.storeEmail(), (String) excelData.get(1));
		act.type(objStore.storePhone(), (String) excelData.get(2));
		act.type(objStore.storeCountry(), (String) excelData.get(3));
		act.type(objStore.storeCity(), (String) excelData.get(4));
		act.type(objStore.storeAddress(), (String) excelData.get(5));
		act.type(objStore.storeCustFooter(), (String) excelData.get(6));
		act.click1(objStore.storeAddSubmit(), "Add Store Submit");
		Log.info("Add Store Details entered");
		act.fluentWait(getDriver(), objStore.searchStore(), 5);
		act.click1(objStore.searchStore(), "Search Added Product");
		act.type(objStore.searchStore(), (String) excelData.get(0));
		int tblRowCnt = act.getRowCount(objStore.tableStore());
		Assert.assertTrue(tblRowCnt > 0, "Store Added");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreTest--validateAddStore");
	}

	@Test(priority = 3)
	public void validateSearchStore() {
		Log.startTestCase("VerifyStoreTest--validateSearchStore");
		objLogin.loginFn();
		act.click1(objHome.menuStore(), "Store Menu");
		act.click1(objStore.searchStore(), "Search Store");
		Log.info("Search Store Details entered");
		act.type(objStore.searchStore(), "Test OBS Store");
		act.fluentWait(getDriver(), objStore.tableStore(), 5);
		int tblRowCnt = act.getRowCount(objStore.tableStore());
		Assert.assertTrue(tblRowCnt > 0, "Search Store is displayed");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreTest--validateSearchStore");
	}

	@Test(priority = 4)
	public void validateEditStore() {
		Log.startTestCase("VerifyStoreTest--validateEditStore");
		objLogin.loginFn();
		act.click1(objHome.menuStore(), "Store Menu");
		act.click1(objStore.searchStore(), "Search Store");
		act.type(objStore.searchStore(), "Test OBS Store");
		act.fluentWait(getDriver(), objStore.tableStore(), 10);
		Log.info("Clicked on Edit Store");
		act.click1(objStore.editStore(), "Edit Store");
		act.type(objStore.storeName(), "OBS Store");
		act.type(objStore.storePhone(), "123123");
		Log.info("Edit Store Details entered");
		act.click1(objStore.storeAddSubmit(), "Edit Store Submit");
		act.explicitWait(getDriver(), objStore.showStore(), Duration.ofSeconds(10));
		act.click1(objStore.searchStore(), "Search Store");
		act.type(objStore.searchStore(), "OBS Store");
		act.fluentWait(getDriver(), objStore.tableStore(), 5);
		Assert.assertTrue(objStore.firstElement().isDisplayed(), "Store is Updated");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreTest--validateEditStore");
	}
	
	@Test(priority = 5)
	public void validateStoreSorting() {
		Log.startTestCase("VerifyStoreTest--validateStoreSorting");
		objLogin.loginFn();	
		act.click1( objHome.menuStore(), "Store Menu");
		String strFirstNm = objStore.firstElement().getText();
		act.click1(objStore.btnSortingStore(), "Ascending Sorting");
		String strFirstNmasc = objStore.firstElement().getText();
		Log.info("Ascending Order Sorting");		
		SoftAssert sassrt = new SoftAssert();
		sassrt.assertNotEquals(strFirstNm, strFirstNmasc);
		sassrt.assertAll();				
		act.click1(objStore.btnSortingStore(), "Descending Sorting");
		String strFirstNmdsc = objStore.firstElement().getText();
		sassrt.assertEquals(strFirstNm, strFirstNmdsc);
		sassrt.assertAll();	
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreTest--validateStoreSorting");
	}
}
