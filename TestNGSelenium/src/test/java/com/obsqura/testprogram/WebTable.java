package com.obsqura.testprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// To print row and column count
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("Row: " + rowCount + " & Column: " + colCount);

		// To print table values
		System.out.println("Table Values are: ");
		List<WebElement> lsttable = driver.findElements(By.xpath("//table[@id='customers']"));
		for(WebElement i:lsttable) {
			System.out.print(i.getText());
		}
		
		// To search for a value and print index
		for (int i = 1; i < rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				String strTableValue = driver
						.findElement(By.xpath("//table[@id='customers']//tr[" + (i + 1) + "]//td[" + j + "]"))
						.getText();
				if (strTableValue.equalsIgnoreCase("Helen Bennett")) {
					System.out.println("\nSelected value is: " + strTableValue +" at row "+i+" and column "+j);
					break;
				}
			}
		}
		
		//To print first column values
		System.out.println("First column values are: ");
		for(int k=1;k<rowCount;k++) {
			System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr[" + (k+1) + "]//td[1]")).getText());
		}
		
		//To print row header
		System.out.println("Row Header: ");
		List<WebElement> lstheader = driver.findElements(By.xpath("//table[@id='customers']//tr//th"));
		for(WebElement h:lstheader) {
			System.out.print(h.getText());
		}		
	}

}
