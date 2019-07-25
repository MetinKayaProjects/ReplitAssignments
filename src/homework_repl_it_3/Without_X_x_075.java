package homework_repl_it_3;

import java.util.Scanner;

public class Without_X_x_075 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a word: ");
		String word = scan.next();

//	    Given a string word, if the first or last chars are 'x' or 'X', 
//	    print the string without those 'x' or 'X' chars,  otherwise print the string unchanged. 
//
//	    Example: 					Example:
//	    input: xHiX 				input: apple
//	    output: Hi					output: apple


//
//		if (word.charAt(0) == ('x') || word.charAt(0) == ('X')) {
//			word = word.substring(1);
//		}else {
//			word = word;
//		}
//		if (word.charAt(word.length() - 1) == ('x') || word.charAt(word.length() - 1) == ('X')) {
//			word = word.substring(0, word.length() - 1);
//		}else {
//			word = word;
//		}
//		System.out.println(word);
	  
		if (word.startsWith("x") || word.startsWith("X")) {
			word = word.substring(1);
		}else {
			word = word;
		}
		if (word.endsWith("x") || word.endsWith("X")) {
			word = word.substring(0, word.length() - 1);
		}else {
			word = word;
		}
		System.out.println(word);
	   

	}

}
