package homework_repl_it_100_109;

import java.util.Scanner;

public class ArraysReverseSentence_102 {
	public static void main(String[] args) {

//		Given a String variable sentence, write code to type each word in separate lines in a reverse order.
//		Example:
//		sentence -> "Java is fun"
//		Print
//		fun
//		is
//		Java

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// TODO: Type your code below

		String[] sentenceArray = sentence.split(" ");
		for (int i = sentenceArray.length-1; i >= 0; i--) {
			System.out.println(sentenceArray[i]);
		}
		
		
		System.out.println("\n *** not reverse ***");
		for(String str : sentenceArray) {
			System.out.println(str);
		}
		
		
	}

}
