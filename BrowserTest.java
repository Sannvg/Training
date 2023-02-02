package com.obsqura.testingtraining.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
	            "webdriver.chrome.driver","D:\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        WebDriver driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	  
	        // Launch Website
	        driver.get("https://www.selenium.dev/");
	        //driver.getTitle();
	        String strTitle = driver.getTitle();
			System.out.println("Title: " +strTitle);
	        //driver.getCurrentUrl();
	        //driver.getPageSource();
	      
	        driver.close();
	       // driver.quit();
	}

}
