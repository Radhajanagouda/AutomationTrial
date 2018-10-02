package automationTest.com.automation.test.trials;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Grouping {

	private Object _foreground = null;

	@BeforeGroups(groups= {"smoke","regression"})
	public void setUp() {
		System.out.println("executed? setUp1233");
		// _foreground = new MyObject();
	}

	@Test(groups = {"smoke"})
	public void testMyObjectToString() throws Exception {
		System.out.println("??? ");
		System.out.println(_foreground == null);
		String value = _foreground.toString();
		Assert.assertTrue(value != null);
	}
}
