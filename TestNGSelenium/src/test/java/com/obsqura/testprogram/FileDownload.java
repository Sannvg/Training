package com.obsqura.testprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://filesamples.com/formats/csv");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("a[href='/samples/document/csv/sample4.csv'] "));
		driver.findElement(By.id("ezmob-footer-close")).click();
		driver.findElement(By.xpath("(//a[@class='btn btn-primary pull-right'])[3]")).click();
		Thread.sleep(1000);

		//driver.close();
	}

}
