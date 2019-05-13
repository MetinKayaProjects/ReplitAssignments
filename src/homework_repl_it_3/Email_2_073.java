package homework_repl_it_3;

import java.util.Scanner;



public class Email_2_073 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();	

	/*
Write a program that will print out information about user based on email. 
Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com    
	 */
		
	    String 	firstName = email.substring(0, email.indexOf("_"));
	    		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	    
	    String 	lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
	    		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
	    String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
	    String extension = email.substring(email.lastIndexOf(".")+1);
	    
	    System.out.println("First name: " + firstName);
	    System.out.println("Last name: " + lastName);
	    System.out.println("Domain: " + domain);
	    System.out.println("Top-Level Domain: " + extension);
		
		
	}

}
