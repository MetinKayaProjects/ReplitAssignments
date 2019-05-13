package homework_repl_it_2;

import java.util.Scanner;

public class MiddleOne_064 {
	public static void main(String[] args) {
		
	/*
	 You have a word, do the following:

1. When word has odd number of characters and:
   - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
   - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

2. When word has even number of characters and:
   - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
   - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
	
	 */
	
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    
	    int lengthChar = word.length();
	    	    
	    if(!(lengthChar % 2 == 0) && lengthChar >= 3 ) {
	    	System.out.println(word.charAt((lengthChar-1) /2));
	    }else if(lengthChar ==1){
	    	System.out.println(word + word + word);
	    }
	    
	    if(lengthChar % 2 == 0 && lengthChar >= 4) {
	    	System.out.println(word.charAt(lengthChar/2-1) +""+ word.charAt(lengthChar/2));
	    }else if(lengthChar == 2) {
	    	System.out.println(word + word);
	    }
			
		
		
		
	}

}
