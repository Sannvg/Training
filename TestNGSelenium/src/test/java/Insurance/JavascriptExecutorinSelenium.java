package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorinSelenium {
	//program using javascript executor in selenium
	@Test
	public void jscriptExecutor() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		WebElement weCheckbox = driver.findElement(By.xpath("//input[@id='persistent']"));
		JavascriptExecutor jscripte = (JavascriptExecutor)driver;
		jscripte.executeScript("arguments[0].click()", weCheckbox);
	}

}
