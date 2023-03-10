package com.training.seleniumpgms;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver(); // Instantiate a ChromeDriver class
		driver.get("https://www.selenium.dev/"); // Launch Website
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();// To maximize the window

		// To get Title, URl & Page Source
		String strTitle = driver.getTitle();
		System.out.println("Title: " + strTitle);
		String strUrl = driver.getCurrentUrl();
		System.out.println("Url: " + strUrl);
		String strPS = driver.getPageSource();
		System.out.println("Page Source: " + strPS);

		driver.switchTo().newWindow(WindowType.TAB);// To open a new blank window in new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.close();// To close the existing window
		driver.quit();// To close the child windows also
	}

}
