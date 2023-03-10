package com.POS.Testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.POS.BaseClass.BaseClass;
import com.POS.PageObjects.AddStore;
import com.POS.PageObjects.HomePage;
import com.POS.PageObjects.Login;
import com.POS.PageObjects.Store;
import com.POS.Utilities.ExcelRead;
import com.POS.Utilities.Log;

public class VerifyStoreTest extends BaseClass {
	
	@Test(priority = 1)
	public void validateShowCount() {			
		act.click1(objStore.menuStore(), "Store Menu");
		Log.startTestCase("VerifyStoreTest--validateShowCount");		
		Assert.assertTrue(objStore.showStore().isDisplayed());
		act.explicitWait(driver, objStore.showStore(), Duration.ofSeconds(10));
		act.selectByVisibleText("50", objStore.showStore());
		Log.endTestCase("VerifyStoreTest--validateShowCount");
		int rwcount = act.getRowCount(objStore.tableStore());
		Assert.assertEquals(rwcount, 50);
	}
	
	@Test(priority = 0)
	public void validateTableHeaders() {	
		Log.startTestCase("VerifyStoreTest--validateTableHeaders");			
		act.click1(objStore.menuStore(), "Store Menu");
		Assert.assertTrue(objStore.tableStore().isDisplayed());	
		List<WebElement> storetblHdrs = objStore.tblStoreHeaders();
		for(WebElement hdr:storetblHdrs){
			System.out.println(hdr.getText());
		}
		Log.endTestCase("VerifyStoreTest--validateTableHeaders");
		Assert.assertEquals(6, storetblHdrs.size());
	}
	
	@Test(priority = 2)
	public void validateAddStore() throws Exception {
		Log.startTestCase("VerifyStoreTest--validateAddStore");			
		act.click1(objStore.menuStore(), "Store Menu");
		Assert.assertTrue(objStore.addStore().isDisplayed());	
		act.click1(objStore.addStore(), "Add Store");		
		ExcelRead data = new ExcelRead();
		ArrayList excelData = data.getData("Store");		
		act.type(objAddStore.storeName(), (String) excelData.get(0));
		act.type(objAddStore.storeEmail(), (String) excelData.get(1));
		act.type(objAddStore.storePhone(), (String) excelData.get(2));
		act.type(objAddStore.storeCountry(), (String) excelData.get(3));
		act.type(objAddStore.storeCity(), (String) excelData.get(4));
		act.type(objAddStore.storeAddress(), (String) excelData.get(5));
		act.type(objAddStore.storeCustFooter(), (String) excelData.get(6));
		act.click1(objAddStore.storeAddSubmit(), "Add Store Submit");
		act.fluentWait(driver, objStore.searchStore(), 5);
		act.click1(objStore.searchStore(), "Search Added Product");
		act.type(objStore.searchStore(), (String)excelData.get(0));
		Log.info("Add Store Details entered");
		Log.endTestCase("VerifyStoreTest--validateAddStore");
		int tblRowCnt = act.getRowCount(objStore.tableStore());
		Assert.assertTrue(tblRowCnt > 0, "Store Added");
	}
	
	@Test(priority = 3)
	public void validateSearchStore() {			
		Log.startTestCase("VerifyStoreTest--validateSearchStore");
		act.click1(objStore.menuStore(), "Store Menu");
		Assert.assertTrue(objStore.searchStore().isDisplayed());
		act.click1(objStore.searchStore(), "Search Store");
		Log.info("Search Store Details entered");
		act.type(objStore.searchStore(), "TestStore-1");
		act.fluentWait(driver, objStore.tableStore(), 5);
		Log.endTestCase("VerifyStoreTest--validateSearchStore");
		int tblRowCnt = act.getRowCount(objStore.tableStore());
		Assert.assertTrue(tblRowCnt > 0, "Search Product is displayed");
	}

	@Test(priority = 4)
	public void validateEditStore() {			
		Log.startTestCase("VerifyStoreTest--validateEditStore");
		act.click1(objStore.menuStore(), "Store Menu");		
		Assert.assertTrue(objStore.addStore().isDisplayed());
		act.click1(objStore.searchStore(), "Search Store");
		Log.info("Edit Store Details entered");
		act.type(objStore.searchStore(), "TestStore-1");
		act.fluentWait(driver, objStore.tableStore(), 5);
		act.click1(objStore.editStore(), "OBSTestStore-1");
		Log.endTestCase("VerifyStoreTest--validateEditStore");			
	}

	@Test(priority =5)
	public void validateDeleteStore() {		
		Log.startTestCase("VerifyStoreTest--validateDeleteStore");
		act.click1(objStore.menuStore(), "Store Menu");
		Assert.assertTrue(objStore.addStore().isDisplayed());
		act.type(objStore.searchStore(), "OBSTestStore-1");
		act.fluentWait(driver, objStore.tableStore(), 5);
		act.click1(objStore.deleteStore(), "Delete Store");		
		Assert.assertEquals(objStore.noElement().getText(),"No matching records found");	
		System.out.println("Store is Deleted");
		Log.endTestCase("VerifyStoreTest--validateDeleteStore");
	}		
}
