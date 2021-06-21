package e2e.testing.test;

import org.testng.Assert;

import e2e.testing.core.CoreTest;
import e2e.testing.pages.LoginPage;

public class T002Login extends CoreTest{

	private String user;
	private String pass;
	
	@Override
	public void startTest() {
		user = "saul";
		pass = "saul";
	}

	@Override
	public void runTest() {
		
		LoginPage login = new LoginPage(getDriver());
		
		getLogger().add("Go to login page and login with user " + user);
		login.login(user, pass);
		
		getLogger().add("Check if user " + user + " can see the menu");
		Assert.assertTrue(login.isUserLogged());
	}

	@Override
	public void endTest() {
	}
}
