package e2e.testing.test;

import org.testng.Assert;

import e2e.testing.core.CoreTest;
import e2e.testing.pages.RegisterPage;

public class T001Register extends CoreTest{

	private String user;
	private String email;
	private String pass;
	
	@Override
	public void startTest() {
		user = "saul";
		email = "saul.alonso.glez@gmail.com";
		pass = "saul";
	}

	@Override
	public void runTest() {

		RegisterPage register = new RegisterPage(getDriver());
		
		getLogger().add("Register user " + user);
		register.register(user, email, pass, pass);
		
		getLogger().add("Check if user " + user + " can see the menu");
		Assert.assertTrue(register.isUserLogged());
	}
	
	@Override
	public void endTest() {
	}
}
