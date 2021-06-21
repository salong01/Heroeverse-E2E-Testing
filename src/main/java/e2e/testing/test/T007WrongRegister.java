package e2e.testing.test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import e2e.testing.core.CoreTest;
import e2e.testing.pages.RegisterPage;

public class T007WrongRegister extends CoreTest{

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
		
		if(register.isUserLogged()) {
			getLogger().add("Log out");
			wait(1000);
			register.logout();
		}
		
		getLogger().add("Register user " + user);
		register.register(user, email, pass, pass);
		wait(1000);
		getLogger().add("Check if user " + user + " can see the menu");
		Assert.assertFalse(register.isUserLogged(), "User had been registered");
		
		getLogger().add("Chech that url is the register one");
		assertTrue(getDriver().getCurrentUrl().equals("http://localhost:4000/register"));
	}
	
	@Override
	public void endTest() {
	}
}
