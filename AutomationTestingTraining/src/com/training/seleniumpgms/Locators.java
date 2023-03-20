package com.training.seleniumpgms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// program to learn locators tagName, id, name, className, cssSelector, xpath,
		// linkText & partiallinkText
		// Element & Elements
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");

		// driver.findElement(By.id("user-name")).sendKeys("clear");
		// driver.findElement(By.id("user-name")).clear();//clears the text content

		// CssSelector--("tagname[attribute='value']")
		driver.findElement(By.cssSelector("input[id='user-name']")).click();// or
																			// driver.findElement(By.id("user-name")).click();

		// xpath--("//tagname[@attribute='value']")
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");// or
																							// driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).submit();

		driver.findElement(By.className("bm-burger-button")).click();// or
																		// driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("react-burger-cross-btn")).click();
		driver.findElement(By.cssSelector("img[alt='Sauce Labs Backpack']")).click();
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.cssSelector("img[alt='Sauce Labs Onesie']")).click();
		driver.findElement(By.id("back-to-products")).click();

		List<WebElement> lwe = driver
				.findElements(By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']"));// findElements
		for (WebElement i : lwe) {
			System.out.println("Elements are: " + i);
		}
		System.out.println("Size:" + lwe.size());
	}
}
