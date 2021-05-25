package e2e.testing.test;

import org.testng.annotations.Test;
import e2e.testing.core.CoreTest;
import e2e.testing.pages.LoginPage;

public class T003LogOut extends CoreTest{
	
	@Test
	public void runTest() {
		LoginPage login = new LoginPage(getDriver());
		getDriver().get("http://elmundo.es");
		wait(3000);
	}
}
