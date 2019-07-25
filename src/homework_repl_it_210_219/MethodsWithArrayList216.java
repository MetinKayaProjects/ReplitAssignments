package homework_repl_it_210_219;

import java.util.*;

public class MethodsWithArrayList216 {

	/*
	 * This method gets an arraylist of Integers and a number(Integer).it returns an
	 * arraylist.
	 * 
	 * It removes any instance of the number it gets from the arraylist.
	 * 
	 * for example:
				romoveInst([1,1,2,3,1,4],1)
				returns: [2,3,4]
				
				romoveInst([3,4,3,3],4)
				returns: [3,3,3]
	 */
	public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
		ArrayList<Integer> r2 = new ArrayList<Integer>();
		for (int i = 0; i < r.size(); i++) {
			int count =0;
			if (r.get(i)==n) {
				r2.add(r.get(i));
			}
			r.removeAll(r2);
		}

		return r;
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		Integer[] nums = new Integer[] { 1, 1, 2, 3,1,2,3,1 };
		arr.addAll(Arrays.asList(nums));

		System.out.print(removeInst(arr, 1));

	}// end main

}
