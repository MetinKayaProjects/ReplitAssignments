package homework_repl_it;

import java.util.Scanner;

public class PatientInformation_024 {
	public static void main(String[] args) {
		
		/*
		Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
		Declare 2 int variables: age, zipcode
		Declare 2 double variables: height, weight.
		Declare boolean variable: isMarried (for marriage status).
		Declare 2 long variables: workPhoneNumber and personalPhoneNumber.
		*/
	String firstName, lastName, fullName, email, street, state, city, address, contacts;
	int age, zipcode; 
	double height, weight;
	long workPhoneNumber, personalPhoneNumber;
	boolean isMarried;
	
		
		//-Create a Scanner object named scan.
	Scanner scan = new Scanner(System.in);
	
	/* Execution flow with example:
		-Display prompt "Welcome to the patient portal!"
		-Display prompt "Please enter your personal information"
		-Display prompt "Enter your first name"
		James
		-Display prompt "Enter your last name"
		May
		-Display prompt "Enter your email"
		jamesmay@gmail.com
		-Display prompt "Enter your street"
		7925 Jones Branch Dr
		-Display prompt "Enter your city"
		McLean
		-Display prompt "Enter your state"
		VA
		-Display prompt "Enter your zip code"
		22102
		-Display prompt "Enter your work phone number"
		7896542314
		-Display prompt "Enter your personal phone number"
		2406542314
		-Display prompt "Enter your age"
		35
		-Display prompt "Enter your height"
		5.10
		-Display prompt "Enter your weight"
		173.2
		-Display prompt "Are you married?"
		true
    */
	System.out.println("Welcome to the patient portal!");
	System.out.println("Please enter your personal information");
	System.out.println("Enter your first name");
	firstName = scan.nextLine();
	System.out.println("Enter your last name");
	lastName = scan.nextLine();
	System.out.println("Enter your email");
	email = scan.nextLine();
	System.out.println("Enter your street");
	street = scan.nextLine();
	
	System.out.println("Enter your city");
	city = scan.nextLine();
	
	System.out.println("Enter your state");
	state = scan.nextLine();
	
	System.out.println("Enter your zip code");
	zipcode = scan.nextInt();
	System.out.println("Enter your work phone number");
	workPhoneNumber = scan.nextLong();
	System.out.println("Enter your personal phone number");
	personalPhoneNumber = scan.nextLong();
	System.out.println("Enter your age");
	age = scan.nextInt();
	System.out.println("Enter your height");
	height = scan.nextDouble();
	System.out.println("Enter your weight");
	weight = scan.nextDouble();
	System.out.println("Are you married?");
	isMarried = scan.nextBoolean();
		/*
		-build contacts variable by concatenating work phone, personal phone and email
		-build fullName variable by concatenating first name and last name
		-build address variable by concatenating street, city, state, zip code
		
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		*/
					
		fullName = firstName +", "+lastName;
		
		
			
		contacts = "Contacts: work phone number - " + workPhoneNumber + 
				", personel phone number - " + personalPhoneNumber + ", email: " + email; //work phone, personal phone and email
		
		fullName = lastName + "," + firstName;
		address = street +", "+ city +", " + state+ " " + zipcode; 
		
		
		/*
		//this is should be an output in the console (terminal)

		Patient personal information
		Full name: May, James
		Address: 7925 Jones Branch Dr, McLean, VA 22102
		Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
		Age: 35
		Height: 5.1
		Weight: 173.2 pounds
		Married?: true
		 */

		System.out.println("Patient personal information");
		System.out.println("Full name: " + fullName);
		System.out.println("Address: " + address);
		System.out.println(contacts);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight + " pounds");
		System.out.println("Married?: " + isMarried);

		
		
	}

}

