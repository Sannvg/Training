package com.obsqura.pomodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwagLabsLoginPage {

	WebDriver driver;
	
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By loginButton = By.xpath("//input[@id='login-button']");

	public SwagLabsLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement userName() {
		return driver.findElement(username);
	}

	public WebElement pswrd() {
		return driver.findElement(password);
	}

	public WebElement loginbtnfn() {
		return driver.findElement(loginButton);
	}
}
