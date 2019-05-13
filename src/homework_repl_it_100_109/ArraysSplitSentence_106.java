package homework_repl_it_100_109;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysSplitSentence_106 {
	public static void main(String[] args) {

//		Given a String variable sentence, write code to type each word in separate lines.

//		Example:
//		sentence -> "Java is fun"
//		Print
//		Java
//		is
//		fun
		
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    
	    //type your code below
		
		String[] strArr = sentence.split(" ");
	
		for(String str : strArr) {
			System.out.println(str);
		}

		//	or:	
//		for (int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
		
		
		
		
	}

}
