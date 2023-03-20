package com.training.seleniumpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.cssSelector("input[placeholder='Where to?']")).click();
	}

}
