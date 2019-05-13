package homework_repl_it_100_109;
import java.util.*;
public class ArraysCountEvens_107 {
	public static void main(String[] args) {
		
	/*
	 Given an array nums, calculate count of even numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0	
	 */
		
		 Scanner input = new Scanner(System.in);
		 int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: Write your code below	
		
//		int[] nums = {1, 3, 5, 7, 9};
//		int count = 0;
//		 for(int num : nums) {
//			if (num %2 == 0) {
//				count ++;
//			}else {
//				continue;
//			}
//		}System.out.println(count);
		
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] %2 == 0) {
				count++;
			}else {
				continue;
			}
			
		}System.out.println(count);
	}

}
