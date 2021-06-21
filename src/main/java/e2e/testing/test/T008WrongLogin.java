package e2e.testing.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import e2e.testing.core.CoreTest;
import e2e.testing.pages.LoginPage;

public class T008WrongLogin extends CoreTest{

	private String user;
	private String pass;
	
	@Override
	public void startTest() {
		user = "saul2";
		pass = "saul";
	}

	@Override
	public void runTest() {
		
		LoginPage login = new LoginPage(getDriver());
		
		if(login.isUserLogged()) {
			getLogger().add("Log out");
			login.logout();
		}
		getLogger().add("Go to login page and login with user " + user);
		login.login(user, pass);
		wait(1000);
		getLogger().add("Check if user " + user + " can see the menu");
		assertFalse(login.isUserLogged(), "user not logged");
		
		getLogger().add("Chech that url is the login one");
		assertTrue(getDriver().getCurrentUrl().equals("http://localhost:4000/login"));
	}

	@Override
	public void endTest() {
	}
}
