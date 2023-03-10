package Insurance;

import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestAnnotations {
	//program to perform testng annotations
	
	/*
	 * @BeforeGroups("IT Department") public void beforeGrp() {
	 * System.out.println("--This method will execute BEFORE 'IT Dept' GROUP--"); }
	 * 
	 * @AfterGroups("IT Department") public void afterGrp() {
	 * System.out.println("After group--IT Dept"); }
	 * 
	 * @Test(groups = { "IT Department" }) public void testCase1() {
	 * System.out.println("Software Developer"); }
	 * 
	 * @Test(groups = { "HR" }) public void testCase2() {
	 * System.out.println("HR Manager"); }
	 * 
	 * @Test(groups = { "IT Department" }) public void testCase3() {
	 * System.out.println("QA Anaylst"); }
	 * 
	 * @Test public void testCase4() { System.out.println("Admin"); }
	 */
	
	@BeforeMethod	
	public void beforeMethod() {
		System.out.println("Before Method"); 
	}
	@AfterMethod	
	public void afterMethod() {
		System.out.println("After Method"); 
	}	
	
	@BeforeTest	
	public void beforeTest() {
		System.out.println("Before Test - TestA"); 
	}
	@AfterTest	
	public void afterTest() {
		System.out.println("After Test - TestA"); 
	}
	@Test
	public void TestA() {
		System.out.println("TestA"); 
	}
	
	@Test
	public void TestB() {
		System.out.println("TestB"); 
	}
	@BeforeTest	
	public void beforeTestC() {
		System.out.println("Before Test - TestC"); 
	}
	
	@Test
	public void TestC() {
		System.out.println("TestC"); 
	}


}
