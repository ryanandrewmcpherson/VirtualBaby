package virtualbaby;

import java.util.Scanner;

public class VirtualBabyApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualBaby baby = new VirtualBaby(5, 5, 5, 5);
		baby.printGreeting();
		String babyName = input.next();

		while (baby.isntAsleep(babyName) && baby.isntAbandoned(babyName)) {

			baby.printAttributes(babyName);
			baby.printMenu(babyName);
			String userInput;

			for (int numInvalidResponses = 0; !baby.validateInput(
					baby.isMenuOption(input.hasNextInt(), userInput = input.next()), userInput, numInvalidResponses,
					"Please Enter A Valid Menu Option",
					"Maximum number of invalid entries. \n You abandoned your baby! \n Sorry, you lose!",
					"quit"); numInvalidResponses++)
				;
			
			baby.menu(Integer.parseInt(userInput));
			baby.tick();
		}

		input.close();
	}

}
