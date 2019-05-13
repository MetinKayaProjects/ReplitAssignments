package homework_repl_it_90_99;

import java.util.Scanner;

public class PrintLetters_096 {
	public static void main(String[] args) {

//		Write a program that will print out letters in the alphabetic order accordingly to the given range. 
//		Example:
//		input: A
//		input: Z
//		output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
//
//		Example:
//		input: a
//		input: f
//		output: abcdef
//
//		Example:
//		input: a
//		input: d
//		output: abcd
//
//		Example:
//		input: B
//		input: O
//		output: BCDEFGHIJKLMNO

		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);
		String letters = "";
		while (start <= end) {
			letters += start;
			start++;
		}
		System.out.println(letters);

	}

}
