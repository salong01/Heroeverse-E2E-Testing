package e2e.testing.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import e2e.testing.core.CoreTest;
import e2e.testing.pages.RegisterPage;

public class T001Register extends CoreTest{

	@Test
	public void runTest() {
		
		RegisterPage register = new RegisterPage(getDriver());
//		Assert.assertTrue(false);
//		getDriver().get("http://google.com");
//		wait(3000);
		
		register.register("saul", "saul.alonso.glez@gmail.com", "saul", "saul");
	}
}
