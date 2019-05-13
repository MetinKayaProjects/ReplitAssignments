package homework_repl_it_100_109;

import java.util.Scanner;

public class ArraysPrintFirstLastChar_I_101 {
	public static void main(String[] args) {
//		Given a String array words, iterate through each word 
//		and print first and last letter of each element in separate lines.
//
//		Example:
		String[] words = {"hello", "why", "by", "apple" , "note"};
//		print: 
//		       ho
//		       wy
//		       by
//		       ae
//		       ne 
	   
//		Scanner input = new Scanner(System.in);
//	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   

	    //TODO: Write your code below
//	
//		for (int i = 0; i < words.length; i++) {
//			System.out.println(words[i].charAt(0) + words[i].charAt(words.length-1));
//		}
	   
		for(String word : words) {
			System.out.println(word.charAt(0) + ""+ word.charAt(word.length()-1));
		}
		
		
		
	}

}
