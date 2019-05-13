package homework_repl_it;

import java.util.Scanner;

public class TernaryOperator1_052 {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number:");
				int x = scan.nextInt();
				//WRITE YOUT CODE HERE
	/*
	 Write an expression using the conditional operator (? :) that compares 
	 the value of the variable x to 5 and results in:
	Display x if x is greater than or equal to 5
	Display -x if x is less than 5

	DO NOT USE IF STATEMENT or SWITCH CASE	
	 */
				
		int result = (x >= 5) ? x : -x;	
		System.out.println(result);		
	}

}
