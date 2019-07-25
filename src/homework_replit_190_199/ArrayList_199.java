package homework_replit_190_199;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList_199 {
	public static void main(String[] args) {
		
		
		List<Boolean> newb = Arrays.asList(false, true, true);
//		repeatAl(List<Boolean> b= ( false, true, false,true );
		
		repeatAL(newb);

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
	public static void repeatAL(List<Boolean> b) {

		List<Boolean> newb = new ArrayList<Boolean>();
		
		newb.addAll(b);
		newb.addAll(b);

	
//		int i = 0;
//		if (i >= 0 && i < b.size()) {
//			for (i = 0; i < b.size(); i++) {
//				newb.add(b.get(i));
////				
//			}
//		}
//		if (i >= b.size() && i < b.size() * 2) {
//			for (int j = 0; j < b.size(); j++) {
//				newb.add(b.get(j));
////				
//				i++;
//			}
//		}
		System.out.println(newb.toString());

	}
}
