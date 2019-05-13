package homework_repl_it_2;

import java.util.Scanner;

public class MiddleThree_065 {
	public static void main(String[] args) {
		
/*
 You have a word, do the following:

If the word has odd number of characters and has 5 or more characters, 
print the middle three characters of the word. 

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid		
 */
		
		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		    //YOUR CODE HERE
	
	int lenghtOfWord = word.length();	 
	
	if(lenghtOfWord % 2 !=0 &&  lenghtOfWord >= 5) {
		//char middleFront = word.charAt(((lenghtOfWord - 1)/2)-1);
		//char middle = word.charAt((lenghtOfWord - 1)/2);
		//char middleAfter = word.charAt((lenghtOfWord - 1)/2+1);
		
		//System.out.println(middleFront +""+ middle +""+ middleAfter); 
	
		System.out.print(word.charAt(((lenghtOfWord - 1)/2)-1));
		System.out.print(word.charAt((lenghtOfWord - 1)/2));
	    System.out.println(word.charAt((lenghtOfWord - 1)/2+1));
		
	}else {
		System.out.println("invalid");
	}
		 
		 
		 
		
	}

}
