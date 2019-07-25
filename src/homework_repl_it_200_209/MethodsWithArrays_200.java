package homework_repl_it_200_209;

import java.util.*;

public class MethodsWithArrays_200 {
	public static void main(String[] args) {
		int[] nums = {2,1,2,3,4,8};
	
		System.out.println(Arrays.toString(do_switch(nums)));

	}
	//Switch the last element in an array with the first and return the array.
	public static int[] do_switch(int[] i) {
		
		int[] m = new int[1];
		m[0] = i[0];
		i[0] = i[i.length-1];
		i[i.length-1] = m[0];
		
		return i;
		
	
	}

}
