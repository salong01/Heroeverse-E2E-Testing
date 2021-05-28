package e2e.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import e2e.testing.core.CorePage;

public class HeroeversePage extends CorePage{
	
	private static final String BUTTON_USER_MENU = "//button[@id='menu']";
	private static final String BUTTON_HERO_LIST = "//button[@id='heroesPage']";
	private static final String BUTTON_USER_LIST = "//button[@id='userListPage']";
	private static final String BUTTON_LOGOUT = "//button[@id='logout']";
	
	public HeroeversePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isUserLogged() {
		if(locateElements(By.xpath(BUTTON_USER_MENU)).size()==0)
			return false;
		return true;
	}
	
	public void clickMenu() {
		click(By.xpath(BUTTON_USER_MENU));
	}
	
	public void heroList() {
		clickMenu();
		click(By.xpath(BUTTON_HERO_LIST));
	}

	public void userList() {
		clickMenu();
		click(By.xpath(BUTTON_USER_LIST));
	}
	
	public void logout() {
		wait(1000);
		clickMenu();
		wait(1000);
		click(By.xpath(BUTTON_LOGOUT));
	}
}
