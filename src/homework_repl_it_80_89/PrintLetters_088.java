package homework_repl_it_80_89;

import java.util.Scanner;

public class PrintLetters_088 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
		
/* Write a program that will print out letters in the alphabetic order 
 accordingly to the given range within 2 chars. 
	Example:								Example:			Example:			Example:
	input: A								input: a			input: a			input: B
	input: Z								input: f			input: d			input: O
	output: ABCDEFGHIJKLMNOPQRSTUVWXYZ		output: abcdef		output: abcd		output: BCDEFGHIJKLMNO
*/	    
	    //code:
	  
	    
	    while(start <= end) {
	    	System.out.print(start);
	    	start++;
	    }
		
	
	    
		
	}

}
