package homework_repl_it_110_119;

import java.util.Scanner;

public class Print_n_times_110 {
	public static void main(String[] args) {
		/*
		 * Given an int variable n that has already been declared and initialized to a
		 * positive value, and another int variable j that has already been declared,
		 * use a for loop to print a single line consisting of n asterisks. Thus if n
		 * contains 5, five asterisks will be printed. 
		 * Use no variables other than n and j.
		 * 
		 * Example: input: 1 >> output: *
		 * 
		 * Example: input: 3 >> output: ***
		 * 
		 * NO NEED FOR ARRAY HERE, JUST USE LOOP
		 */

		int j = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// WRITE YOUR CODE HERE
		String stars = "";
		for (j = 0; j < n; j++) {
			stars += "*";
			
		}
		System.out.println(stars);
		
		

	}

}
