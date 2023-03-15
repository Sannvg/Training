package com.POS.Testcases;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.POS.BaseClass.BaseClass;
import com.POS.Utilities.ExcelRead;
import com.POS.Utilities.Log;

public class VerifyProductPageTest extends BaseClass {	
	@Test(priority = 1,groups= {"Smoke"})
	public void validateShowPdtTblCount(){	
		Log.startTestCase("VerifyProductPageTest--validateShowPdtTblCount");	
		objLogin.loginFn();			
		act.click1( objHome.menuPdt(), "Product Menu");		
		act.click1(objPdt.showProduct(), "Show Product");
		act.selectByVisibleText("50", objPdt.showProduct());
		Log.info("Selected show count");		
		int rwcount = act.getRowCount(objPdt.tableProduct());
		System.out.println(rwcount);
		String strrowcount = objPdt.lblTblRowdtl().getText();		
		int rwcnt = Integer.parseInt(strrowcount.substring(strrowcount.indexOf("to")+3, strrowcount.indexOf("of")-1));		
		Assert.assertEquals(rwcnt, 50);
		objHome.logOutFn();	
		Log.endTestCase("VerifyProductPageTest--showProduct");
	}
	@Test(priority = 2)
	public void validateFilterBySupplier(){
		Log.startTestCase("VerifyProductPageTest--validateFilterBySupplier");	
		objLogin.loginFn();			
		act.click1( objHome.menuPdt(), "Product Menu");		
		act.click1(objPdt.supplierFilter(), "Supplier Filter");
		act.selectByVisibleText("ObsTestSupplier",objPdt.supplierFilter());
		Log.info("Selected Supplier");
		act.click1(objPdt.applyFilter(), "Apply Filter");
		int rwcount = act.getRowCount(objPdt.tableProduct());
		Assert.assertEquals(true, rwcount>0);
		objHome.logOutFn();	
		Log.endTestCase("VerifyProductPageTest--validateFilterBySupplier");
	}
	@Test(priority = 3)
	public void validateFilterByPdtType(){
		Log.startTestCase("VerifyProductPageTest--validateFilterByPdtType");	
		objLogin.loginFn();			
		act.click1( objHome.menuPdt(), "Product Menu");			
		act.click1(objPdt.pdtTypeFilter(), "Product Type Filter");
		act.selectByVisibleText("Standard",objPdt.pdtTypeFilter());
		Log.info("Selected Product Type");
		act.click1(objPdt.applyFilter(), "Apply Filter");
		int rwcount = act.getRowCount(objPdt.tableProduct());
		Assert.assertEquals(true, rwcount>0);
		objHome.logOutFn();	
		Log.endTestCase("VerifyProductPageTest--filterByPdtType");
	}
	@Test(priority = 4)
	public void validateFilterBySupPdtType(){
		Log.startTestCase("VerifyProductPageTest--validateFilterBySupPdtType");	
		objLogin.loginFn();			
		act.click1( objHome.menuPdt(), "Product Menu");		
		act.click1(objPdt.supplierFilter(), "Supplier Filter");
		act.selectByValue(objPdt.supplierFilter(), "ObsTestSupplier");
		act.click1(objPdt.pdtTypeFilter(), "Product Type Filter");
		act.selectByValue(objPdt.pdtTypeFilter(), "Standard");
		Log.info("Selected Supplier and Product Type");
		act.click1(objPdt.applyFilter(), "Apply Filter");
		int rwcount = act.getRowCount(objPdt.tableProduct());
		Assert.assertEquals(true, rwcount>0);
		objHome.logOutFn();	
		Log.endTestCase("VerifyProductPageTest--validateFilterBySupPdtType");
	}
	@Test(priority = 5)
	public void validateDownloadCSV(){
		Log.startTestCase("VerifyProductPageTest--validateDownloadCSV");
		objLogin.loginFn();			
		act.click1( objHome.menuPdt(), "Product Menu");				
		act.click1(objPdt.downloadFile(), "Download File");
		Assert.assertTrue(objPdt.tableProduct().isDisplayed());
		objHome.logOutFn();	
		Log.endTestCase("VerifyProductPageTest--validateDownloadCSV");
	}
	
	@Test(priority = 7)
	public void validatePrintMenu() throws Exception{
		Log.startTestCase("VerifyProductPageTest--validatePrintMenu");		
		objLogin.loginFn();
		act.click1( objHome.menuPdt(), "Product Menu");		
		act.click1(objPdt.printMenu(), "Print Menu");
		Thread.sleep(3000);
		Robot rb =new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		act.switchToOldWindow(getDriver());	
		act.click1(objPdt.printMenuClose(), "Print Menu Close");
		objHome.logOutFn();
		Log.endTestCase("VerifyProductPageTest--validatePrintMenu");
	}
	@Test(priority =8)
	public void validateAddProduct() throws Exception{	
		Log.startTestCase("VerifyProductPageTest--validateAddProduct");	
		objLogin.loginFn();	
		act.click1( objHome.menuPdt(), "Product Menu");
		act.click1(objPdt.addPdt(), "Add Product");			
		ExcelRead data = new ExcelRead();
		ArrayList excelData = data.getData("Product");
		act.selectByValue(objAddPdt.pdtType(), (String) excelData.get(0));
		act.type(objAddPdt.pdtCode(), (String) excelData.get(1));
		act.type(objAddPdt.pdtName(), (String) excelData.get(2));
		act.selectByValue(objAddPdt.pdtCategory(), (String) excelData.get(3));
		act.selectByValue(objAddPdt.pdtSupplier(), (String) excelData.get(4));
		act.type(objAddPdt.pdtPurchasePrice(), (String) excelData.get(5));
		act.type(objAddPdt.pdtTax(), (String) excelData.get(6));
		act.selectByValue(objAddPdt.pdtTaxType(), (String) excelData.get(7));
		act.type(objAddPdt.pdtPrice(), (String) excelData.get(8));
		act.type(objAddPdt.pdtUnit(), (String) excelData.get(9));
		act.type(objAddPdt.pdtAlertqty(), (String) excelData.get(10));
		act.type(objAddPdt.pdtOptions(), (String) excelData.get(11));
		act.type(objAddPdt.pdtImageInput(), (String) excelData.get(12));
		act.type(objAddPdt.pdtDescription(), (String) excelData.get(13));
		act.click1(objAddPdt.addPdtSubmit(), "Add Product Submit");				
		act.fluentWait(getDriver(), objPdt.searchPdt(), 5);		
		act.type(objPdt.searchPdt(), (String) excelData.get(0));
		int tblRowCnt = act.getRowCount(objPdt.tableProduct());
		Assert.assertTrue(tblRowCnt > 0, "Product is added");
		objHome.logOutFn();
		Log.endTestCase("VerifyProductPageTest--validateAddProduct");
	}
	@Test(priority = 9)
	public void validateSearchPdt() {
		Log.startTestCase("VerifyProductPageTest--validateSearchPdt");
		objLogin.loginFn();		
		act.click1( objHome.menuPdt(), "Product Menu");
		act.click1(objPdt.searchPdt(), "Search Product");
		act.type(objPdt.searchPdt(), "OBS");
		Log.info("Search product entered");		
		int tblRowCnt = act.getRowCount(objPdt.tableProduct());
		Assert.assertTrue(tblRowCnt > 0, "Search Product is displayed");
		objHome.logOutFn();
		Log.endTestCase("VerifyProductPageTest--validateSearchPdt");
	}

}
