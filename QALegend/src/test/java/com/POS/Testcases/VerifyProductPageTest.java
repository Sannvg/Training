package com.POS.Testcases;

import java.time.Duration;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.POS.BaseClass.BaseClass;
import com.POS.PageObjects.AddProduct;
import com.POS.PageObjects.HomePage;
import com.POS.PageObjects.Login;
import com.POS.PageObjects.Product;
import com.POS.Utilities.ExcelRead;
import com.POS.Utilities.Log;

public class VerifyProductPageTest extends BaseClass {

	@Test(priority = 1)
	public void validateShowPdtTblCount() {	
		Log.startTestCase("VerifyProductPageTest--validateShowPdtTblCount");
		act.click1(objPdt.menuPdt(), "Product Menu");
		act.explicitWait(driver, objPdt.showProduct(), Duration.ofSeconds(10));
		act.click1(objPdt.showProduct(), "Show Product");
		act.selectByVisibleText("50", objPdt.showProduct());
		Log.info("Selected show count");
		Log.endTestCase("VerifyProductPageTest--showProduct");
		int rwcount = act.getRowCount(objPdt.tableProduct());
		Assert.assertEquals(rwcount, 50);
	}

	@Test(priority = 2)
	public void validateFilterBySupplier() {
		Log.startTestCase("VerifyProductPageTest--validateFilterBySupplier");
		act.click1(objPdt.menuPdt(), "Product Menu");
		act.explicitWait(driver, objPdt.supplierFilter(), Duration.ofSeconds(10));
		Assert.assertTrue(objPdt.supplierFilter().isDisplayed());		
		act.click1(objPdt.supplierFilter(), "Supplier Filter");
		act.selectByValue(objPdt.supplierFilter(), "ObsTestSupplier");
		Log.info("Selected Supplier");
		act.click1(objPdt.applyFilter(), "Apply Filter");
		int rwcount = act.getRowCount(objPdt.tableProduct());
		Assert.assertEquals(true, rwcount>0);
		Log.endTestCase("VerifyProductPageTest--validateFilterBySupplier");
	}

	@Test(priority = 4)
	public void validateFilterByPdtType() {
		Log.startTestCase("VerifyProductPageTest--validateFilterByPdtType");
		act.click1(objPdt.menuPdt(), "Product Menu");
		act.explicitWait(driver, objPdt.pdtTypeFilter(), Duration.ofSeconds(10));
		Assert.assertTrue(objPdt.pdtTypeFilter().isDisplayed());		
		act.click1(objPdt.pdtTypeFilter(), "Product Type Filter");
		act.selectByValue(objPdt.pdtTypeFilter(), "Standard");
		Log.info("Selected Product Type");
		act.click1(objPdt.applyFilter(), "Apply Filter");
		int rwcount = act.getRowCount(objPdt.tableProduct());
		Assert.assertEquals(true, rwcount>0);
		Log.endTestCase("VerifyProductPageTest--filterByPdtType");
	}

	@Test(priority = 5)
	public void validateFilterBySupPdtType() {
		Log.startTestCase("VerifyProductPageTest--validateFilterBySupPdtType");
		act.click1(objPdt.menuPdt(), "Product Menu");
		act.explicitWait(driver, objPdt.supplierFilter(), Duration.ofSeconds(10));		
		act.click1(objPdt.supplierFilter(), "Supplier Filter");
		act.selectByValue(objPdt.supplierFilter(), "ObsTestSupplier");
		act.click1(objPdt.pdtTypeFilter(), "Product Type Filter");
		act.selectByValue(objPdt.pdtTypeFilter(), "Standard");
		Log.info("Selected Supplier and Product Type");
		act.click1(objPdt.applyFilter(), "Apply Filter");
		int rwcount = act.getRowCount(objPdt.tableProduct());
		Assert.assertEquals(true, rwcount>0);
		Log.endTestCase("VerifyProductPageTest--validateFilterBySupPdtType");
	}

	@Test(priority = 6)
	public void validateSearchPdt() {
		Log.startTestCase("VerifyProductPageTest--validateSearchPdt");
		act.click1(objPdt.menuPdt(), "Product Menu");
		act.explicitWait(driver, objPdt.searchPdt(), Duration.ofSeconds(10));
		Assert.assertTrue(objPdt.addPdt().isDisplayed());	
		act.click1(objPdt.searchPdt(), "Search Product");
		act.type(objPdt.searchPdt(), "Obs");
		Log.info("Search product entered");
		Log.endTestCase("VerifyProductPageTest--validateSearchPdt");
		int tblRowCnt = act.getRowCount(objPdt.tableProduct());
		Assert.assertTrue(tblRowCnt > 0, "Search Product is displayed");
	}

	@Test(priority = 7)
	public void validateDownloadCSV() {
		Log.startTestCase("VerifyProductPageTest--validateDownloadCSV");
		act.explicitWait(driver, objPdt.menuPdt(), Duration.ofSeconds(10));
		act.click1(objPdt.menuPdt(), "Product Menu");
		Assert.assertTrue(objPdt.addPdt().isDisplayed());		
		act.click1(objPdt.downloadFile(), "Download File");
		Log.endTestCase("VerifyProductPageTest--validateDownloadCSV");
	}

	@Test(priority = 8)
	public void validateUploadCSV() {
		Log.startTestCase("VerifyProductPageTest--validateUploadCSV");	
		act.click1(objPdt.menuPdt(), "Product Menu");
		Assert.assertTrue(objPdt.addPdt().isDisplayed());		
		act.click1(objPdt.uploadFile(), "Upload File");
		act.explicitWait(driver, objPdt.uploadImageFile(), Duration.ofSeconds(10));
		act.click1(objPdt.uploadImageFile(), "Choose File to Upload");		
		act.type(objPdt.uploadImageFile(),"C://Users//Thomas//Desktop//Test.jpg");
		Log.info("File Upload is given");
		act.explicitWait(driver, objPdt.uploadFileSubmit(), Duration.ofSeconds(10));
		act.click1(objPdt.uploadFileSubmit(), "File Upload Submit");		
		Log.endTestCase("VerifyProductPageTest--validateUploadCSV");
		Assert.assertTrue(objPdt.addPdt().isDisplayed());
	}

	@Test(priority = 9)
	public void validatePrintMenu() {
		Log.startTestCase("VerifyProductPageTest--validatePrintMenu");			
		act.click1(objPdt.menuPdt(), "Product Menu");
		Assert.assertTrue(objPdt.addPdt().isDisplayed());
		act.click1(objPdt.printMenu(), "Print Menu");
		Log.endTestCase("VerifyProductPageTest--validatePrintMenu");
	}
	@Test(priority =10)
	public void validateAddProduct() throws Exception{	
		Log.startTestCase("VerifyProductPageTest--validateAddProduct");		
		act.click1(objHome.menuPdt(), "Product Menu");				
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
		Log.endTestCase("VerifyProductPageTest--validateAddProduct");
		act.fluentWait(driver, objPdt.searchPdt(), 5);		
		act.type(objPdt.searchPdt(), (String) excelData.get(0));
		int tblRowCnt = act.getRowCount(objPdt.tableProduct());
		Assert.assertTrue(tblRowCnt > 0, "Product is added");
	}
}
