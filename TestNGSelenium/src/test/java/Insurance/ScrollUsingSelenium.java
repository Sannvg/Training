package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollUsingSelenium {
    //program for scroll operations in selenium using action class & javascript executor
	public WebDriver driver;

	@BeforeMethod
	public void loadBrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
	}

	// 3 ways of Scrolling(1.Page Down,2.Particular Element,3.Page(x,y))
	@Test(enabled = false)
	public void pageScrollActionClass() throws InterruptedException {
		WebElement weNews = driver.findElement(By.xpath("//a[contains(text(),'news')]"));
		Actions act = new Actions(driver);
		act.scrollToElement(weNews).perform();
	}

	@Test
	public void pageScrollJscriptExeutor() {
		JavascriptExecutor jscriptExe = (JavascriptExecutor) driver;
		// Scroll to co-ordinates
		// jscriptExe.executeScript("window.scrollTo(0,1000)");
		// Scroll to page bottom
		// jscriptExe.executeScript("window.scrollTo(document.body.scrollHeight)");
		// Scroll to element
		jscriptExe.executeScript("arguments[0].scrollIntoView()",
				driver.findElement(By.xpath("//h2[contains(text(),'Donate')]")));
	}

}
