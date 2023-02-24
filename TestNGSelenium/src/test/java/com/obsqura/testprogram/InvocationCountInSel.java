package com.obsqura.testprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvocationCountInSel {
	//program to execute a test case multiple times..use invocation count parameter
	
	@Test(invocationCount=2)	
	public void userDetails() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://randomuser.me/");
		
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		System.out.println("User Name: "+ driver.findElement(By.id("user_value")).getText());
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		System.out.println("Email: "+ driver.findElement(By.id("user_value")).getText());
	}

}
