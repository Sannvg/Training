package com.obsqura.seleniumpgms;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		//driver.navigate().to("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("selenium dev");
		//driver.findElement(By.name("btnK")).submit();
		driver.navigate().to("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("navbarDropDown")).submit();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();	
		
		driver.close();
	}

}
