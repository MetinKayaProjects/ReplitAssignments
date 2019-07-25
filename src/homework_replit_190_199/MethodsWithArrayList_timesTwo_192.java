package homework_replit_190_199;

import java.util.ArrayList;
import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class MethodsWithArrayList_timesTwo_192 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(2);
		nums.add(3);
		nums.add(1);
		
		timesTwo(nums);

	}
	// create your method below

	public static void timesTwo(ArrayList<Integer> nums) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums.size(); i++) {
			result.add(nums.get(i) * 2);
		}
		System.out.println(result.toString());

//			int[] result = new int[nums.size()];
//			  for(int i=0; i<nums.size(); i++) {
//			     result[i] = nums.get(i) * 2;
//			  }
//			  System.out.println(Arrays.toString(result));

	}
}