package homework_repl_it_2;

import java.util.Scanner;

public class DuplicateIt_063 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    
	    /*
	     You have 2 words. Print the first word, second word, second word, first word

			Input:
				one
				two
			Output: 
				onetwotwoone
	     */
	   
	    //YOUR CODE HERE	
		
		System.out.println(word1 + word2 + word2 + word1);
		
		
	}

}
