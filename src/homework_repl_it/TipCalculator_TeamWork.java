package homework_repl_it;

import java.util.Scanner;

public class TipCalculator_TeamWork {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        int numberOfPeople, tipPercent;
        double checkAmount, totalAmount, totalTip, totalPerPerson, tipPerPerson;
        boolean isSplit;
        String split, serviceQuality, ampersands;
        
        System.out.println("Do you want to split the bill? (type yes or no)");
        split = scan.next();
        
        System.out.println("Number of people eating?");
        numberOfPeople = scan.nextInt();
        
        System.out.println("Check amount:");
        checkAmount = scan.nextDouble();
        
        System.out.println("Service Quality");
        serviceQuality = scan.next();
        
        if(split.equalsIgnoreCase("yes")) {
            isSplit = true;
        } else {
            isSplit = false;
        }
        
        if (numberOfPeople == 0) {
            numberOfPeople = 1;
        } else if(numberOfPeople > 10) {
            numberOfPeople = 10;
        }
        
        tipPercent = 0;
        ampersands = "";
        
        serviceQuality = serviceQuality.toUpperCase();
        
        switch(serviceQuality) {
        case "POOR":
            tipPercent = 5;
            break;
        case "FAIR":
            tipPercent = 10;
            break;
        case "GOOD":
            tipPercent = 15;
            break;
        case "VERY GOOD":
            tipPercent = 20;
            break;
        case "EXCELLENT":
            tipPercent = 25;
            break;
        default:
            tipPercent = 0;
        }
        
        switch(numberOfPeople) {
        case 1:
            ampersands = "&";
            break;
        case 2:
            ampersands = "&&";
            break;
        case 3:
            ampersands = "&&&";
            break;
        case 4:
            ampersands = "&&&&";
            break;
        case 5:
            ampersands = "&&&&&";
            break;
        case 6:
            ampersands = "&&&&&&";
            break;
        case 7:
            ampersands = "&&&&&&&";
            break;
        case 8:
            ampersands = "&&&&&&&&";
            break;
        case 9:
            ampersands = "&&&&&&&&&";
            break;
        case 10:
            ampersands = "&&&&&&&&&&";
            break;
        }
            
        totalTip = checkAmount * (tipPercent*0.01);
        
        totalAmount = checkAmount + totalTip;
        
        if(isSplit) {
            totalPerPerson = totalAmount/numberOfPeople;
            tipPerPerson = totalTip / numberOfPeople;
        } else {
             totalPerPerson = totalAmount;
             tipPerPerson = totalTip;
        }
        
         System.out.println("Is the bill being split? " + split);
         System.out.println("Number of people " + ampersands);
         System.out.println("Total to pay " + totalAmount);
         System.out.println("Total tip " + totalTip);
        
        
        

            if(isSplit) {
            System.out.println("Total per person:" + totalPerPerson);
            System.out.println("Tip per person:" + tipPerPerson);
            } else {
                System.out.println("Total to be paid by one person:" + totalPerPerson);
                System.out.println("Tip to be paid by one person:" + tipPerPerson);
            }
        
		
		
		
		
	}

}
