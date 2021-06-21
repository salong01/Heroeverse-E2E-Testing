package e2e.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeroesPage extends HeroeversePage{

	public HeroesPage(WebDriver driver) {
		super(driver);
	}
	
	private static final String TITLE = "//app-heroes//h2";
	private static final String BUTTON_HERO = "//ul/li/button/span[contains(text(),'%s')]";
	private static final String HERO_NAME = "//app-hero-detail//mat-card-title";
	private static final String HERO_FACTION = "//app-hero-detail//mat-card-subtitle";
	private static final String HERO_DESCRIPTION = "//app-hero-detail//mat-card-content/span";
	private static final String HERO_IMAGE = "//app-hero-detail//mat-card/img";
	private static final String BUTTON_ADD_HERO = "//button[@id='addHero']";
	private static final String BUTTON_REMOVE_HERO = "//button[@id='removeHero']";
	private static final String BUTTON_BACK = "//button[@id='backButton']";
	
	public String getTitle() {
		return locateElement(By.xpath(TITLE)).getText();
	}
	
	public void clickHero(String hero) {
		click(By.xpath(String.format(BUTTON_HERO, hero)));
	}
	
	public String getHeroName() {
		return locateElement(By.xpath(HERO_NAME)).getText().toString();
	}
	
	public String getHeroFaction() {
		return locateElement(By.xpath(HERO_FACTION)).getText().toString();
	}
	
	public String getHeroDesciption() {
		return locateElement(By.xpath(HERO_DESCRIPTION)).getText().toString();
	}
	
	public String getHeroImage() {
		return locateElement(By.xpath(HERO_IMAGE)).getAttribute("src").toString();
	}
	
	public void addHero() {
		click(By.xpath(BUTTON_ADD_HERO));
	}
	
	public void removeHero() {
		click(By.xpath(BUTTON_REMOVE_HERO));
	}
	
	public void back() {
		click(By.xpath(BUTTON_BACK));
	}
	
	public boolean isHeroInList(String hero) {
		if(locateElements(By.xpath(String.format(BUTTON_HERO, hero))).size()>0)
			return true;
		return false;
	}
	
	public boolean isUserListEmpty() {
		if(locateElements(By.xpath("//ul/li")).size()==0)
			return true;
		return false;
	}
}
