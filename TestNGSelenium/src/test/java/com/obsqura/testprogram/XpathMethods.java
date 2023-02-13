package com.obsqura.testprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathMethods {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//xpath for siblings
		System.out.println("Siblings:ALL ITEMS,ABOUT,LOGOUT,RESET");
		driver.findElement(By.id("react-burger-menu-btn")).click();
		System.out.println("Following Sibling of All Items: " +driver.findElement(By.xpath("//a[text()='All Items']/following-sibling::a[1]")).getText());
		System.out.println("Preceding Sibling of About: " +driver.findElement(By.xpath("//a[text()='About']/preceding-sibling::a")).getText());
		
		//Xpath for cousins		
		System.out.println("Cousins: Twitter,Facebook,LinkedIn");
		System.out.println("2nd Following Cousin of Twitter : " +driver.findElement(By.xpath("//a[text()='Twitter']/following::a[2]")).getText());
		System.out.println("Preceding Cousin of Faebook: "+ driver.findElement(By.xpath("//a[text()='Facebook']/preceding::li")).getText());
	}

}
