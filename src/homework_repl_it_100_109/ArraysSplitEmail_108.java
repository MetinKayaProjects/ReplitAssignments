package homework_repl_it_100_109;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSplitEmail_108 {
	public static void main(String[] args) {
		
	/*
	 Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email -> info@cybertekschool.com
Print:  
Email id: info
Email domain: cybertekschool.com

	If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com
print:  
invalid email

email -> my@fancy@email.com
print:  
invalid email	
	 */
		 Scanner input = new Scanner(System.in);
		 String email = input.nextLine();
		    
		    //Write your code below
		
		//String[] emailArr = email.split("@");
	//	System.out.println(Arrays.toString(emailArr));
	//	System.out.println(emailArr[0]);
		
		//int count = 0;
	
		if (email.contains("@")) {
			String[] emailArr = email.split("@");
//			System.out.println(Arrays.toString(emailArr));
			
			if (emailArr.length == 2) {
				System.out.println("Email id: " + emailArr[0]);
				System.out.println("Email domain: " + emailArr[1]);
				//return;
			
			}else if (emailArr.length > 2) {
				System.out.println("invalid email");
			} 
			
		}else {
			System.out.println("invalid email");
			
		}
		
	
		
	}

}
