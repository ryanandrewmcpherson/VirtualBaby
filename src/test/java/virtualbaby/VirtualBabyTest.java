package virtualbaby;

//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

//import org.junit.Test;

public class VirtualBabyTest {
//	@Test
//	public void shouldUpdateAttributesWhenTickMethodCalled() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.tick();
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 6, 4, 6, 8 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldUpdateAttributesWhenChangeDiaperMethodCalled() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.changeDiaper();
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 8, 5, 0, 2 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldUpdateAttributesWhenFeedMethodisCalled() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.feed();
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 0, 8, 8, 0 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldUpdateAttributesWhenSingMethodisCalled() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.sing();
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 7, 3, 7, 0 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldUpdateAttributesWhenRockMethodisCalled() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.rock();
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 8, 1, 8, 0 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldUpdateAttributesWhenIgnoreMethodisCalled() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.ignore();
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 6, 4, 6, 8 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldReturnFalseWhenBabyIsAsleep() {
//		VirtualBaby baby = new VirtualBaby(0, 3, 0, 0);
//		assertFalse(baby.isntAsleep("babyName"));
//	}
//
//	@Test
//	public void shouldReturnFalseWhenBabyIsAbandoned() {
//		VirtualBaby baby = new VirtualBaby(10, 5, 5, 5);
//		assertFalse(baby.isntAbandoned("babyName"));
//	}
//
//	@Test
//	public void shouldCallChangeDiaperMethodWhen1IsSelectedAndProduceSameResults() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.menu(1);
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 8, 5, 0, 2 };
//		assertArrayEquals(expectedAttributes, attributes);
//
//	}
//
//	@Test
//	public void shouldCallFeedMethodWhen2IsSelectedAndProduceSameResults() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.menu(2);
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 0, 8, 8, 0 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldCallSingMethodWhen3IsSelectedAndProduceSameResults() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.menu(3);
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 7, 3, 7, 0 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldCallRockMethodWhen4IsSelectedAndProduceSameResults() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.menu(4);
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 8, 1, 8, 0 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldCallIgnoreWhen5IsSelectedAndProduceSameResults() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		baby.menu(5);
//		int hunger = baby.getHunger();
//		int stamina = baby.getStamina();
//		int soil = baby.getSoil();
//		int loneliness = baby.getLoneliness();
//		int attributes[] = { 0, 0, 0, 0 };
//		attributes[0] = hunger;
//		attributes[1] = stamina;
//		attributes[2] = soil;
//		attributes[3] = loneliness;
//		int expectedAttributes[] = { 6, 4, 6, 8 };
//		assertArrayEquals(expectedAttributes, attributes);
//	}
//
//	@Test
//	public void shouldReturnFalseWhenStringIsEntered() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		String userInput = "test";
//		boolean inputIsInt = false;
//		assertFalse(baby.isMenuOption(inputIsInt, userInput));
//
//	}
//
//	@Test
//	public void shouldReturnFalseWhenNonMenuOptionNumEntered() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		String userInput = "7";
//		boolean inputIsInt = true;
//		assertFalse(baby.isMenuOption(inputIsInt, userInput));
//	}
//	
//	@Test
//	public void shouldReturnTrueWhenMenuOptionNumEntered() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		String userInput = "5";
//		boolean inputIsInt = true;
//		assertTrue(baby.isMenuOption(inputIsInt, userInput));
//	}
//
//	@Test
//	public void shouldReturnTrueWhenMenuOptionIsSelected() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		String userInput = "1";
//		assertTrue(baby.validateInput((Integer.parseInt(userInput) < 6 && Integer.parseInt(userInput) > 0), userInput,
//				0, "", "", ""));
//	}
//
//	@Test
//	public void shouldReturnFalseWhenNonMenuOptionNumberIsSelected() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		String userInput = "7";
//		assertFalse(baby.validateInput((Integer.parseInt(userInput) < 6 && Integer.parseInt(userInput) > 0), userInput,
//				0, "", "", ""));
//	}
//
//	@Test
//	public void shouldReturnFalseWhenNonMenuOptionStringIsSelected() {
//		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
//		String userInput = "test";
//		assertFalse(baby.validateInput(userInput.length() == 1, userInput, 0, "", "", ""));
//	}

}
