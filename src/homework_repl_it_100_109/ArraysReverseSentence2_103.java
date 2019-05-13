package homework_repl_it_100_109;

import java.util.Scanner;

public class ArraysReverseSentence2_103 {
	public static void main(String[] args) {
		
//		Given a String variable sentence, 
//		write code to get each word and assign to String reversed in reverse order. 
//
//		Example:
//		sentence -> "Java is fun"
//		reversed -> "fun is Java"	
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    
	    String[] sentenceArray = sentence.split(" ");
//	    System.out.println(sentenceArray);    // [Ljava.lang.String;@42a57993
		for (int i = sentenceArray.length-1; i >= 0; i--) {
			
			reversed += sentenceArray[i] + " "; 
			
		}
	    
	       
	    //End your code here. do not modify below statement
	    System.out.println(reversed.trim());
		
		
		
		
		
		
	}

}
