package e2e.testing.test;

import e2e.testing.core.CoreTest;
import e2e.testing.pages.RegisterPage;

public class T001Register extends CoreTest{

	@Override
	public void startTest() {
	}

	@Override
	public void runTest() {
		
		RegisterPage register = new RegisterPage(getDriver());
		getLogger().add("Register user saul");
		register.register("saul", "saul.alonso.glez@gmail.com", "saul", "saul");
	}
	
	@Override
	public void endTest() {
	}
}
