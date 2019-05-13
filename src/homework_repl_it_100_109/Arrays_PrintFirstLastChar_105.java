package homework_repl_it_100_109;

import java.util.Arrays;
import java.util.Scanner;





public class Arrays_PrintFirstLastChar_105 {
	public static void main(String[] args) {
		
//		Given a String array words, iterate through each word 
//		and print first and last letter of each element in the format below.
//
//		Example:
//
//		words → ["hello", "why", "by", "apple" , "note"]
//		print → [ho, wy, by, ae, ne] 	
		
//		Scanner input = new Scanner(System.in);
//	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   String[] words = {"hello", "why", "by", "apple", "note"};

	    //TODO: Write your code below
//	  for(String word : words) {  
//		  System.out.print((word.charAt(0))+"" +(word.charAt(word.length()-1)));
//	  }
	    
//	   System.out.println((words[0].charAt(0)) + ""+ words[0].charAt(words.length-1));
//	   System.out.println(Arrays.toString(words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1)));
	   
	   
	   String str = "";
	   for (int i = 0; i < words.length; i++) {
			if(i==words.length-1) {
				str += words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1);
				//System.out.print(words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1));
			}else {
				str += words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1)+ ", " ;
				//System.out.print(words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1)+ ", ");
			//System.out.print(words[i].charAt(words[i].length()-1));
			}
			
	    }
	   System.out.print("[" + str + "]");
		
	} 

}
