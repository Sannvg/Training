package com.POS.Testcases;

import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.POS.BaseClass.BaseClass;
import com.POS.Utilities.Log;

public class VerifyUserLoginTest extends BaseClass {
	@Test(priority = 1)
	public void validateLogin() {
		Log.startTestCase("VerifyUserLoginTest-validateLogin");
		objLogin.loginFn();
		act.explicitWait(getDriver(), objHome.storeMenu(), Duration.ofSeconds(10));
		Assert.assertEquals(objHome.storeMenu().getText(), "CHOOSE A STORE");
		Log.info("User logged in");
		Log.endTestCase("VerifyUserLoginTest-validateLogin");
		objHome.logOutFn();
	}

	@Test(dataProvider = "getLoginUsers", priority = 2)
	public void validateAllLogin(String userNm, String psWrd) {
		Log.startTestCase("VerifyUserLoginTest-validateAllLogin");
		act.type(objLogin.userName(), userNm);
		Log.info("UserName Entered");
		act.type(objLogin.password(), psWrd);
		Log.info("Password Entered");
		act.click1(objLogin.loginBtn(), "Login Button");
		Log.endTestCase("VerifyUserLoginTest-validateAllLogin");
		act.explicitWait(getDriver(), objLogin.dispLogin(), Duration.ofSeconds(10));
		Assert.assertEquals(objLogin.dispLogin().getText(), "Login");
	}

	@DataProvider
	public Object[][] getLoginUsers() {
		Object[][] logindata = new Object[3][2];
		logindata[0][0] = "InvalidUn";
		logindata[0][1] = "InvalidPw";
		logindata[1][0] = "Admin";
		logindata[1][1] = "InvalidPw";
		logindata[2][0] = "InvalidUn";
		logindata[2][1] = "password";
		return logindata;
	}

}
