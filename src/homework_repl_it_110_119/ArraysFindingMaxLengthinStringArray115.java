package homework_repl_it_110_119;

import java.util.Scanner;

public class ArraysFindingMaxLengthinStringArray115 {
	public static void main(String[] args) {
		/*
		 * Given the array words, it will print the word with the largest length. Assume
		 * that there are no 2 words with longest length
		 * 
		 * Example: words -> ["aaa", "bbbbb", "whasstupppp", "longg" ,
		 * "jaaaaavvaaaaaaaaaa"] prints jaaaaavvaaaaaaaaaa
		 */

		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {

			words[i] = input.nextLine();

		}

		// write your code below
		String longestWord = words[0];
		for (int i = 0; i < words.length; i++) {
			
			for (int j = 0; j < words.length; j++) {
				if (words[i].length() > longestWord.length()) {
					longestWord = words[i];
					break;
				}
			}
		}System.out.println(longestWord);
		
		

	}

}
