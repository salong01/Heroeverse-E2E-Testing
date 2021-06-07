package e2e.testing.core;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public abstract class CoreTest{
	
	private WebDriver driver;
	private Logger logger;
	private boolean testPassed = false;
	
	public CoreTest() {
		logger = new Logger(getClass().getSimpleName());
		driver = WebDriverFactory.getFactory().getWebDriver();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	@BeforeTest
	public void beforeTest() {
		getLogger().add(" ");
		getLogger().add("-------------------------------------");
		getLogger().add("Test Case: " + getClass().getSimpleName());
		startTest();
	}
	
	@Test
	public void test() throws Throwable {
		try {
			runTest();
			testPassed = true;
		}catch(Throwable e){
			StringWriter writer = new StringWriter(); 
			e.printStackTrace(new PrintWriter(writer));
			getLogger().add(writer.toString());
			throw e;
		}
	}
	
	@AfterTest
	public void afterTest() {
		endTest();
		getLogger().add(" ");
		getLogger().add("Test Case: " + getClass().getSimpleName());
		if(testPassed)
			getLogger().add("Test Passed!");
		else
			getLogger().add("Test failed!");
	}
	
	public Logger getLogger() {
		return logger;
	}
	
	public void wait(int ms) {
		try {
			Thread.sleep(ms);
		}catch (InterruptedException e) {
		}
	}
	
	public abstract void startTest();
	public abstract void runTest();
	public abstract void endTest();
}