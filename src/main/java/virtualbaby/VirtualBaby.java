package virtualbaby;

import java.util.Calendar;
import java.util.Scanner;

public class VirtualBaby {

	private int hunger;
	private int stamina;
	private int soil;
	private int loneliness;
	private long lastTime = Calendar.getInstance().getTimeInMillis();
	Scanner input = new Scanner(System.in);

	public VirtualBaby() {
		hunger = 5;
		stamina = 5;
		soil = 5;
		loneliness = 5;
	}

	public void oS() {
		printGreeting();
		String babyName = input.nextLine();
		menuLoop(babyName);
	}

	private void printGreeting() {
		System.out.println("Welcome to Virtual Baby!");
		System.out.println("To Begin Please Name Your Baby!");
		System.out.println("Baby Name:");
	}

	private void menuLoop(String babyName) {
		do{
			while (isntAsleep(babyName) && isntAbandoned(babyName)) {
				printAttributes(babyName);
				printMenu(babyName);
				String userInput = inputValidLoop();
				menu(Integer.parseInt(userInput));
				tick();
		  }
		}while(playAgain());
	
	}

	private boolean isntAsleep(String babyName) {

		if (hunger <= 4 && stamina <= 2 && soil <= 4 && loneliness <= 3) {
			printAttributes(babyName);
			System.out.println("\n" + babyName + " is asleep!");
			System.out.println("Congratulations! You Win!");
			return false;
		}

		return true;

	}

	private boolean isntAbandoned(String babyName) {
		if (hunger == 10 || soil == 10 || loneliness == 10) {
			printAttributes(babyName);
			System.out.println("\nYou abandoned " + babyName);
			System.out.println("Sorry, You Lose!");
			return false;
		}

		return true;
	}

	private void printAttributes(String babyName) {
		System.out.print("Your baby " + babyName + " has the following attributes:");
		System.out.println("Hunger,Stamina,Soil & Loneliness.");
		System.out.println("The status of each attribute is represented by a number from 0 to 10");
		System.out.println(babyName + "'s current status is:");
		System.out.print("#Hunger: " + hunger + ";");
		System.out.print(" #Stamina: " + stamina + ";");
		System.out.print(" #Soil: " + soil + ";");
		System.out.println(" #Loneliness: " + loneliness + ";");
		
		if(hunger>=7 || soil>=7 || stamina <= 3 || loneliness >= 7)
		{
		 System.out.println(babyName + " is crying!");
		}
		else if(stamina >= 8)
		{
		 System.out.println(babyName + " is cooing!");	
		}
		else if(hunger >= 4)
		{
	     System.out.println(babyName + " is sucking his/her thumb!");	
		}
		else if(soil>=4)
		{
		 System.out.println(babyName + " is grunting and groaning!");	
		}
	}

	private String inputValidLoop() {
		String userInput;
		for (int numInvalidResponses = 0; !inputValid(isMenuOption(input.hasNextInt(), userInput = input.next()),
				userInput, numInvalidResponses, "Please Enter A Valid Menu Option",
				"Maximum number of invalid entries. \n You abandoned your baby! \n Sorry, you lose!",
				"quit"); numInvalidResponses++)
			;
		return userInput;
	}

	private boolean inputValid(boolean condition, String userInput, int numInvalidResponses, String message1,
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

	private void printMenu(String babyName) {
		System.out.println("\nPlease Select One of the following options to contine");
		System.out.println("1. To change " + babyName + "'s diaper press 1");
		System.out.println("2. To feed " + babyName + " press 2");
		System.out.println("3. To sing to " + babyName + " press 3");
		System.out.println("4. To rock " + babyName + " press 4");
		System.out.println("5. To ignore " + babyName + " press 5");
		System.out.println("Type Quit Type Quit At Any time!");
	}

	private boolean isMenuOption(boolean inputIsInt, String userInput) {
		if (inputIsInt) {
			if (Integer.parseInt(userInput) > 0 && Integer.parseInt(userInput) < 6) {
				return true;
			}
		}
		return false;
	}

	private void menu(int userInput) {

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

	private void changeDiaper() {

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

	private void feed() {
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

	private void sing() {

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

	private void rock() {
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
		if (loneliness >= 5) {
			loneliness -= 5;
		} else {
			loneliness = 0;
		}
	}

	private void ignore() {
		
		loneliness = 7;

	}

	private void tick() {
		long time = Calendar.getInstance().getTimeInMillis();

		if ((hunger + (time - lastTime) / 5000) <= 10) {
			hunger += (time - lastTime) / 5000;
		} else {
			hunger = 10;
		}
		if ((stamina - (time - lastTime) / 5000) >= 0) {
			stamina -= (time - lastTime) / 5000;
		} else {
			stamina = 0;
		}
		if ((soil + (time - lastTime) / 5000) <= 10) {
			soil += (time - lastTime) / 5000;
		} else {
			stamina = 10;
		}
		if ((loneliness + (time - lastTime) / 5000) <= 10) {
			loneliness += (time - lastTime) / 5000;
		} else {
			loneliness = 10;
		}

		lastTime = time;

	}

	private boolean playAgain() {
		hunger = 5;
		stamina = 5;
		soil = 5;
		loneliness = 5;
		System.out.println("Would you like to play again? Y for Yes, any key for No");
		if(input.next().equalsIgnoreCase("y"))
		{
		 return true;	
		}
		return false;
	}
}
