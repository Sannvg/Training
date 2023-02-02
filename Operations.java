package com.obsqura.seleniumpgms;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Operations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//radiobutton,checkbox,dropdown
		
		driver.get("https://www.selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.cssSelector("input[id='gridCheck']")).click();
		driver.findElement(By.cssSelector("input[id='button-two']")).click();
				
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		driver.findElement(By.xpath("(//button)[2]")).click();//indexing...using xpath we can retrieve a selected indexed element
		
		driver.findElement(By.cssSelector("input[id='inlineRadio21']")).click();
		driver.findElement(By.cssSelector("input[id='inlineRadio22']")).click();
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		
		driver.findElement(By.linkText("Select Input")).click();
		//driver.findElement(By.id("single-input-field")).click();
		WebElement seldrpdwn = driver.findElement(By.id("single-input-field"));
		seldrpdwn.click();
		Thread.sleep(2000);
		//Select class in selenium for static dropdown
		Select dpselect = new Select(seldrpdwn);//or Select dpselect = new Select(driver.findElement(By.id("single-input-field"));
		dpselect.selectByIndex(1);
		Thread.sleep(2000);
		dpselect.selectByValue("Green");
		Thread.sleep(2000);
		dpselect.selectByVisibleText("Yellow");
		
		WebElement mseldrpdwn = driver.findElement(By.id("multi-select-field"));
		Select mdpselect = new Select(mseldrpdwn);
		mdpselect.selectByValue("Red");
		mdpselect.selectByVisibleText("Green");
		mdpselect.selectByIndex(1);
		Thread.sleep(2500);
		
		mdpselect.deselectByVisibleText("Green");//mdpselect.deselectByValue("Red");//mdpselect.deselectByIndex(1);
		Thread.sleep(2500);			
		mdpselect.deselectAll();
		System.out.println("Button displayed: "+driver.findElement(By.id("button-first")).isDisplayed());
		System.out.println("Button enabled: "+driver.findElement(By.id("button-first")).isEnabled());
	}

}
