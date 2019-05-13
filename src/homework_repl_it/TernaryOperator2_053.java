package homework_repl_it;

import java.util.Scanner;

public class TernaryOperator2_053 {
	public static void main(String[] args) {
		
		//DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			//WRITE YOUR CODE HERE	
		/*
		 Write an expression using the conditional operator (? :) that compares the values of the 
		 variables num1 and num2. The result (that is the value) of this expression should be 
		 the value of the larger of the two variables.  Larger value should be printed out.
		 */
		int result = (num1 > num2) ? num1 : num2;
		
		System.out.println(result);
			
			
			
	}

}
