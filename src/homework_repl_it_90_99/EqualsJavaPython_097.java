package homework_repl_it_90_99;

import java.util.Scanner;

public class EqualsJavaPython_097 {
	public static void main(String[] args) {
//		Given a string, print out true if the number of appearances of "java" anywhere in the string is equal 
//		to the number of appearances of "python" anywhere in the string (case sensitive).
//		Example:
//		input: We study java not python
//		output: true
//
//		Example:
//		input: What's the difference between java, javascript and python?
//		output: false

		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i <= sentence.length()-4; i++) {
			if (sentence.substring(i, i + 4).equals("java")) {
				count1++;
			}
		}
		for (int i = 0; i <= sentence.length()-6; i++) {
			if (sentence.substring(i, i + 6).equals("python")) {
				count2++;
			}
		}
		System.out.println((count1==count2) ? true : false);

	}

}
