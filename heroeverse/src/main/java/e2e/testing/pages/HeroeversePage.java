package e2e.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import e2e.testing.driver.WebDriverFactory;

public class HeroeversePage extends WebDriverFactory{

	private WebDriver driver;
	
	public HeroeversePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement locateElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public void writeOn(String xpath, String text) {
		WebElement element = locateElement(xpath);
		element.clear();
		element.sendKeys(text);
	}
	
	public void click(String xpath) {
		WebElement element = locateElement(xpath);
		element.click();
	}
	
	public void wait(int ms) {
		try {
			Thread.sleep(ms);
		}catch (InterruptedException e) {
		}
	}
}
