package e2e.testing.core;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

	private WebDriver driver;
	private static WebDriverFactory factory;
	
	public static WebDriverFactory getFactory() {
		if (factory == null) {
			synchronized (WebDriverFactory.class) {
				if (factory == null) {
					factory = new WebDriverFactory();
				}
			}
		}
		return factory;
	}
	
	public WebDriver getWebDriver() {
		if(this.driver==null){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			}
		return driver;
	}
}

