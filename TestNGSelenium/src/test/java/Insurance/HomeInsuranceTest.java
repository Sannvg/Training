package Insurance;

import org.testng.annotations.Test;

public class HomeInsuranceTest {
	// @BeforeTest,@AfterTest,@Test,@BeforeMethod,@AfterMethod,priority
		
		@Test(enabled = false)//enabled will skip the testcase
		public void homeInsuranceWebLogin() {
			
			System.out.println("HomeInsurance WebLogin");
		}

		@Test(priority=1)
		public void homeInsuranceWebLogout() {
			System.out.println("HomeInsurance WebLogout");
		}

		@Test(priority =0)
		public void mobileInsuranceWebLogin() {
			System.out.println("HomeMobileInsurance WebLogin");
		}

		@Test(priority =3)
		public void mobileInsuranceWebLogout() {
			System.out.println("HomeMobileInsurance WebLogout");
		}

		/*@BeforeTest // will run once before the following @Test
		public void webLogin() {
			System.out.println("This method should run before test");
		}
		@AfterTest // will run once after the above @Test
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
		}*/
}
