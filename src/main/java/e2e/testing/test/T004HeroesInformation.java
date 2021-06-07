package e2e.testing.test;

import static org.testng.Assert.*;

import e2e.testing.core.CoreTest;
import e2e.testing.pages.HeroesPage;

public class T004HeroesInformation extends CoreTest{

	private String heroName[];
	private String heroFaction[];
	private String heroDescription[];
	
	@Override
	public void startTest() {
		heroName =  new String[]{"Namor", "Iron Man", "Capitana Marvel","Magneto", "Avispa", "Capitán América", "Mister fantástico", "Pyro", "Thanos", "Dr Strange"};
		heroFaction = new String[] {"Atlante", "Vengador", "Kree", "Hermandad","Tecnologias Pym", "Vengador", "Cuatro fantásticos", "Hermandad", "Eterno", "Vengador"};
		heroDescription = new String[] {"Hijo de un mutante y una reina atlante, actual rey de Atlantis", 
				"Propietario de industrias Stark y actual miembro de los Vengadores, usa una armadura con un reactor que a parte de darle energía para combatir, le ayuda a sobrevivir a las esquirlas metálicas que tiene acercandose a su corazón.",
				"Ex piloto humana criada como kree con poderes concedidos por el cubo cósmico",
				"Líder mutante de la hermandad, opositores a la raza humana. Tiene el poder de controlar cualquier elemento metálico a su antojo",
				"Compañera de Hanq Pym, creadores de las partículas Pym capaces de hacerte cambiar de tamaño",
				"Super soldado creado con un suero biológico para ganar la segunda guerra mundial y líder de los vengadores",
				"Líder de los cuatro fantásticos con el poder de estirar su cuerpo sin límites",
				"Antiguo miembro de x-men, actual miembro de la Hermandad, muy fiel a Magneto",
				"El líder de la orden negra y titán loco, capaz de sostener las gemas del infinito",
				"Hechicero supremo y guardián de la gema del tiempo"};
	}

	@Override
	public void runTest() {
		HeroesPage heroesPage = new HeroesPage(getDriver());
		
		getLogger().add("Check if user is logged");
		heroesPage.isUserLogged();
		getLogger().add("Go to heroes view in case we aren't");
		heroesPage.heroList();
		assertTrue(heroName.length==heroFaction.length && heroName.length==heroDescription.length, "Length of arrays are not the same, test will fail");
		getLogger().add("Check every hero information stored in database");
		for(int i = 0; i< heroName.length; i++) {
			wait(1000);
			getLogger().add("Click hero " + heroName[i] + " to check information");
			heroesPage.clickHero(heroName[i]);
			wait(1000);
			getLogger().add("Check hero name");
			assertEquals(heroName[i], heroesPage.getHeroName(), "Hero is not the same as expected, name received " + heroesPage.getHeroName());
			assertEquals(heroFaction[i], heroesPage.getHeroFaction(), "Faction is not the same text as expected, faction received "+ heroesPage.getHeroFaction());
			assertEquals(heroDescription[i], heroesPage.getHeroDesciption(), "Description is not the same as expected, .");
			assertTrue(heroesPage.getHeroImage().contains(heroName[i].replaceAll(" ", "%20").replace("á", "%C3%A1").replace("é", "%C3%A9")), "Image is not the same as expected.");
			heroesPage.heroList();
		}
	}

	@Override
	public void endTest() {
	}

}
