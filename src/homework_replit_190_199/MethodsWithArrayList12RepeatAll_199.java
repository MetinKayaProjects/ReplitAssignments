package homework_replit_190_199;

import java.util.Arrays;

public class MethodsWithArrayList12RepeatAll_199 {
	public static void main(String[] args) {

		boolean[] b2 = { false, true, false,true };
		repeatAl(b2);

	}

	/*
	 * Create a static method that: is called repeatAL returns nothing takes in a
	 * single parameter - an ArrayList of Booleans
	 * 
	 * This method should modify its ArrayList parameter by repeating its ArrayList
	 * values.
	 * 
	 * For example, if the parameter is (true, false, false) The modified ArrayList
	 * should be (true, false, false, true, false, false)
	 */
	public static void repeatAl(boolean[] b) {

		boolean[] newb = new boolean[b.length * 2];
		int idx = 0;
		int i = 0;
		if (i >= 0 && i < b.length) {
			for (i = 0; i < b.length; i++) {
				newb[idx] = b[i];
				idx++;
			}
		}
		if (i >= b.length && i < b.length * 2) {
			for (int j = 0; j < b.length; j++) {
				newb[i] = b[j];
				idx++;
				i++;
			}
		}
		System.out.println(Arrays.toString(newb));

	}
}
