package automationTest.com.automation.test.trials;

import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(dependsOnMethods= {"TC2"})
	public void TC1() {
		System.out.println("' Test case 1");
	}
	
	@Test
	public void TC2() {
		System.out.println("' Test case 2");
	}
}
