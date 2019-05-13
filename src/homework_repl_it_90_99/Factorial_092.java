package homework_repl_it_90_99;

import java.util.Scanner;

public class Factorial_092 {
	public static void main(String[] args) {

		/*
		 * In mathematics, the factorial of a positive integer n, denoted by n!, is the
		 * product of all positive integers less than or equal to n. Calculate factorial
		 * and output result to the console. Example: input: 5 output: 120
		 * >>5*4*3*2*1=120
		 */

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// code here
		long factorial = 1;
//		for(int i=1; i<=n; i++) {
//			factorial = factorial * i;
		for(int i=n; i > 0; i--) {
			factorial = factorial * i;
			
		}
		System.out.println(factorial);
		

	}

}
