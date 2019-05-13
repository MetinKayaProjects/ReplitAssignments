package homework_repl_it_80_89;

import java.util.Scanner;

public class CatsAndDogs_086 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;

		String catList = "cat";
		String dogList = "dog";
		/*
		 * Print true if the string "cat" and "dog" appear the same number of times in
		 * the given string word. Example: Example: Example: input: catdog input: catcat
		 * input: cat-cheetah-dog-cat output: true output: false output: false
		 */

		System.out.println("Enter a word");
		String word = scan.next();

		for (int i = 0; i <= word.length() - 3; i++) {
			// String list = (""+word.charAt(i)) +(""+word.charAt(i+1)) + (""+
			// word.charAt(i+2));
			String list = word.substring(i, i + 3);

			if (list.equalsIgnoreCase("cat")) {
				countOfCats++;

			} else if (list.equalsIgnoreCase("dog")) {
				countOfDogs++;

			}

		}
		System.out.println("Number of Cats in the word: " + countOfCats);
		System.out.println("Number of Dogs in the word: " + countOfDogs);

		System.out.println(countOfCats == countOfDogs);

	}

}
