package virtualbaby;

import java.util.Scanner;

public class VirtualBaby {

	private int hunger;
	private int stamina;
	private int soil;
	private int loneliness;

	Scanner input = new Scanner(System.in);

	public int getHunger() {

		return hunger;
	}

	public int getStamina() {

		return stamina;
	}

	public int getSoil() {

		return soil;
	}

	public int getLoneliness() {

		return loneliness;
	}

	public void tick() {

		if (hunger < 10) {
			hunger++;
		}
		if (stamina > 0) {
			stamina--;
		}
		if (soil < 10) {
			soil++;
		}
		if (loneliness <= 7) {
			loneliness += 3;
		}
		else {loneliness = 10;}

	}

	public void changeDiaper() {

		if (hunger < 8) {
			hunger += 2;
		} else {
			hunger = 10;
		}
		soil = 0;
		if (loneliness >= 3) {
			loneliness -= 3;
		} else
			loneliness = 0;

	}

	public void feed() {
		if (hunger >= 7) {
			hunger -= 7;
		} else {
			hunger = 0;
		}
		if (stamina <= 8) {
			stamina += 2;
		} else {
			stamina = 10;
		}

		if (soil <= 8) {
			soil += 2;
		} else {
			soil = 10;
		}
		if (loneliness >= 5) {
			loneliness -= 5;
		} else {
			loneliness = 0;
		}
	}

	public void sing() {

		if (hunger <= 8) {
			hunger += 2;
		} else {
			hunger = 10;
		}
		if (stamina >= 2) {
			stamina -= 2;
		} else {
			stamina = 0;
		}
		if (soil <= 8) {
			soil += 2;
		} else {
			soil = 10;
		}
		if (loneliness >= 5)
			loneliness -= 5;
		else {
			loneliness = 0;
		}
	}

	public void rock() {
		if (hunger <= 8) {
			hunger += 2;
		} else {
			hunger = 10;
		}
		if (stamina >= 4) {
			stamina -= 4;
		} else {
			stamina = 0;
		}
		if (soil <= 8) {
			soil += 2;
		} else {
			soil = 10;
		}
		if (loneliness <= 5) {
			loneliness -= 5;
		} else {
			loneliness = 10;
		}

	}

	public void ignore() {
		tick();
		loneliness = 8;

	}

	public boolean isntAsleep(String babyName) {

		if (hunger <=4 && stamina <= 2 && soil <= 4 && loneliness <= 3) {
			printAttributes(babyName);
			System.out.println("\n" + babyName + " is asleep!");
			System.out.println("Congratulations! You Win!");
			return false;
		}

		return true;

	}

	public boolean isntAbandoned(String babyName) {
		if (hunger == 10 || soil == 10 || loneliness == 10) {
			printAttributes(babyName);
			System.out.println("\nYou abandoned " + babyName);
			System.out.println("Sorry, You Lose!");
			return false;
		}

		return true;
	}

	public void printGreeting() {
		System.out.println("Welcome to Virtual Baby!");
		System.out.println("To Begin Please Name Your Baby!");
		System.out.println("Baby Name:");
	}

	public void printAttributes(String babyName) {
		System.out.print("Your baby " + babyName + " has the following attributes:");
		System.out.println("Hunger,Stamina,Soil & Loneliness.");
		System.out.println("The status of each attribute is represented by a number from 0 to 10");
		System.out.println(babyName + "'s current status is:");
		System.out.println("Hunger: " + getHunger());
		System.out.println("Stamina: " + getStamina());
		System.out.println("Soil: " + getSoil());
		System.out.println("Loneliness: " + getLoneliness());
	}

	public void printMenu(String babyName) {
		System.out.println("\nPlease Select One of the following options to contine");
		System.out.println("To change " + babyName + "'s diaper press 1");
		System.out.println("To feed " + babyName + " press 2");
		System.out.println("To sing to " + babyName + " press 3");
		System.out.println("To rock " + babyName + " press 4");
		System.out.println("To ignore " + babyName + " press 5");
		System.out.println("Type Quit Type Quit At Any time!");
	}

	public void menu(int userInput) {

		switch (userInput) {
		case 1: {
			changeDiaper();
			break;
		}
		case 2: {
			feed();
			break;
		}
		case 3: {
			sing();
			break;
		}
		case 4: {
			rock();
			break;
		}
		case 5: {
			ignore();
			break;
		}
		default:
			tick();
		}
	}

	public boolean isMenuOption(boolean inputIsInt, String userInput) {
		if (inputIsInt) {
			if (Integer.parseInt(userInput) > 0 && Integer.parseInt(userInput) < 6) {
				return true;
			}
		}
		return false;
	}

	public boolean validateInput(boolean condition, String userInput, int numInvalidResponses, String message1,
			String message2, String escapeCommand) {

		if (condition) {
			return true;
		} else if (userInput.equalsIgnoreCase(escapeCommand)) {
			System.exit(0);
		} else if (!userInput.equalsIgnoreCase(escapeCommand)) {
			numInvalidResponses++;
			if (numInvalidResponses >= 3) {
				System.out.println(message2);
				System.exit(0);
			}

			System.out.println(message1);
		}
		return false;
	}

	public VirtualBaby(int hunger, int stamina, int soil, int loneliness) {
		this.hunger = hunger;
		this.stamina = stamina;
		this.soil = soil;
		this.loneliness = loneliness;
	}
}
