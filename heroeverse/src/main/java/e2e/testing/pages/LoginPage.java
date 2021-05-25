package e2e.testing.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends HeroeversePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private static final String LOGIN_USERNAME = "//*[@id='username']";
	private static final String LOGIN_PASSWORD = "//*[@id='pass']";
	private static final String LOGIN_BUTTON = "//button[@id='login']";
	
	public void login(String username, String password){
		writeOn(LOGIN_USERNAME, username);
		writeOn(LOGIN_PASSWORD, password);
		click(LOGIN_BUTTON);
	}
}
