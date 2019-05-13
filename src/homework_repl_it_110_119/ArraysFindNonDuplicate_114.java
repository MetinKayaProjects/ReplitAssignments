package homework_repl_it_110_119;

import java.util.Scanner;

public class ArraysFindNonDuplicate_114 {
	public static void main(String[] args) {

		/*
		 * Given an array nums with 7 integers every element is repeated twice - except
		 * one. Find that element and print it to console.
		 * 
		 * Example:
		 * 
		 * nums -> [1, 1, 2, 3, 4, 3, 4] 2
		 */

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

//		int[] nums = { 1, 1, 2, 3, 4, 3, 4 };
		// TODO: write your code below

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println(nums[i]);
				break; // exit loop
			}

		}
	}
}
