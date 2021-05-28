package e2e.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HeroeversePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	private static final String INPUT_USERNAME = "//*[@id='username']";
	private static final String INPUT_PASSWORD = "//*[@id='pass']";
	private static final String BUTTON_LOGIN = "//button[@id='login']";
	
	public void login(String username, String password){
		if(!(getDriverPage().getCurrentUrl().equals("http://localhost:4000/login")))
			getDriverPage().get("http://localhost:4000");
		wait(1000);
		writeOn(By.xpath(INPUT_USERNAME), username);
		wait(1000);
		writeOn(By.xpath(INPUT_PASSWORD), password);
		wait(1000);
		click(By.xpath(BUTTON_LOGIN));
	}
}