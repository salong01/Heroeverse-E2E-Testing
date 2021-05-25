package e2e.testing.core;

import org.openqa.selenium.WebDriver;

public class CoreTest{
	
	private WebDriver driver;
	
	public CoreTest() {
		driver = WebDriverFactory.getFactory().getWebDriver();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void wait(int ms) {
		try {
			Thread.sleep(ms);
		}catch (InterruptedException e) {
		}
	}
}

