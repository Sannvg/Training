package com.POS.PageObjects;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.POS.BaseClass.BaseClass;

public class Login extends BaseClass {
	@FindBy(css = "img[alt='logo']")
	WebElement Logo;
	@FindBy(xpath = "//h1[text()='Login']")
	WebElement lblLogin;
	@FindBy(css = "input[name='username']")
	WebElement txtUsername;
	@FindBy(css = "input[name='password']")
	WebElement txtPswrd;
	@FindBy(css = "input[name='submit']")
	WebElement btnLogin;

	public Login() {
		PageFactory.initElements(getDriver(), this);
	}

	public WebElement dispLogo() {
		return Logo;
	}

	public WebElement dispLogin() {
		return lblLogin;
	}

	public WebElement userName() {
		return txtUsername;
	}

	public WebElement password() {
		return txtPswrd;
	}

	public WebElement loginBtn() {
		return btnLogin;
	}

	// Method to check whether the Login page is loaded- If present will get True
	// else will get False
	public Boolean isLogoPresent() {
		return act.isDisplayed(getDriver(), Logo);
	}

	public void loginFn() {
		act.type(txtUsername, prop.getProperty("Username"));
		act.type(txtPswrd, prop.getProperty("Password"));
		act.explicitWait(getDriver(), btnLogin, Duration.ofSeconds(10));
		act.click1(btnLogin, "Login Button");
	}

}
