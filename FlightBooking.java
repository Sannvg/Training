package com.obsqura.seleniumpgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.xpath("(//span[@class='InputRadio-module__field___hylYy'])[2]")).click();// Select Way

		// Individual selection
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("div[data-testid='input_occupancy_desktop_passengers_trigger']")).click();
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("button[data-testid='input_occupancy_modal_adults_increase']")).click();
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("button[data-testid='input_occupancy_modal_children_increase']")).click();
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.cssSelector("select[class='InputSelect-module__field___E9sYJ']"));
		Select sl = new Select(select);
		sl.selectByValue("3");
		driver.findElement(By.cssSelector("div[data-testid='input_occupancy_desktop_passengers_trigger']")).click();
		Thread.sleep(1500);
		// Destination
		driver.findElement(By.cssSelector("input[placeholder='Where to?']")).click();
		// driver.findElement(By.cssSelector("button[data-ui-sr='location_input_to_0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='css-11ryvth']")).sendKeys("TRV");
		Thread.sleep(2000);
		List<WebElement> l = driver.findElements(By.cssSelector("li[class='css-7grkf7']"));
		for (WebElement i : l) {
			i.click();
		}
		Thread.sleep(2000);

		// Flight Search
		driver.findElement(By.cssSelector("button[data-testid='searchbox_submit']")).click();
		Thread.sleep(2000);
		// Cheapest flight search
		driver.findElement(By.xpath("//button[@data-testid='search_tabs_CHEAPEST']")).click();
		Thread.sleep(2000);
		List<WebElement> a = driver.findElements(By.xpath("//div[@data-testid='searchresults_card']"));
		WebElement result = driver.findElement(By.xpath("//div[@id='flightcard-0']"));
		String strresult = result.getText();
		Thread.sleep(2000);
		for (WebElement i : a) {
			if (i.getText().contains(strresult)) {
				System.out.println(i.getText());
			}
		}

	}

}
