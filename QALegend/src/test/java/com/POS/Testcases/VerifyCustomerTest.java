package com.POS.Testcases;

import java.time.Duration;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.POS.BaseClass.BaseClass;
import com.POS.PageObjects.AddCustomer;
import com.POS.PageObjects.Customer;
import com.POS.PageObjects.HomePage;
import com.POS.PageObjects.Login;
import com.POS.Utilities.ExcelRead;
import com.POS.Utilities.Log;

public class VerifyCustomerTest extends BaseClass {
	
	@Test(priority = 1)
	public void validateShowCount() {
		Log.startTestCase("VerifyCustomerTest--validateShowCount");		
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuCustomer(), "Customer Menu");		
		act.click1(objCustomer.showCustomer(),"Show Customer");
		act.selectByVisibleText("50", objCustomer.showCustomer());
		Log.info("Selected show count");
		Log.endTestCase("VerifyCustomerTest--validateShowCount");
		int rwcount = act.getRowCount(objCustomer.tableCustomer());
		Assert.assertEquals(rwcount, 50);
	}

	@Test(priority = 3)
	public void validateSearchCustomer() {
		Log.startTestCase("VerifyCustomerTest--validateSearchCustomer");
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuCustomer(), "Customer Menu");
		Assert.assertTrue(objCustomer.addCustomer().isDisplayed());		
		act.click1(objCustomer.searchCustomer(), "Search Customer");
		act.type(objCustomer.searchCustomer(), "TestCustomer");
		Log.info("Entered customer search");
		Log.endTestCase("VerifyCustomerTest--validateSearchCustomer");
		int tblRowCnt = act.getRowCount(objCustomer.tableCustomer());
		Assert.assertTrue(tblRowCnt > 0, "Search Customer is displayed");
	}	
	@Test(priority = 2)
	public void validateAddCustomer() throws Exception {	
		Log.startTestCase("VerifyCustomerTest--validateAddCustomer");
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuCustomer(), "Customer Menu");			
		ExcelRead data = new ExcelRead();
		ArrayList excelData = data.getData("Customer");
		act.type(objAddCustomer.customerName(), (String) excelData.get(0));
		act.type(objAddCustomer.customerPhone(), (String) excelData.get(1));
		act.type(objAddCustomer.customerEmail(), (String) excelData.get(2));
		act.type(objAddCustomer.customerDiscount(), (String) excelData.get(3));		
		act.click1(objAddCustomer.custAddSubmit(), "Add Customer Submit");	
		act.click1(objCustomer.searchCustomer(), "Search Added Customer");
		act.type(objCustomer.searchCustomer(), (String)excelData.get(0));
		Log.endTestCase("VerifyCustomerTest--validateAddCustomer");
		int tblRowCnt = act.getRowCount(objCustomer.tableCustomer());
		Assert.assertTrue(tblRowCnt > 0, "Customer Added");
	}
	
	@Test(priority = 5)
	public void validateDeleteCustomer() {
		Log.startTestCase("VerifyCustomerTest--validateDeleteCustomer");
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuCustomer(), "Customer Menu");		
		Assert.assertTrue(objCustomer.addCustomer().isDisplayed());		
		act.type(objCustomer.searchCustomer(), "Test");
		act.explicitWait(driver, objCustomer.deleteCustomer(), Duration.ofSeconds(10));
		act.click1(objCustomer.deleteCustomer(), "Delete Customer");
		Log.info("Clicked on Customer delete");
		act.click1(objCustomer.deleteConfirm(), "Confirm Deletion");
		Log.info("Confirmed Customer delete");
		Log.endTestCase("VerifyCustomerTest--validateDeleteCustomer");
		act.type(objCustomer.searchCustomer(), "Test");
		int tblRowCnt = act.getRowCount(objCustomer.tableCustomer());
		Assert.assertEquals(0, tblRowCnt);		
	}	
	
	@Test(priority = 4)
	public void validateEditCustomer() {
		Log.startTestCase("VerifyCustomerTest--validateEditCustomer");	
		act.click1(objHome.menuPeople(), "People Menu");
		act.click1(objHome.menuCustomer(), "Customer Menu");
		Assert.assertTrue(objCustomer.addCustomer().isDisplayed());		
		act.type(objCustomer.searchCustomer(), "Test Customer");
		act.explicitWait(driver, objCustomer.editCustomer(), Duration.ofSeconds(10));
		act.click1(objCustomer.editCustomer(), "Edit Customer");	
		Log.endTestCase("VerifyCustomerTest--validateEditCustomer");
		act.type(objCustomer.searchCustomer(), "Test");		
		Assert.assertTrue(objCustomer.addCustomer().isDisplayed(), "Customer is edited");
	}		
}
