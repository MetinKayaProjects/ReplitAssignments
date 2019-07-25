package homework_replit_190_199;

import java.util.ArrayList;
import java.util.Arrays;

public class Main_190 {
	public static void main(String[] args) {
		
		//ArrayList<Integer> arr = (ArrayList<Integer>) Arrays.asList(4,-6,3,-8,0,4,3);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		arr.add(-6);
		arr.add(3);
		arr.add(-8);
		arr.add(0);
		arr.add(4);
		arr.add(3);
		arr.add(5);
		arr.add(-10);
		System.out.println(arr.toString());
		System.out.println(appendPosSum(arr));
	}
	/*
	 * Create a static method that:
-is called appendPosSum
-returns an ArrayList of Integers
-takes one parameter: an ArrayList of Integers
 
This method should:
-Create a new ArrayList of Integers
-Add only the positive Integers to the new ArrayList
-Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), 
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  
The original ArrayList should remain unchanged.
	 */
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arr){
		  ArrayList<Integer> nums = new ArrayList<>();
		  for(int i=0; i < arr.size(); i++){
		    if(arr.get(i) > 0){
		      nums.add(arr.get(i));
		    }
		  }
		    System.out.println(nums.toString());
		    int sum = 0;
		    for(int j=0; j < nums.size(); j++){
		      sum += nums.get(j);
		    }
		    nums.add(sum);
		
		  return nums;
	}
}
