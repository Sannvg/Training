package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	//program using parameters in selenium(refer smoke.xml file too and execute smoke file)
	public WebDriver driver;
	
	@Parameters({"URL"})//URL must be the same name which is given in xml file
	
	@Test(priority=1)
	public void getUrl(String strurl) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(strurl);
		Assert.assertTrue(driver.findElement(By.cssSelector("div[class='bot_column']")).isDisplayed());
	}
	
	@Parameters({"UserName","Password"})
	
	@Test(priority=2)
	public void getLogin(String strusername, String strpswrd) {
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys(strusername);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(strpswrd);
		driver.findElement(By.id("login-button")).click();
		Assert.assertEquals(true, driver.findElement(By.cssSelector("span[class= 'title']")).isDisplayed());
	}

}
