package com.training.seleniumpgms;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.selenium.dev/");
		driver.navigate().refresh();

		driver.navigate().back();

		driver.navigate().forward();
		driver.close();
	}

}
