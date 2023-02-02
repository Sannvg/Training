package com.obsqura.insurance;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeInsuranceTest {
	// @BeforeTest,@AfterTest,@Test,@BeforeMethod,@AfterMethod,priority

	/*@BeforeTest // will run once before the following @Test
	public void webLogin() {
		System.out.println("This method should run before test");
	}
*/
	@Test
	public void homeInsuranceWebLogin() {
		System.out.println("HomeInsurance WebLogin");
	}

	@Test
	public void homeInsuranceWebLogout() {
		System.out.println("HomeInsurance WebLogout");
	}

	@Test
	public void mobileInsuranceWebLogin() {
		System.out.println("MobileInsurance WebLogin");
	}

	@Test
	public void mobileInsuranceWebLogout() {
		System.out.println("MobileInsurance WebLogout");
	}

	/*@AfterTest // will run once after the above @Test
	public void webLogout() {
		System.out.println("This method will run after the above test");
	}

	@BeforeMethod // will run before each @Test
	public void beforeMethod() {
		System.out.println("This method should run before each @test method");
	}

	@AfterMethod // will run after each @Test
	public void afterMethod() {
		System.out.println("This method should run after each @test method");
	}
*/
}
