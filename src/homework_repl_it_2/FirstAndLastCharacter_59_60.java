package homework_repl_it_2;

import java.util.Scanner;

public class FirstAndLastCharacter_59_60 {
	public static void main(String[] args) {
		
		  //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    
	    System.out.println(word.charAt(0));	//first character f the word
	    
	    
	    
	    System.out.println(word.charAt(word.length()-1));//last letter of the word (string).
		
	}

}
