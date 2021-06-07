package e2e.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends HeroeversePage{

	private static final String REGISTER_USERNAME = "//input[@id='username']";
	private static final String REGISTER_EMAIL = "//input[@id='email']";
	private static final String REGISTER_PASS = "//input[@id='pass']";
	private static final String REGISTER_CONFIRM_PASS = "//input[@id='confirmPass']";
	private static final String BUTTON_REGISTER = "//button[@id='register']";
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public void register(String user, String email, String pass, String confirmPass) {
		if(!(getDriverPage().getCurrentUrl().equals("http://localhost:4000/register")))
				getDriverPage().get("http://localhost:4000/register");
		wait(1000);
		writeOn(By.xpath(REGISTER_USERNAME), user);
		wait(1000);
		writeOn(By.xpath(REGISTER_EMAIL), email);
		wait(1000);
		writeOn(By.xpath(REGISTER_PASS), pass);
		wait(1000);
		writeOn(By.xpath(REGISTER_CONFIRM_PASS), confirmPass);
		wait(1000);
		click(By.xpath(BUTTON_REGISTER));
	}
}