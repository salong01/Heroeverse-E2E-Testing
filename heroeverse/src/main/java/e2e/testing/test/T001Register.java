package e2e.testing.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import e2e.testing.driver.WebDriverFactory;
import e2e.testing.pages.RegisterPage;

public class T001Register extends WebDriverFactory{

	@Test
	public void runTest() {
		RegisterPage register = new RegisterPage(getDriver());
		getDriver().get("http://localhost:4000/register");
		
		register.register("saul", "saul.alonso.glez@gmail.com", "saul", "saul");
	}
}
