package homework_repl_it_3;

import java.util.Scanner;

public class PrintHalfTwice_069 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
	    String word = scan.next();
	    /*
	     * Write a program that will print out first half of the word twice. 

	Example:
		input: java
		output: jaja
	    
	     * WRITE YOUR CODE HERE
	     */
	    
	    int halfLengthOfWord = word.length() / 2;
	    String result = word.substring(0,halfLengthOfWord);
	    System.out.println(result+result);
	    
	    
	}

}
