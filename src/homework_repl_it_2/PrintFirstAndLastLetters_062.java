package homework_repl_it_2;

import java.util.Scanner;

public class PrintFirstAndLastLetters_062 {
	public static void main(String[] args) {
		

	/*Write a program that will print out first and last letters together.
	  exp:  
		 adobe
		 ae	
		*/
		
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    	
		char letter1 = word.charAt(0);
		char letter2 = word.charAt(word.length()-1);
		
		System.out.println(letter1 +""+ letter2);
		
		
		
	}

}
