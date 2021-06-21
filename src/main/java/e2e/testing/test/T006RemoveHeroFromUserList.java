package e2e.testing.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import e2e.testing.core.CoreTest;
import e2e.testing.pages.HeroesPage;

public class T006RemoveHeroFromUserList extends CoreTest{

	private String heroes[];
	
	@Override
	public void startTest() {
		heroes = new String[]{"Namor", "Capitana Marvel", "Thanos"};
	}

	@Override
	public void runTest() {
		
		HeroesPage heroesPage = new HeroesPage(getDriver());
		
		getLogger().add("Check if all heroes added are in list");
		heroesPage.userList();
		wait(1000);
		assertTrue(heroesPage.isHeroInList(heroes[0]), "Hero is not in list");
		assertTrue(heroesPage.isHeroInList(heroes[1]), "Hero is not in list");
		assertTrue(heroesPage.isHeroInList(heroes[2]), "Hero is not in list");
		
		getLogger().add("Remove heroes from user list");
		for(int i = 0; i < heroes.length; i++) {
			getLogger().add("Go to heroes list page");
			heroesPage.heroList();
			wait(1000);
			getLogger().add("Click hero " + heroes[i] + "to remove it from user list");
			heroesPage.clickHero(heroes[i]);
			wait(1000);
			getLogger().add("Click button to remove hero");
			heroesPage.removeHero();
			wait(1000);
			getLogger().add("Go to user List to check that hero has been removed");
			heroesPage.userList();
			wait(1000);
			getLogger().add("Check hero had been removed from list");
			assertFalse(heroesPage.isHeroInList(heroes[i]), "Hero is still in list");
		}
		
		getLogger().add("Go to user list to check if user list is empty");
		heroesPage.userList();
		
		wait(1000);
		getLogger().add("Check if user list is empty");
		assertTrue(heroesPage.isUserListEmpty(), "User list is not empty as it should be");
	}
	
	@Override
	public void endTest() {
	}
}
