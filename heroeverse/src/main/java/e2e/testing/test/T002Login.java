package e2e.testing.test;

import org.testng.annotations.Test;
import e2e.testing.core.CoreTest;
import e2e.testing.pages.LoginPage;

public class T002Login extends CoreTest{

	@Test
	public void test() {
		LoginPage login = new LoginPage(getDriver());
		getDriver().get("http://marca.com");
		wait(3000);
		//login.login("saul", "saul");
	}
}
