package homework_repl_it_200_209;

import java.util.Arrays;

public class PopulateTest {
	public static void main(String[] args) {
//		int[] r = new int[3];
		int[] r= {1,2,3,4,5};
		int[] newr = new int[r.length*2];
		int idx = 0;
		int i=0;
		if (i >= 0 && i < r.length) {
			for (i = 0; i < r.length; i++) {
			
				newr[idx] = r[i];
				idx++;
			}
//			System.out.println(idx);
		}
		if (i >= r.length && i < r.length*2) {
			for (int j = 0;  j < r.length; j++) {
				newr[idx] = r[j];
				idx++;
				i++;
				
			}
			
		}System.out.println(Arrays.toString(newr));
		
	}

}
