package homework_repl_it_3;

import java.util.Scanner;

public class CarInsuranceQuote_078 {
	public static void main(String[] args) {
		
		 //DO NOT CHANGE
	    double premium = 0;
			int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the CountyFarm car insurance!");
	    //WRITE YOUR CODE HERE
	    	System.out.println("Enter your name");
				name = scan.nextLine();
			//	name = name.toUpperCase();
				
				System.out.println("Do you have a US driver license?");
				boolean driverLicense = true;
				String answer = scan.next();
				if(answer.equalsIgnoreCase("Yes")) {
					System.out.println("Enter your zip code");
				}else {
					System.out.println("Invalid data!");
					return;
				}
				
				int zipCode = scan.nextInt();
				if(zipCode == 20910 || zipCode == 20740) {
					premium = premium + 60;
				}else if(zipCode == 22102 || zipCode == 22103) {
					premium = premium + 30;
				}else {
					premium += 50;
				}
				
				System.out.println("Is this vehicle Owned, Financed, or Leased?");
				vehicleOwnership = scan.next();
				 
				if(vehicleOwnership.equalsIgnoreCase("OWNED")) {
					premium += 10;
				}else {
					premium += 20;
				}
				
				System.out.println("How is this vehicle primarily used?");
				vehicleUsage = scan.next();
				
				if(vehicleUsage.equalsIgnoreCase("Business")){
					premium += 50;
				}else if(vehicleUsage.equalsIgnoreCase("Pleasure")) {
					premium += 10;
				}else if(vehicleUsage.equalsIgnoreCase("Commute")) {
					premium += 20;
					
					System.out.println("Days Driven To Work And/Or School");
				  daysDrivenToWorkOrSchool = scan.nextInt();
					premium = premium + 5 * daysDrivenToWorkOrSchool;
				
				  System.out.println("Miles Driven To Work And/Or School");
				  milesToWorkOrSchool = scan.nextInt();
				  premium += 1 * milesToWorkOrSchool;
					
				}
				
			
				System.out.println("How old are you?");
				int age = scan.nextInt();
				if(age < 16) {
					System.out.println("Invalid data!");
					System.exit(0);    //return;
				}else if(age >= 16 && age < 18) {
					premium = premium * 20;
				}else if(age >= 18 && age < 21) {  //18 (inclusive)??? and 21 (inclusive), multiply premium by 6.  !!!!Hata  
					premium = premium * 6;
				}else if(age >= 21 && age < 25) {
					premium = premium *2;
				}else{
				  premium = premium;
				}
				
				System.out.println("How many years you've been driving?");
				int drivingExperience = scan.nextInt();
				int result = age - drivingExperience;
				if(drivingExperience <= 0 || result < 16) {
					System.out.println("Invalid data!");
					System.exit(0);  //return;
				}else {
					premium -= drivingExperience * 5;
				}
				
				System.out.println("Have you had any accidents in the last 5 years?");
				String AnswerForAccident = scan.next();
				
				if(AnswerForAccident.equalsIgnoreCase("YES")) {
					System.out.println("How many?");
					accidentsAmount = scan.nextInt();
					premium += accidentsAmount * premium * 20/100;
				}
				
				System.out.println("Have you had continuous insurance for the past 12 months?");
				continuousInsurance = scan.next();
				
				if(continuousInsurance.equalsIgnoreCase("YES")) {
					premium = premium;
				}else if(continuousInsurance.equalsIgnoreCase("NO")) {
					premium = premium * 2;
				}
				
				System.out.println("What is the highest level of education you have completed?");
				scan.nextLine();
				education = scan.nextLine();
				
				if(education.equalsIgnoreCase("PhD") || education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
					premium = premium - premium * 5 / 100;
				}else if(education.equalsIgnoreCase("Doctors")) {
					premium = premium - premium * 10 / 100;
				}else if(education.equalsIgnoreCase("Less than High School")) {
					premium += premium * 5 / 100;
				}
				
				System.out.println(name + ", here's your quote!");
				System.out.println("Start Your Policy Today For: $" + premium);
				
				education = education.replace(" ", "").toUpperCase();
				referenceNumber = name.substring(0,2).toUpperCase()+ age + name.substring(name.length()-2).toUpperCase() + zipCode + education;
				System.out.println("Reference number: " + referenceNumber);
				
			/*
			 * In order to build reference number variable (referenceNumber), 
			 * concatenate first 2 letters of customer's name, age,  last 2 letters of of customer's  name, 
			 * zip code,  and level of education without spaces. This value should be all upper case!
			 */
			
				
	}
}
