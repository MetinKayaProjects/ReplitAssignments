package homework_repl_it;

import java.util.Scanner;

public class Words_035 {
	public static void main(String[] args) {
		
		String word1, word2;
		Scanner keyboard = new Scanner(System.in);
		word1 = keyboard.next();
		word2 = keyboard.next();
		
		if(word1.equals(word2)) {  //if(word1.equalsIgnoreCase(word2)) {  //boyle yazarsan buyuk kucuk harf onemli degil.
			System.out.println("word1 equals word2");
		}else {
			System.out.println("word1 does not equal word2");
		}
		
		
	}

}
