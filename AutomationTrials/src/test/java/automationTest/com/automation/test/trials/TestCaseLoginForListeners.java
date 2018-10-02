package automationTest.com.automation.test.trials;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(value=ListenersPrg.class)
public class TestCaseLoginForListeners {

	@Test
	public void LoginPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumTrainingByJitendra/Downloads/chromedriver_win32/chromedriver.exe");
		ChromeDriver cd= new ChromeDriver();
		cd.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		cd.close();
	}
	
	
	@Test
	public void LoginPageForciblyFail() throws InterruptedException {
		System.out.println("LoginPageForciblyFail() Failed");
		Assert.assertEquals(12, 14);
		
	}
}
