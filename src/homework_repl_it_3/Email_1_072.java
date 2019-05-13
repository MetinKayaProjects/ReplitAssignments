package homework_repl_it_3;

import java.util.Scanner;

public class Email_1_072 {
	public static void main(String[] args) {
		
/*
 In this task, you need to swap first name with last name in the email. 
 If email doesn't contains underscore - do not anything. 

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com		
 */
		
		
		 Scanner scan = new Scanner(System.in);
		 String email = scan.nextLine();	
		
		 if(email.contains("_")) {
			 String firstName = email.substring(0, email.indexOf("_"));
			 //System.out.println(firstName);
			 String lastName =email.substring(email.indexOf("_") + 1, email.indexOf("@"));
			 //System.out.println(lastName);
			 System.out.println(lastName + "_" + firstName + "@gmail.com");
		 }else {
			System.out.println(email);
		}	 
		
	}

}
