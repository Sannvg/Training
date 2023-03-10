package com.obsqura.testprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("input-username")).click();
		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).click();
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.cssSelector("button[type='Submit']")).click();
		
		driver.findElement(By.xpath("//div[@class='modal-header']//button")).click();
		
		driver.findElement(By.cssSelector("a[href='#collapse-4']")).click();
		driver.findElement(By.linkText("Sales")).click();
		
		//total number of pages
		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);
		
		int totalpages = Integer.valueOf(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		System.out.println("Total no: of Pages: "+totalpages);
		
		for(int i=1;i<=totalpages;i++) {
			WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']//span"));
			System.out.println("Active Page: " +activePage.getText());
			activePage.click();
			
			int rows=  driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			System.out.println("No: of rows: "+rows);
			
			//to read the rows
			for(int r=1;r<=rows;r++) {
				String orderId = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[1]")).getText();
				String custName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				System.out.println(orderId+ "  "+custName  );
			}
			
			String pageno = Integer.toString(i+1);
			driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+pageno+"']")).click();
		}
	}

}
