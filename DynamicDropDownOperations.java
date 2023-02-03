package com.obsqura.seleniumpgms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.obsqurazone.com/jquery-select.php");

		// dropdown with single value selection
		driver.findElement(By.className("select2-selection__rendered")).click();
		driver.findElement(By.cssSelector("input[role='searchbox']")).sendKeys("W");
		List<WebElement> ldrpdwn = driver.findElements(By.cssSelector("li[role='option']"));
		for (WebElement i : ldrpdwn) {
			System.out.println(i.getText());
			if (i.getText().equalsIgnoreCase("Iowa")) {
				i.click();
			}
		}

		// dropdown with multiple values selection
		List<WebElement> lstfrmselect = new ArrayList<>();
		List<String> lsttoselect = new ArrayList<>();
		lsttoselect.add("Alaska");
		lsttoselect.add("California");

		for (int k = 0; k < lsttoselect.size(); k++) {
			driver.findElement(By.cssSelector("span[tabindex='-1']")).click();
			lstfrmselect = driver.findElements(By.xpath("//li[@role='option']"));
			for (WebElement j : lstfrmselect) {
				if (lsttoselect.get(k).equalsIgnoreCase(j.getText())) {
					j.click();
					break;
				}
			}
		}
		Thread.sleep(2000);

		// deselection
		for (int i = lsttoselect.size(); i > 0; i--) {
			driver.findElement(By.cssSelector("span[class='select2-selection select2-selection--multiple']")).click();
			List<WebElement> lstdeselection = driver
					.findElements(By.cssSelector("ul[class='select2-selection__rendered']"));
			for (WebElement a : lstdeselection) {
				a.findElement(By.cssSelector("button[class='select2-selection__choice__remove']")).click();
			}

		}
	}

}
