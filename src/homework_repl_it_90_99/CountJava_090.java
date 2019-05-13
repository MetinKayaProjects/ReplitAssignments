package homework_repl_it_90_99;

import java.util.Scanner;

public class CountJava_090 {
	public static void main(String[] args) {
		
/*
 Return the number of times that the string "java" appears anywhere in the given string word.

Example:					Example:
input: javaxjava			input: javaxjavaapplepearjavaegg
output: 2					output: 3
 */
		
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		
		int count = 0;
		for (int i = 0; i <= word.length()-4; i++) {
			String letter = word.substring(i, i+4);
			if (letter.equalsIgnoreCase("java")) {
				count++;				
			}
		}
		System.out.println("Count: " + count);
		
	}

}
