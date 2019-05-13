package homework_repl_it_2;

import java.util.Scanner;

public class FindTheLength_058 {
	public static void main(String[] args) {
		
	/*
	 Write a program that will output length of the text (string).
	 Example:
		Display message: "Please enter the text:"
		input: java
		Display message: "Length is: 4"	
	 */
		
		System.out.println("Please enter the text:");
		
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		
		System.out.println("Length is: " + text.length());
		
		
		//2nd method :
		//int result = text.length();
		//System.out.println("The result is " +result);
		
	}

}
