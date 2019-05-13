package homework_repl_it;

import java.util.Scanner;

public class Nums_037 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    System.out.println("Enter 2 numbers:");
		    int num1 = input.nextInt();
		    int num2 = input.nextInt();
		    //CODE HERE 
		/*
		 * U have 2 numbers already declared and assigned values.

Using Multi-Branch if statements, check if num1 and num2 are equal, or not. 
Please follow the below examples and print message accordingly:
Enter 2 numbers:			Enter 2 numbers:				Enter 2 numbers:
10							100								33
10							55								333
10 and 10 are equal			100 is greater than 55			333 is greater than 33


		 */

	if(num1==num2) {
	//if(num1.equals(num2)){
		System.out.println(num1 + " and " + num2 + " are equal");

	}else if(num1 > num2) {
		System.out.println(num1 + " is greater than " + num2);
	}else {
		System.out.println(num2 + " is greater than " + num1);
	}
	
	
	}

}
