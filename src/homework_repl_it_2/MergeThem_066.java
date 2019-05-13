package homework_repl_it_2;

import java.util.Scanner;

public class MergeThem_066 {
	public static void main(String[] args) {
		
/*
 * You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

exp1		//  exp2	//		exp3

aok			//	ear		//		java
lol			//	pie		//		wow
alookl		//	epaire	//		cannot merge

hint:
by inserting +""+ (empty string) between chars, you can concatenate char values.		
 */
		
		Scanner scan = new Scanner(System.in);
		String word1 = scan.next();
		String word2 = scan.next();
		
		if(word1.length()==3 && word2.length() == 3) {
			System.out.println(word1.charAt(0) +""+ word2.charAt(0)+""+
			word1.charAt(1)+""+word2.charAt(1)+""+word1.charAt(2)+""+ word2.charAt(2));
		
			/*	System.out.print(word1.charAt(0));
			System.out.print(word2.charAt(0));
			System.out.print(word1.charAt(1));
			System.out.print(word2.charAt(1));
			System.out.print(word1.charAt(2));
			System.out.println(word2.charAt(2));
		*/	
		}else {
			System.out.println("cannot merge");
		}
		
		
		
		
	}

}
