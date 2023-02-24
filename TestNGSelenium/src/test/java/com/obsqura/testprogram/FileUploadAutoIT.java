package com.obsqura.testprogram;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.foundit.in/seeker/registration");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("span[class='browse-text']")).click();
		
		//To call AutoIT script
		Runtime.getRuntime().exec("C:\\Users\\Thomas\\Documents\\Test.exe");
		
		Thread.sleep(2000);
		driver.close();
	}

}
