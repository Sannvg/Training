package com.POS.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.POS.Actions.Action;
import com.POS.PageObjects.AddCustomer;
import com.POS.PageObjects.AddProduct;
import com.POS.PageObjects.AddStore;
import com.POS.PageObjects.AddWaiter;
import com.POS.PageObjects.Customer;
import com.POS.PageObjects.HomePage;
import com.POS.PageObjects.Login;
import com.POS.PageObjects.Product;
import com.POS.PageObjects.Store;
import com.POS.PageObjects.Supplier;
import com.POS.PageObjects.Waiter;
import com.POS.Utilities.ExtentReport;
import com.aventstack.extentreports.ExtentReports;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static Action act;
	public static ExtentReport ext;
	public static Login objLogin;
	public static HomePage objHome;
	public static Product objPdt;
	public static AddProduct objAddPdt;
	public static Store objStore;
	public static AddStore objAddStore;
	public static Waiter objWaiter;
	public static AddWaiter objAddWaiter;
	public static Customer objCustomer;
	public static AddCustomer objAddCustomer;
	public static Supplier objSupplier;
	
	@BeforeSuite
	public void loadFiles() {
		DOMConfigurator.configure("log4j.xml");
		ExtentReport.setExtent();
	}

	@BeforeTest
	public void loadConfig() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configurations\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public void userLogin() {
		launchApp();
		objLogin.loginFn();
	}
	@AfterMethod
	public void userLogOut() {		
		objHome.logOutFn();
	}
	
	public void launchApp() {
		String browserName = prop.getProperty("Browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {

			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		// Maximize the screen
		driver.manage().window().maximize();
		act = new Action();
		// Implicit TimeOuts
		act.implicitWait(driver, 10);
		// PageLoad TimeOuts
		act.pageLoadTimeOut(driver, 30);
		driver.get(prop.getProperty("Url"));

	}

	@AfterSuite
	public void tearDown() {
		driver.close();
		ExtentReport.endReport();
	}

}
