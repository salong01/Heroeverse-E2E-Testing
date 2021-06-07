package e2e.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import e2e.testing.core.CorePage;

public class HeroeversePage extends CorePage{
	
	private static final String BUTTON_LOGIN_PAGE = "//button[@id='loginPage']";
	private static final String BUTTON_REGISTER_PAGE = "//button[@id='registerPage']";
	private static final String BUTTON_USER_MENU = "//button[@id='menu']";
	private static final String BUTTON_HERO_LIST = "//button[@id='heroesPage']";
	private static final String BUTTON_USER_LIST = "//button[@id='userListPage']";
	private static final String BUTTON_LOGOUT = "//button[@id='logout']";
	
	public HeroeversePage(WebDriver driver) {
		super(driver);
	}
	
	public void loginPage() {
		click(By.xpath(BUTTON_LOGIN_PAGE));
	}
	
	public void registerPage() {
		click(By.xpath(BUTTON_REGISTER_PAGE));
	}
	
	public boolean isUserLogged() {
		if(locateElements(By.xpath(BUTTON_USER_MENU)).size()==0)
			return false;
		return true;
	}
	
	public void clickMenu() {
		click(By.xpath(BUTTON_USER_MENU));
		wait(1000);
	}
	
	public void heroList() {
		if(!(getDriverPage().getCurrentUrl().equals(getHeroeverseUrl() + "/heroes"))) {
			clickMenu();
			click(By.xpath(BUTTON_HERO_LIST));
		}
	}
	
	public void userList() {
		clickMenu();
		click(By.xpath(BUTTON_USER_LIST));
	}
	
	public void logout() {
		clickMenu();
		click(By.xpath(BUTTON_LOGOUT));
	}
}
