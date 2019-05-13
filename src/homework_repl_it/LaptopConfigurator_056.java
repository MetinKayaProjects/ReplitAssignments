package homework_repl_it;

import java.util.Scanner;

public class LaptopConfigurator_056 {
	public static void main(String[] args) {
		
	double price = 0;
	String storageType, screenType, cpu;
	int ram = 0 ;
	int memorySize = 0;
	String screenSize;
	Scanner scan = new Scanner(System.in);
	
	    //WRITE YOUR CODE HERE
	
	System.out.println("Select screen size:");
	screenSize = scan.nextLine();
	if(screenSize.equals("13.3")) {price = price + 200;}
	else if(screenSize.equals("15.0")) {price = price + 300;}
	else if(screenSize.equals("17.3")){price = price + 400;}
	
	System.out.println("Select CPU type:");
	cpu = scan.nextLine();
	
	if(cpu.equals("i3")) {price = price +150;}
	else if(cpu.equals("i5")) {price = price + 250;}
	else if(cpu.equals("i7")) {price = price + 350;}
	
	System.out.println("Select RAM size:");
	ram = scan.nextInt();
	price = price + (ram / 4) * 50;
	
	System.out.println("Select storage type:");
	storageType = scan.next();
		
	System.out.println("Enter memory size:");
	memorySize = scan.nextInt();
	
	if(storageType.equals("SSD")) {price = price + 100 * (memorySize / 500);}
	else if(storageType.equals("HDD")) {price = price + 50 * (memorySize / 500);}
	
	System.out.println("Enter screen resolution:");
	screenType = scan.next();
	if(screenType.equals("FULLHD")) {price = price + 100;}
	else if(screenType.equals("4K")){price = price + 200;}
	
	System.out.println("Laptop price is: " + price);
	
	
		
	}

}
