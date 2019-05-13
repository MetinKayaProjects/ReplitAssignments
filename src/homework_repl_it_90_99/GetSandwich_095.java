package homework_repl_it_90_99;

import java.util.Scanner;


public class GetSandwich_095 {
	public static void main(String[] args) {
		
//		A sandwich is two pieces of bread with something in between. 
//		Print the string that is between the first and last appearance of "bread" in the given string, 
//		or return string "nothing" if there are not two pieces of bread.
//
//				Example:
//				input: breadjambread
//				output: jam
//
//				Example:
//				input: xxbreadjambreadyy
//				output: jam
//
//				Example:
//				input: xxbreadapple
//				output: nothing
//
//				Example:
//				input: breadbutterbread
//				output: butter	
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	   
		
			int firsIndexofBread = str.indexOf("bread");
			int lastIndexOfBread = str.lastIndexOf("bread");
			int count = 0;
			for (int i = 0; i <= str.length() - 5; i++) {
				String temp = str.substring(i, i + 5);
			//	System.out.println(temp);
				if(temp.equals("bread")) {
					count++;
				}
			}
			
			
			//System.out.println("Count (bread): " + count);  
			
			if (count>=2) {
				String result = str.substring(firsIndexofBread+5, lastIndexOfBread);
				System.out.println(result);
				return;
			}else if(count<2) {
				System.out.println("nothing");
				return;
			}
			
			
			
//			if (count>=2) {
//				String result = str.substring(firsIndexofBread+5, lastIndexOfBread);
//				if (str.contains("bread" + result + "bread")) {
//					System.out.println(result);
//				}else {
//					System.out.println("nothing");
//				}
//				
//			}else {
//				System.out.println("nothing");
//			}
//			
//
//			if (str.length() < ("bread" + result + "bread").length()) {
//				System.out.println("nothing");
//			}else if (str.contains("bread" + result + "bread")) {
//				System.out.println(result);
//			}else {
//				System.out.println("nothing");
//			}
		

}

}
