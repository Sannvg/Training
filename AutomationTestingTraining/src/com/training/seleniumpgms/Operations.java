package com.training.seleniumpgms;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Operations {

	public static void main(String[] args) throws InterruptedException {
		// Program for radiobutton, checkbox & dropdown operations
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.selenium.obsqurazone.com/simple-form-demo.php");

		// Checkbox
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.cssSelector("input[id='gridCheck']")).click();
		driver.findElement(By.cssSelector("input[id='button-two']")).click();

		// Radiobutton
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		driver.findElement(By.xpath("(//button)[2]")).click();// indexing...using xpath we can retrieve a selected
																// indexed element

		driver.findElement(By.cssSelector("input[id='inlineRadio21']")).click();
		driver.findElement(By.cssSelector("input[id='inlineRadio22']")).click();
		driver.findElement(By.xpath("//button[@id='button-two']")).click();

		// Dropdown
		driver.findElement(By.linkText("Select Input")).click();
		WebElement seldrpdwn = driver.findElement(By.id("single-input-field"));// single value selection dropdown
		seldrpdwn.click();
		// Select class in selenium for static dropdown
		Select dpselect = new Select(seldrpdwn);// or Select dpselect = new
												// Select(driver.findElement(By.id("single-input-field"));
		dpselect.selectByIndex(1);
		dpselect.selectByValue("Green");
		dpselect.selectByVisibleText("Yellow");

		WebElement mseldrpdwn = driver.findElement(By.id("multi-select-field"));// multi value selection dropdown
		Select mdpselect = new Select(mseldrpdwn);
		mdpselect.selectByValue("Red");
		mdpselect.selectByVisibleText("Green");
		mdpselect.selectByIndex(1);

		mdpselect.deselectByVisibleText("Green");// mdpselect.deselectByValue("Red");//mdpselect.deselectByIndex(1);
		mdpselect.deselectAll();

		System.out.println("Button displayed: " + driver.findElement(By.id("button-first")).isDisplayed());
		System.out.println("Button enabled: " + driver.findElement(By.id("button-first")).isEnabled());

		driver.close();
	}

}
