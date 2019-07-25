package homework_repl_it_220_229;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class ArrayList_222 {
	public static void main(String[] args){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(5);
		nums.add(3);
		nums.add(7);
		//List<Integer> list = Arrays.asList(1,5,3,7);
		//System.out.println(nums.toString());
		System.out.println(twoTimes(nums));
//		System.out.println(twoTimesv2(list));
	}
	//create your method below
//	Create a method that:
//
//		is called twoTimes
//		returns a new ArrayList of Integers
//		takes in a single parameter - an ArrayList of Integers
//
//		This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.
//
//		For example, if the parameter is
//		(1,5,3,7)
//		The method should return a new ArrayList of Integers with
//		(1,1,5,5,3,3,7,7)
	
	public static List<Integer> twoTimes(List<Integer> list){
		
		List<Integer> myList = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			myList.add(list.get(i)); 
			myList.add(list.get(i)); 
		}
		//myList.addAll(myList);
		
		return myList;
	}

	
}