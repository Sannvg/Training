package com.POS.Testcases;

import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.POS.BaseClass.BaseClass;
import com.POS.Utilities.Log;

public class VerifyStoreManageTest extends BaseClass {

	@Parameters({ "ZoneName" })
	@Test(priority = 1)
	public void validateAddZone(String strNm) {
		Log.startTestCase("VerifyStoreManageTest-validateAddZone");
		objMngStore.beforefn();
		act.click1(objMngStore.btnaddZone(), "Add Zone");
		act.click1(objMngStore.AddZoneName(), "Zone Name");
		act.type(objMngStore.AddZoneName(), strNm);
		Log.info("Entered Zone");
		act.click1(objMngStore.addZoneSubmit(), "Add Zone Submit");
		act.explicitWait(getDriver(), objMngStore.lblStoreZone(), Duration.ofSeconds(10));
		Assert.assertEquals(objMngStore.lblStoreZone().getText(), "Store Zones");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreManageTest-validateAddZone");
	}

	@Test(priority = 2)
	public void validateEditZone() {
		Log.startTestCase("VerifyStoreManageTest-validateEditZone");
		objMngStore.beforefn();
		act.click1(objMngStore.btnEditZone(), "Edit Zone");
		act.click1(objMngStore.editZoneName(), "Edit Zone Name");
		act.type(objMngStore.editZoneName(), "OBS Zone");
		Log.info("Edited Zone");
		act.click1(objMngStore.editZoneSubmit(), "Edit Zone Submit");
		Assert.assertEquals(objMngStore.lblStoreZone().getText(), "Store Zones");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreManageTest-validateEditZone");
	}

	@Parameters({ "StoreTblNm" })
	@Test(priority = 3)
	public void validateAddStoreTable(String strTblNm) {
		Log.startTestCase("VerifyStoreManageTest-validateAddStoreTable");
		objMngStore.beforefn();
		act.click1(objMngStore.btnaddStoreTable(), "Add Store Table");
		act.click1(objMngStore.txtAddStoreTblNm(), "Store Table Name");
		act.type(objMngStore.txtAddStoreTblNm(), strTblNm);
		Log.info("Entered table name");
		act.selectByVisibleText("OBS Zone", objMngStore.drpAddStoreZone());
		Log.info("Selected zone");
		act.click1(objMngStore.btnAddStoreTblSubmit(), "Add Store Table Submit");
		Log.info("Store Table is Added");
		Assert.assertEquals(objMngStore.lblStoreZone().getText(), "Store Zones");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreManageTest-validateAddStoreTable");
	}

	@Test(priority = 4)
	public void validateEditStoreTable() {
		Log.startTestCase("VerifyStoreManageTest-validateEditStoreTable");
		objMngStore.beforefn();
		act.click1(objMngStore.storeTableEdit(), "Store Table Edit");
		act.type(objMngStore.txtAddStoreTblNm(), "OBS Store Tbl");
		Log.info("Edit Store Table Name");
		act.click1(objMngStore.btnEditStoreTblSubmit(), "Edit StoreTbl Submit");
		Log.info("Store Table is Edited");
		Assert.assertEquals(objMngStore.lblStoreZone().getText(), "Store Zones");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreManageTest-validateEditStoreTable");
	}

	@Test(priority = 5)
	public void validateDeleteStoreTbl() {
		Log.startTestCase("VerifyStoreManageTest-validateDeleteStoreTbl");
		objMngStore.beforefn();
		act.click1(objMngStore.storeTableDelete(), "Delete Store Table");
		Log.info("Deleted table");
		Assert.assertEquals(objMngStore.lblStoreZone().getText(), "Store Zones");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreManageTest-validateDeleteStoreTbl");
	}

	@Test(priority = 6)
	public void validateDeleteZone() {
		Log.startTestCase("VerifyStoreManageTest-validateDeleteZone");
		objMngStore.beforefn();
		act.click1(objMngStore.deleteZone(), "Delete Zone");
		act.click1(objMngStore.deleteZoneConfirm(), "Confirm Delete");
		Log.info("Deleted Zone");
		Assert.assertEquals(objMngStore.lblStoreZone().getText(), "Store Zones");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreManageTest-validateDeleteZone");
	}

	@Test(priority = 7)
	public void validateDeleteStore() {
		Log.startTestCase("VerifyStoreTest--validateDeleteStore");
		objLogin.loginFn();
		act.click1(objHome.menuStore(), "Store Menu");
		act.click1(objStore.searchStore(), "Search Store");
		act.type(objStore.searchStore(), "OBS Store");
		act.fluentWait(getDriver(), objStore.tableStore(), 5);
		act.click1(objStore.deleteStore(), "Delete Store");
		act.fluentWait(getDriver(), objStore.tableStore(), 5);
		act.click1(objStore.searchStore(), "Search Store");
		act.type(objStore.searchStore(), "OBS Store");
		Assert.assertEquals(objStore.noRecords().getText(), "No matching records found");
		objHome.logOutFn();
		Log.endTestCase("VerifyStoreTest--validateDeleteStore");
	}

}
