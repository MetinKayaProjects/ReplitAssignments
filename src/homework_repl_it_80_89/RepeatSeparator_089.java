package homework_repl_it_80_89;

import java.util.Scanner;

public class RepeatSeparator_089 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    String separator = scan.next();
		    int count = scan.nextInt();
		    
/*
 Given two strings, word and a separator sep, 
 return a big string made of count occurrences of the word, separated by the separator string.
Example:					
input: Word
input: X
input: 3
output: Word XWord XWord

Example:
input: This
input: And
input: 2
output: This AndThis     AndThis AndThis

Example:
input: This
input: And
input: 1
output: This		    
 */
		    String letter = word;
		    String letter2 = word + separator;
		    for(int i = 1; i <= count; i++) {
		    	
		    	if(i == 1) {
					  letter = letter;
		    			    	
		    	}else if(i %2 == 0){
					letter += separator + word;
		    
		    	}else if(i %2 == 1) {
				    	letter += separator + word;
				}
		    	
		    	
		    }
		    System.out.println(letter);
		    
		    
	}

}
