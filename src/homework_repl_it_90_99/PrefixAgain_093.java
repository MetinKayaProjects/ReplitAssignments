package homework_repl_it_90_99;

import java.util.Scanner;

public class PrefixAgain_093 {
	public static void main(String[] args) {
		System.out.println("Enter word:");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("Enter an index: ");
		int n = scan.nextInt();

//	    Given a string, consider the prefix string made of the first n chars of the string. 
//	    Does that prefix string appear somewhere else in the string? 
//	    Assume that the string is not empty and that n is in the range from 1 till str.length().
//	    Example:					Example:					Example:
//	    	input: abXYabc				input: abXYabc				input: abXYabc
//	    	input: 1					input: 2					input: 3
//	    	output: true				output: true				output: false
//	    	a appears twice				ab appears twice			abX appears once only

		// code here

	
		

		int count = 0;
		for (int i = 0; i <= str.length() - n; i++) {
			String temp = str.substring(i, i + n);
			
			if(temp.equals(str.substring(0,n))) {
				count++;
			}
		}
		
		System.out.println(count > 1 ? true : false);
//		if(count>1) {
//			
//			System.out.println("true");
//			//System.out.println(str.substring(0, n) + " appears " + "once only");
//			return;
//		}else {
//			System.out.println("false");
//			return;
//		}

		
		
		
		
		
		
		
	}

}
