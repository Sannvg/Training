package com.obsqura.pomodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsBikeLt {
	
	//POM with page factory
	
	WebDriver driver;
	
	@FindBy(id="back-to-products")
	WebElement btnBacktPdt;
	
	public SwagLabsBikeLt(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);//to initialize all web elements as page object factory model
	}

	public WebElement btnBacktoPdt() {
		return btnBacktPdt;
	}

}
