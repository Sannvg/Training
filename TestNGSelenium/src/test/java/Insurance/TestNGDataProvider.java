package Insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	//program using DataProvider
	public WebDriver driver;
	
	@BeforeMethod
	public void browserLoad() {
		driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "getLogin")
	public void swaglabs(String username, String password) {		
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}
	
	@DataProvider
	public Object[][] getLogin() {
		Object[][] arrlogindata = new Object[3][2];
		arrlogindata[0][0] = "standard_user";
		arrlogindata[0][1] = "secret_sauce";
		arrlogindata[1][0] = "locked_out_user";
		arrlogindata[1][1] = "secret_sauce";
		arrlogindata[2][0] = "problem_user";
		arrlogindata[2][1] = "secret_sauce";
		return arrlogindata;
	}
	
	@AfterMethod
	public void browserClose() throws InterruptedException {
		driver.close();
	}
}
