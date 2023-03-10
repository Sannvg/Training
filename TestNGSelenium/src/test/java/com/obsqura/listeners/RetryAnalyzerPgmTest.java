package com.obsqura.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerPgmTest {
	
	//program to mention retry analyzer(refer RetryAnalyzer.java too)
	
	@Test
	public void loginEmail() {
		System.out.println("Login by Email");
		Assert.assertEquals(true, true);
	}
	
	@Test(retryAnalyzer=com.obsqura.listeners.RetryAnalyzer.class)
	public void loginFacebook() {
		System.out.println("Login by Facebook");
		Assert.assertEquals(true, false);
	}

}
