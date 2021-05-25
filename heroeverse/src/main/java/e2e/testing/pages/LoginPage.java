package e2e.testing.pages;

import org.openqa.selenium.WebDriver;

import e2e.testing.core.CorePage;

public class LoginPage extends CorePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private static final String LOGIN_USERNAME = "//*[@id='username']";
	private static final String LOGIN_PASSWORD = "//*[@id='pass']";
	private static final String LOGIN_BUTTON = "//button[@id='login']";
	
	public void login(String username, String password){
		//if(getDriverPage().getCurrentUrl().cont))
		writeOn(LOGIN_USERNAME, username);
		writeOn(LOGIN_PASSWORD, password);
		click(LOGIN_BUTTON);
	}
}
