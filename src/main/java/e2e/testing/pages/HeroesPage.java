package e2e.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeroesPage extends HeroeversePage{

	public HeroesPage(WebDriver driver) {
		super(driver);
	}
	
	private static final String TITLE = "//app-heroes//h2";
	private static final String BUTTON_HERO = "//app-heroes//li/span[contains(text(),'%s')]";
	private static final String HERO_NAME = "//app-hero-detail//mat-card-title";
	private static final String HERO_FACTION = "//app-hero-detail//mat-card-subtitle";
	private static final String HERO_DESCRIPTION = "//app-hero-detail//mat-card-content/span";
	private static final String HERO_IMAGE = "//app-hero-detail//mat-card/img";

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
}
