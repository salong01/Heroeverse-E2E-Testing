package e2e.testing.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CorePage {
	
	private int secondsToWait = 5;
	private WebDriver driver;
	
	public CorePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriverPage() {
		return driver;
	}

	public WebElement locateElement(String xpath) {
		waitForElement(By.xpath(xpath));
		return driver.findElement(By.xpath(xpath));
	}
	
	public void writeOn(String xpath, String text) {
		WebElement element = locateElement(xpath);
		element.clear();
		element.sendKeys(text);
	}
	
	public void click(String xpath) {
		waitForElement(By.xpath(xpath));
		WebElement element = locateElement(xpath);
		element.click();
	}
	
	public void waitForElement(By by, int secs) {
		WebDriverWait waiter = new WebDriverWait(driver, secs);
		waiter.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public void waitForElement(By by) {
		waitForElement(by, secondsToWait);
	}
	
	
	public void wait(int ms) {
		try {
			Thread.sleep(ms);
		}catch (InterruptedException e) {
		}
	}
}
