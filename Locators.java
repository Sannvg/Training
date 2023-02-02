package com.obsqura.seleniumpgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//tagName, id, name, className, cssSelector, xpath, linkText & partiallinkText --Locators
		//Element & Elements
		driver.get("https://www.saucedemo.com/");		
		
		driver.findElement(By.id("user-name")).sendKeys("clear");
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).clear();//clears the text content
		
		//CssSelector--("tagname[attribute='value']")
		driver.findElement(By.cssSelector("input[id='user-name']")).click();//or driver.findElement(By.id("user-name")).click();
				
		//xpath--("//tagname[@attribute='value']")
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");//or driver.findElement(By.id("user-name")).sendKeys("standard_user");
				
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).submit();
			
		driver.findElement(By.className("bm-burger-button")).click();//or driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Bolt")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("back-to-products")).click();
		List<WebElement> lwe = driver.findElements(By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']"));//findElements
		for(WebElement i:lwe)
		{
			System.out.println("Elements are: "+i);			
		}
		System.out.println("Size:" +lwe.size());		
		
	}
}
