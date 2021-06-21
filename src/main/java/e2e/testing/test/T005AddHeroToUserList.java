package e2e.testing.test;

import e2e.testing.core.CoreTest;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;

import e2e.testing.pages.HeroesPage;

public class T005AddHeroToUserList extends CoreTest{

	private String heroes[];
	
	@Override
	public void startTest() {
		heroes = new String[]{"Namor", "Capitana Marvel", "Thanos"};
	}

	@Override
	public void runTest() {
		HeroesPage heroesPage = new HeroesPage(getDriver());
		
		getLogger().add("Go to user list to check if user list is empty");
		heroesPage.userList();
		
		wait(1000);
		getLogger().add("Check if user list is empty");
		assertTrue(heroesPage.isUserListEmpty(), "User list is not empty as it should be");
		
		getLogger().add("Add heroes ");
		for(int i = 0; i < heroes.length; i++) {
			getLogger().add("Go to heroes list page");
			heroesPage.heroList();
			wait(1000);
			getLogger().add("Click hero " + heroes[i] + "to add hero to user list");
			heroesPage.clickHero(heroes[i]);
			wait(1000);
			getLogger().add("Click button to add hero");
			heroesPage.addHero();
			wait(1000);
			getLogger().add("Go to user List to check that hero has been added");
			heroesPage.userList();
			wait(1000);
			getLogger().add("Check hero in list");
			assertTrue(heroesPage.isHeroInList(heroes[i]), "Hero is not in list");
		}
		
		getLogger().add("Check if all heroes added are in list");
		heroesPage.userList();
		wait(1000);
		assertTrue(heroesPage.isHeroInList(heroes[0]), "Hero is not in list");
		assertTrue(heroesPage.isHeroInList(heroes[1]), "Hero is not in list");
		assertTrue(heroesPage.isHeroInList(heroes[2]), "Hero is not in list");
	}
	
	@Override
	public void endTest() {
	}
}
