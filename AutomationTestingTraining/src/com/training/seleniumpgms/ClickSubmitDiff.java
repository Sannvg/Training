package com.training.seleniumpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickSubmitDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input[id='user-name']")).click();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("password")).submit();// submit the form
		// driver.findElement(By.name("login-button")).click();//the button click will
		// happen
	}

}
