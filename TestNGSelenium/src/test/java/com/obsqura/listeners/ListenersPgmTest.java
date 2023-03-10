package com.obsqura.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenersPgmTest {
//program to mention listeners(refer ListenerClass.java & xml file too)

	@Test
	public void loginEmail() {
		System.out.println("Login by Email");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void loginFacebook() {
		System.out.println("Login by Facebook");
		Assert.assertEquals(true, false);
	}
}
