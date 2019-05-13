package homework_repl_it_90_99;

import java.util.Scanner;

public class CountHi_091 {
	public static void main(String[] args) {
/*
 Print out the number of times that the string "hi" appears anywhere in the given string.

Example:					Example:
input: abc hi how hi		input: hi code java please
output: 2					output: 1	
 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER A WORD/SENTENCE: ");
	    String str = scan.nextLine();
	    int count = 0;
	    for (int i = 0; i <= str.length()-2; i++) {
			String letter = str.substring(i, i+2);
			if(letter.equalsIgnoreCase("hi")) {
				count++;
			}
		}
	    System.out.println("count of hi: " + count);
	    
	}

}
