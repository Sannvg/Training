package com.obsqura.testprogram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowHandle {

	@Test
	public void getWindowHandle() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();

		String parentHandle = driver.getWindowHandle();// Getting the current(parent) window handle
		System.out.println("Parent Window: " + parentHandle);

		driver.findElement(By.cssSelector("button[id='newWindowBtn']")).click();
		Thread.sleep(1500);
		
		Set<String> handles = driver.getWindowHandles();// Getting all opened windows handle
		for (String handle : handles) {
			System.out.println("Windows: " + handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);// Switch to the concerned window
				driver.findElement(By.id("firstName")).sendKeys("Child Window");
				Thread.sleep(1500);
				driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Parent Window");
		Thread.sleep(2000);
		driver.quit();
	}

}
