package homework_repl_it_80_89;

import java.util.Scanner;

public class HasAJava_087 {
	public static void main(String[] args) {
		boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string may be any length, including 0word = . 

Example:						Example:					Example:
input: javapython				input: cjavac++				input: c#javaruby
output: true					output: true				output: false                      */
	   
	    // code is here
	    String list1 = "";
	    String list2 = "";
	    for (int i = 0; i <= word.length()-4; i++) {
	    	list1 = word.substring(0, 4);
	    	list2 = word.substring(1, 5);
	    	
		}
	    //System.out.println(list1 + ", " + list2);
	    System.out.println(list1.equalsIgnoreCase("java") || list2.equalsIgnoreCase("java"));
		
		
	}

}
