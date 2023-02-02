package com.obsqura.seleniumpgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCmnds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		//sendKeys(),clear(),click(),submit(),isSelected(),isEnabled(),isDisplayed(),getText(),getTagName(),getAttribute(),getCSSValue(),getSize(),getLocation()
		
		driver.findElement(By.linkText("Simple Form Demo")).click();
		driver.findElement(By.id("single-input-field")).click();
		driver.findElement(By.className("form-control")).sendKeys("Obsqura");
		Thread.sleep(2000);
		driver.findElement(By.id("single-input-field")).clear();
		driver.findElement(By.className("form-control")).sendKeys("Obsqura Test Message");
		driver.findElement(By.cssSelector("button[id='button-one']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='value-a']")).click();
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys("3");
		driver.findElement(By.cssSelector("input[id='value-b']")).click();
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys("5");
		driver.findElement(By.cssSelector("button[id='button-two']")).click();
		
		Dimension size = driver.findElement(By.linkText("Simple Form Demo")).getSize();
		System.out.println("Size: "+size.getWidth()+","+size.getHeight());
		Point location = driver.findElement(By.linkText("Simple Form Demo")).getLocation();
		System.out.println("Location: "+location.getX()+","+location.getY());
		System.out.println("Text: "+driver.findElement(By.id("button-one")).getText());
		System.out.println("Attribute: "+driver.findElement(By.id("button-one")).getAttribute("id"));
		System.out.println("TagName: "+driver.findElement(By.className("form-group")).getTagName());
		System.out.println("Font Weight: "+driver.findElement(By.id("button-one")).getCssValue("font-weight"));
	}

}
