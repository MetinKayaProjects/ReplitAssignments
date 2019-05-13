package homework_repl_it;

import java.util.*; //import java.util.Scanner;   Scanner yetine * da koyabiliriz

public class QuizQuestion_040 {
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
	    
	    System.out.println("what is the farthest planet in the solar system:" );
	    System.out.println("a)venus" );
	    System.out.println("b)pluto" );
	    System.out.println("c)neptune" );
	    
	    String answer = s.nextLine();
	    
	   /*
	   Automated tests are the future. In the given program you have a quiz question and a scanner 
	   to catch user input which will be stored on string a. 
	   after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.
	    */
	   
	    //your code here
		
	    
	     
	    if (answer.equals("a") || answer.equals("c")) {
	    	System.out.println(answer + " is wrong");
	    }else if(answer.equals("b")) {
	    	System.out.println(answer + " is correct");
	    }else {
			System.out.println(answer + " is not a valid answer");
		}
	    
		
	}

}
