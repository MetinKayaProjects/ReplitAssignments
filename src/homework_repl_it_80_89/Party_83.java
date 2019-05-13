package homework_repl_it_80_89;

import java.util.Scanner;

public class Party_83 {
	public static void main(String[] args) {

		/*
		 * Imagine you have a party and need to form the list of the guests. (Assume you
		 * have at least one guest) Ask for the first guest name. Then ask does user
		 * want to enter one more guest. If yes - take input from. If not - finish the
		 * program and print list of the guests.
		 * 
		 * Example of the program:
		 * 
		 * Please enter guest name: Nick Do you want to enter new guest name: yes Please
		 * enter guest name: Linda Do you want to enter new guest name: no Guest's list:
		 * Nick, Linda
		 */

		Scanner input = new Scanner(System.in);
		// your code

		System.out.println("Please enter guest name:");
		String guestName1 = input.next();
		String guestList = guestName1;

		System.out.println("Do you want to enter new guest name:");
		String answer = input.next();

		while (answer.equalsIgnoreCase("yes")) {
			System.out.println("Please enter guest name:");

			String guestName2 = input.next();
			guestList = guestList + ", " + guestName2;

			System.out.println("Do you want to enter new guest name:");
			answer = input.next();
		}

		System.out.println("Guest's list: " + guestList);

	}

}
