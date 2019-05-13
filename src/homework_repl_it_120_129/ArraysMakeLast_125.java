package homework_repl_it_120_129;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMakeLast_125 {
	public static void main(String[] args) {
		/*
		 * Given an int array, print a new array with double the length where its last
		 * element is the same as the original array, and all the other elements are 0.
		 * The original array will be length 1 or more. 
		 * Note: by default, a new int array contains all 0's.
		 
		Example:						Example:				Example:
		input: 4 5 6					input: 0				input: 1 2 3 4
		output: [0, 0, 0, 0, 0, 6]		output: [0, 0]			output: [0, 0, 0, 0, 0, 0, 0, 4]
			 */
		 	Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
				for(int i =0; i < size; i++) {
					nums[i] = scan.nextInt();
				}
				//WRITE YOUR CODE HERE
				
			int[] numsNew = new int[2*size];
			for (int i = 0; i < 2*size; i++) {
				if (i < 2*size-1) {
					numsNew[i] = 0;
				}else if (i == 2*size-1) {
					numsNew[i] = nums[size-1];
				}
			}System.out.println(Arrays.toString(numsNew));
		
		
		
		
	}

}
