package homework_repl_it;

import java.util.Scanner;

public class VehicleRecallSwitch_042 {
	public static void main(String[] args) {
		
		/*B U    S W I T C H    I L E  Y A P I L A B I L I R   M I ?
		 DET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. 

In this assignment you will write a program that will find vehicle for recall. 
-Create a scanner object
-Create int variable named vehicleYear

-Display prompt: "Enter vehicle's year:"
input: 1996

 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"

Otherwise, display message:
"Your vehicle is fine, enjoy!" 
		 */
	
		System.out.println("Enter vehicle's year:");
		Scanner input = new Scanner(System.in);
		int vehicleYear = input.nextInt();
		boolean years1 = vehicleYear >= 2001 && vehicleYear <= 2002;
		boolean years2 = vehicleYear >= 2001 && vehicleYear <= 2002;
		boolean years3 = vehicleYear >= 2004 && vehicleYear <= 2006;
		boolean years4 = vehicleYear >= 2015 && vehicleYear <= 2017;
		
		switch(vehicleYear) {
		
			
		}
		
	/*	
		if(vehicleYear >= 1995 && vehicleYear <= 1998){
			//System.out.println("Your vehicle needs to be recalled!");
		}else if(vehicleYear >= 2001 && vehicleYear <= 2002) {
			
		}else if(vehicleYear >= 2004 && vehicleYear <= 2006){
			
		}else if(vehicleYear >= 2015 && vehicleYear <= 2017) {
			
		}else {
			System.out.println("Your vehicle is fine, enjoy!");
			return;
		}
		System.out.println("Your vehicle needs to be recalled!");
		
		*/
	}

}
