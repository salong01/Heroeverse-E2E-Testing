package e2e.testing.test;

import org.testng.Assert;

import e2e.testing.core.CoreTest;
import e2e.testing.pages.LoginPage;

public class T003LogOut extends CoreTest{

	@Override
	public void startTest() {
	}
	
	@Override
	public void runTest() {
		LoginPage login = new LoginPage(getDriver());
		getLogger().add("Log out from user");
		login.logout();
		getLogger().add("Check if user is really log out");
		Assert.assertTrue(login.isUserLogged());
		getLogger().add("");
	}

	@Override
	public void endTest() {
	}
}
