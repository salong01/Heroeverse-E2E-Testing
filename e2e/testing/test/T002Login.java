package e2e.testing.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import e2e.testing.pages.HeroeversePage;
import e2e.testing.pages.LoginPage;

public class T002Login extends HeroeversePage{

	public T002Login(WebDriver driver) {
		super(driver);
	}
	
	@Test
	public void test() {
		LoginPage login = new LoginPage(getDriver());
		getDriver().get("http://localhost:4000");
		
		login.login("saul", "saul");
	}
}
