package com.obsqura.testprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpoadSendKeys {
	
		public WebDriver driver;

		@BeforeTest
		public void browserload() {
			driver = new ChromeDriver();
			driver.get("https://blueimp.github.io/jQuery-File-Upload/");
			driver.manage().window().maximize();
			Assert.assertSame("jQuery File Upload Demo", driver.findElement(By.xpath("//h1[@id='title']")).getText());
			System.out.println("Browser Loaded");
		}

		@Test
		public void fileUpload() throws InterruptedException {
			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C://Users//Thomas//Desktop//Test.jpg");
			Assert.assertEquals(true, driver.findElement(By.cssSelector(".glyphicon.glyphicon-edit")).isDisplayed());
			Thread.sleep(2000);
		}

		@AfterTest
		public void Browserclose() {
			driver.close();
		}
	

}
