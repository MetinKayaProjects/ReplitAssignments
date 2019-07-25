package homework_repl_it_130_139;

import java.util.Arrays;
import java.util.Scanner;
//Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. 
//You may modify and print the given array, or print a new array.
//Example: 
//input: 6, 2, 5, 3
//output: [2, 5, 3, 6]

public class ShiftLeft_135 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("size: ");
//	    int size = scan.nextInt();
//	    System.out.println("nums: ");
//	    int[] nums = new int[size];
//	    
//	    for(int i = 0; i < size; i++){
//	      nums[i] = scan.nextInt();
//	    }
//	    System.out.println(Arrays.toString(nums));
	    //WRITE YOUR CODE HERE
	    
	    int[] nums = {6,2,5,3};
	   // int[] nums2 = new int[nums.length];
	    int temp = nums[0];
	    for (int i = 0; i < nums.length-1; i++) {
			
			nums[i] = nums[i+1];
		//	nums[nums.length-1] = temp;
	   	  
			 
		}nums[nums.length-1] = temp;
	   
	    System.out.println(Arrays.toString(nums));

	  }
	}