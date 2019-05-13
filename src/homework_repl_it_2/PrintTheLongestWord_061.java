package homework_repl_it_2;

import java.util.Scanner;

public class PrintTheLongestWord_061 {
	public static void main(String[] args) {
		
		//Write a program that will print out the longest word.
		
		 //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WIRTE YOUR CODE HERE
	    
	    int result1 = word1.length();
	    int result2 = word2.length();
	    
	    String longestWord = (result1 > result2) ? word1 : word2;
	    
	    System.out.println(longestWord);
		
		
		
		
		
	}

}
