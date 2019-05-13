package homework_repl_it_3;

import java.util.Scanner;

public class VerifyContains_068 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word: ");
	    String word = scan.nextLine();
	    System.out.println("Enter a text: ");
	    String sentence = scan.nextLine();
	    //WRITE YOUR CODE HERE
	     boolean result = true;
			    if(sentence.contains(word)){
			      System.out.println(result);
			    }else{
			      System.out.println("false");
			    }
	}

}
