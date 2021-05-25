package e2e.testing.pages;

import org.openqa.selenium.WebDriver;

import e2e.testing.core.CorePage;

public class RegisterPage extends CorePage{

	private static final String REGISTER_USERNAME = "//input[@id='username']";
	private static final String REGISTER_EMAIL = "//input[@id='email']";
	private static final String REGISTER_PASS = "//input[@id='pass']";
	private static final String REGISTER_CONFIRM_PASS = "//input[@id='confirmPass']";
	private static final String BUTTON_REGISTER = "//button[@id='register']";
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public void register(String user, String email, String pass, String confirmPass) {
		getDriverPage().get("http://google.com");
//		System.out.println(getDriverPage().getCurrentUrl());
		writeOn(REGISTER_USERNAME, user);
//		writeOn(REGISTER_EMAIL, email);
//		writeOn(REGISTER_PASS, pass);
//		writeOn(REGISTER_CONFIRM_PASS, confirmPass);
//		click(BUTTON_REGISTER);
	}
}
