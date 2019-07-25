package homework_repl_it_200_209;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsWithArrays4OopulateArray_204 {

	public static int[] populate(int[] r) {
	
		int[] newr = new int[r.length];
		int idx = 0;
		int i=0;
		
			for (i = 0; i < r.length; i++) {
			
				newr[idx] = i+1;
				idx++;
			}
//			System.out.println(idx);
		
			
		return newr;
	}

	public static void main(String[] args) {
		int [] i= new int[5]; 
//		int[] i= {1,2,3};
	    i= populate(i) ;
	    System.out.println(Arrays.toString(i));

		
	}
}
