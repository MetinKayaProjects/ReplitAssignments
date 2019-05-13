package homework_repl_it_120_129;

import java.util.Arrays;
import java.util.Scanner;

import homework_repl_it.Nums_037;

public class ArraysFrontPiece_124 {
	public static void main(String[] args) {
	/*
	 Given an int array of any length, print a new array of its first 2 elements. 
	 If the array is smaller than length 2, use whatever elements are present.

			Example:						Example:
			input 1, 2, 3 					input 1,
			output: [1, 2]					output: [1]	
		*/
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		//WRITE YOUR CODE HERE
		int[] num2 = new int[2];
		int[] num3 = new int[1];
			
			if (size >= 2) {
				num2[0] = num[0];
				num2[1] = num[1];
				System.out.println(Arrays.toString(num2));
				return;
			}
			
			
			if (size < 2) {
				num3[0] = num[0];
				System.out.println(Arrays.toString(num3));
				return;
			}
			
		
		
	}

}
