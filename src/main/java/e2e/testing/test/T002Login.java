package e2e.testing.test;

import e2e.testing.core.CoreTest;
import e2e.testing.pages.LoginPage;

public class T002Login extends CoreTest{

	@Override
	public void startTest() {
	}

	@Override
	public void runTest() {
		LoginPage login = new LoginPage(getDriver());
		
		login.login("saul", "saul");
	}

	@Override
	public void endTest() {
	}
}
