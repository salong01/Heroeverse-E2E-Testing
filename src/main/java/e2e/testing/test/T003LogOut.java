package e2e.testing.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
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
		assertFalse(login.isUserLogged());
		getLogger().add("User is really logged out");
		assertTrue(getDriver().getCurrentUrl().equals("http://localhost:4000/login"));
	}

	@Override
	public void endTest() {
	}
}
