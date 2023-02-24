package Insurance;

import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class TestAnnotations {
	//program to perform testng annotations
	
	@BeforeGroups("IT Department")
	public void beforeGrp() {
		System.out.println("--This method will execute BEFORE 'IT Dept' GROUP--");
	}

	@AfterGroups("IT Department")
	public void afterGrp() {
		System.out.println("After group--IT Dept");
	}

	@Test(groups = { "IT Department" })
	public void testCase1() {
		System.out.println("Software Developer");
	}

	@Test(groups = { "HR" })
	public void testCase2() {
		System.out.println("HR Manager");
	}

	@Test(groups = { "IT Department" })
	public void testCase3() {
		System.out.println("QA Anaylst");
	}

	@Test
	public void testCase4() {
		System.out.println("Admin");
	}

}
