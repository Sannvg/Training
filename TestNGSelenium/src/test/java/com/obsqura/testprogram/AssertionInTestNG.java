package com.obsqura.testprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {

	@Test
	public void getLoginID() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='bot_column']")).isDisplayed());
		//Hard Assert-Below code will not be executed if the above assert fails
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//Soft Assert
		SoftAssert sassert = new SoftAssert();
		sassert.assertEquals(true, driver.findElement(By.cssSelector("span[class= 'title']")).isDisplayed());
		//below codes will be executed even if above assertion fails
		System.out.println("Title Product");
		sassert.assertSame("PRODUCT", driver.findElement(By.cssSelector("span[class= 'title']")).getText());
		//above assertion fails as the text product differs
		System.out.println("Title is PRODUCT");
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		sassert.assertAll();
	}
	
}
