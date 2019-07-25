package homework_repl_it_180_189;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MethodsWithArrayList5size_get183 {
	/*
	 * The next two methods are .size() and .get().
	 * 
	 * If we have an ArrayList called someList and an Array called arr, these two
	 * pretty much do the same thing: someList.size() arr.length
	 * 
	 * In other words, .size() returns the length (size) of the list.
	 * 
	 * The method .get(i) will return the element found at index i. The following
	 * two expressions also do the same thing: someList.get(4) arr[4]
	 * 
	 * On the left, given an ArrayList of Integers called ints, find and return the
	 * sum of all the Integers in ints.
	 */
	public static int sum(ArrayList<Integer> ints) {
		// write code here
		int sumList = 0;
		for (int i = 0; i < ints.size(); i++) {
			sumList += ints.get(i);
		}
		return sumList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(4);
		nums.add(5);
//		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		sum(nums);
		System.out.println(sum(nums));

	}
}