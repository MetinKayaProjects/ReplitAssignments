package homework_replit_190_199;

import java.util.*;

public class Arrays_198 {
	public static int[] addElements(int[] ints1, int[] ints2) {
		/*
		 * Method addElements accepts 2 int arrays and adds each element value of two
		 * arrays and returns a new array. You can assume that each array has 5 elements
		 * addElements(new int[][10, 40, 50, 3, 1], new int[][11, 0, 500, 44, 1101]);
--------
			return array after adding values in the arrays:
             [21, 40, 550, 47, 1102]
		 */
		int[] sumArr = new int[5];
		for (int i = 0; i < ints1.length; i++) {
			sumArr[i] = ints1[i] + ints2[i];
			
		}
		return sumArr;

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(addElements(new int[] {10, 40, 50, 3, 1}, new int[] {11, 0, 500, 44, 1101})));
	}

}