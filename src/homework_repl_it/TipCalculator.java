package homework_repl_it;

import java.util.Scanner;



public class TipCalculator {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Number of people entered: ");
		int numberOfPeople = input.nextInt();
		System.out.println("Please, Enter the Check Amount: ");
		double checkAmount = input.nextInt();
		
			
		System.out.println("Please choose the service quality as it is Poor, Fair, Good, Great, Excellent");
		String serviceQuality = input.next().toLowerCase();
		String symbolOfPeople = null;
		
		double totalTip = 0.0;
		double totalToPay = 0.0;
		double totalPerPerson = 0.0;
		double tipPerPerson = 0.0;
		
	
		
	
		boolean isSplit;
		System.out.println("Is it split the bill? Yes | No ");
		String answer = input.next();
		
				
		if(answer.equalsIgnoreCase("Yes")) {
			isSplit = true;
			System.out.println("Number of people to split the bill: ");
			int numberOfPeopleSplit = input.nextInt();
			
			if(numberOfPeople > 10) {
				numberOfPeopleSplit = 10;
			}if(numberOfPeople == 0) {
				numberOfPeopleSplit = 1;
			}
			
			
			switch(numberOfPeopleSplit) {
			case 1:
				symbolOfPeople = "&";
				break;
			case 2:
				symbolOfPeople = "&&";
				break;
			case 3:
				symbolOfPeople = "&&&";
				break;
			case 4:
				symbolOfPeople = "&&&&";
				break;
			case 5:
				symbolOfPeople = "&&&&&";
				break;
			case 6:
				symbolOfPeople = "&&&&&&";
				break;
			case 7:
				symbolOfPeople = "&&&&&&&";
				break;
			case 8:
				symbolOfPeople = "&&&&&&&&";
				break;
			case 9:
				symbolOfPeople = "&&&&&&&&&";
				break;
			case 10:
				symbolOfPeople = "&&&&&&&&&&";
				break;
				
			}
			
			
			System.out.println("*** Thank you for choosing us! ***\n");
			
			if(serviceQuality.equalsIgnoreCase("Poor")) {
				totalTip = checkAmount * 0.05;
				System.out.println("Service Quality.......................: POOR");
				
				
			}else if(serviceQuality.equalsIgnoreCase("Fair")) {
				totalTip = checkAmount * 0.10;
				System.out.println("Service Quality.......................: FAIR");
				
				
			}else if(serviceQuality.equalsIgnoreCase("Good")) {
				totalTip = checkAmount * 0.15;
				System.out.println("Service Quality.......................: GOOD");
				
										
			}else if(serviceQuality.equalsIgnoreCase("Great")) {
				totalTip = checkAmount * 0.20;
				System.out.println("Service Quality.......................: GREAT");
				
				
			}else if(serviceQuality.equalsIgnoreCase("Excellent")) {
				totalTip = checkAmount * 0.25;
				System.out.println("Service Quality.......................: EXCELLENT");
				
			}else {
				return;
			}
	
					
		totalToPay = totalTip + checkAmount;
		totalPerPerson = totalToPay / numberOfPeopleSplit;
		tipPerPerson = totalTip / numberOfPeopleSplit;
	
		
		System.out.println("The number of the people to split bill: " + symbolOfPeople);
		System.out.println("Total to pay..........................: " + totalToPay);
		System.out.println("Total tip.............................: " + totalTip);
		System.out.println("Total per person......................: " + totalPerPerson);
		System.out.println("Tip per person........................: " + tipPerPerson);
		
				// no split
		
		}else if(answer.equalsIgnoreCase("No")){
			isSplit = false;
			System.out.println("*** Thank you for choosing us! ***\n");
			symbolOfPeople = "&";
			
			if (serviceQuality.equalsIgnoreCase("Poor")) { 
				totalTip = checkAmount * 0.05;
				
			}else if(serviceQuality.equalsIgnoreCase("Fair")) {
				totalTip = checkAmount * 0.10;
				
			}else if(serviceQuality.equalsIgnoreCase("Good")) {
				totalTip = checkAmount * 0.15;
				
			}else if(serviceQuality.equalsIgnoreCase("Good")) {
				totalTip = checkAmount * 0.15;
				
			}else if(serviceQuality.equalsIgnoreCase("Great")) {
				totalTip = checkAmount * 0.20;
				
			}else if(serviceQuality.equalsIgnoreCase("Excellent")) {
				totalTip = checkAmount * 0.25;
				
			}else {
				return;
		}
		
			totalToPay = totalTip + checkAmount;
			totalPerPerson = totalToPay;
			
			System.out.println("Only one person pays!..................: " + symbolOfPeople);
			System.out.println("Total to pay...........................: " + totalToPay);
			System.out.println("Total tip..............................: " + totalTip);
			System.out.println("Total per person.......................: " + totalPerPerson);
			//System.out.println("Tip per person: " + tipPerPerson);
			return;
		}
			
			
			
		}
}	
		
		
	
		
	


