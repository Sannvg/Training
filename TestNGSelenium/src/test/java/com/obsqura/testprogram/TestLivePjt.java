package com.obsqura.testprogram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLivePjt {
	WebDriver driver;
	
	@BeforeTest
	public void loadBrowser() {
		//driver = new FirefoxDriver();
		//driver.get("https://qalegend.com/restaurant/login");
	}
	
	@Test(priority=1, enabled=false)
	public void getLoginID() {
		driver = new FirefoxDriver();
		driver.get("https://qalegend.com/restaurant/login");
		driver.findElement(By.cssSelector("input[name='username']")).click();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).click();
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".text-center.choose_store")).getText(), "CHOOSE A STORE");
	}
	

	@Test(priority=2)
	public void getStore() {
		driver = new FirefoxDriver();		
		driver.get("https://qalegend.com/restaurant/login");
		driver.findElement(By.cssSelector("input[name='username']")).click();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).click();
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".text-center.choose_store")).getText(), "CHOOSE A STORE");
		//-----//
		
		/*
		 * WebElement div = driver.findElement(By.cssSelector("div[id='loadingimg']"));
		 * JavascriptExecutor jscripte = (JavascriptExecutor)driver;
		 * jscripte.executeScript("arguments[0].click()", div);
		 */
		
		driver.findElement(By.xpath("//a[@href='https://qalegend.com/restaurant/stores']")).click();		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select[name='Table_length']")));
		//element.click();
		driver.findElement(By.cssSelector("select[name='Table_length']")).click();
		Select dpselect = new Select(driver.findElement(By.cssSelector("select[name='Table_length']")));
		dpselect.selectByIndex(2);
		WebElement table = driver.findElement(By.cssSelector("table[id='Table']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		Assert.assertEquals(rows, 25);	
		 
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	

}
