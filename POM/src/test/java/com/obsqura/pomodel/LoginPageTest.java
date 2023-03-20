package com.obsqura.pomodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void loginFunction() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		
		SwagLabsLoginPage lp = new SwagLabsLoginPage(driver);
		lp.userName().click();
		lp.userName().sendKeys("standard_user");
		lp.pswrd().click();
		lp.pswrd().sendKeys("secret_sauce");
		lp.loginbtnfn().click();
	}
	
	@Test(priority=2)
	public void homePageFunction() {		
		SwagLabsHomePage hp = new SwagLabsHomePage(driver);
		hp.imgBikelt().click();
	}
	
	@Test(priority=3)
	public void bikeLtPageFunction() {		
		SwagLabsBikeLt bl = new SwagLabsBikeLt(driver);
		bl.btnBacktoPdt().click();
	}

}
