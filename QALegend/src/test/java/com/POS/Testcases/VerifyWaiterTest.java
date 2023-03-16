package com.POS.Testcases;

import java.time.Duration;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.POS.BaseClass.BaseClass;
import com.POS.Utilities.ExcelRead;
import com.POS.Utilities.Log;

public class VerifyWaiterTest extends BaseClass {
	@Test(priority = 1)
	public void validateShowCount() {	
		Log.startTestCase("VerifyWaiterTest--validateShowCount");
		objWaiter.beforefnWaiter();	
		act.selectByVisibleText("50", objWaiter.showWaiterFilter());
		Log.info("Selected show count");	
		int rwcount = act.getRowCount(objWaiter.tableWaiter());
		Assert.assertEquals(rwcount, 50);
		objHome.logOutFn();	
		Log.endTestCase("VerifyWaiterTest--validateShowCount");
	}

	@Test(priority = 2)
	public void validateAddWaiter() throws Exception {
		Log.startTestCase("VerifyWaiterTest--validateAddWaiter");
		objWaiter.beforefnWaiter();		
		act.click1(objWaiter.addWaiter(), "Add Waiter");
		ExcelRead data = new ExcelRead();
		ArrayList excelData = data.getData("Waiter");
		act.type(objWaiter.waiterName(), (String) excelData.get(0));
		act.type(objWaiter.waiterPhone(), (String) excelData.get(1));
		act.type(objWaiter.waiterEmail(), (String) excelData.get(2));
		act.type(objWaiter.waiterStore(), (String) excelData.get(3));
		act.click1(objWaiter.waiterAddSubmit(), "Add Waiter Submit");		
		Assert.assertTrue(objWaiter.addWaiter().isDisplayed(), "Waiter is Added");
		objHome.logOutFn();	
		Log.endTestCase("VerifyWaiterTest--validateAddWaiter");
	}
	
	@Test(priority = 3)
	public void validateSearchWaiter() {
		Log.startTestCase("VerifyWaiterTest--validateSearchWaiter");
		objWaiter.beforefnWaiter();
		Assert.assertTrue(objWaiter.addWaiter().isDisplayed());
		act.type(objWaiter.searchWaiter(), "OBS");
		Log.info("Search waiter entered");		
		int tblRowCnt = act.getRowCount(objWaiter.tableWaiter());
		Assert.assertTrue(tblRowCnt > 0, "Searched Waiter is displayed");
		objHome.logOutFn();	
		Log.endTestCase("VerifyWaiterTest--validateSearchWaiter");
	}

	@Test(priority = 4)
	public void validateEditWaiter() {
		Log.startTestCase("VerifyWaiterTest--validateEditWaiter");
		objWaiter.beforefnWaiter();		
		act.type(objWaiter.searchWaiter(), "OBS");		
		act.click1(objWaiter.editWaiter(), "Edit Waiter");
		act.type(objEditPeople.txtEditWNm(), "OBS Waiter");
		act.type(objEditPeople.txtEditWPhn(), "3434");
		act.type(objEditPeople.txtEditWEm(), "obs@test");
		act.click1(objEditPeople.btnEditWSubmit(), "Edit Waiter Submit");
		act.click1(objWaiter.searchWaiter(), "Search Waiter");
		act.type(objWaiter.searchWaiter(), "OBS");
		int tblRowCnt = act.getRowCount(objWaiter.tableWaiter());
		Assert.assertTrue(tblRowCnt > 0, "Waiter is edited");
		objHome.logOutFn();	
		Log.endTestCase("VerifyWaiterTest--validateEditWaiter");
	}
	
}
