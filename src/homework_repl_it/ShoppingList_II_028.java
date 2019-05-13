package homework_repl_it;

import java.util.Scanner;

public class ShoppingList_II_028 {
	public static void main (String[] args) {
		
		String item1, item2, item3, report;
		double price1, price2, price3, totalPrice;
		int count1, count2, count3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Item1, count and its price:");
		item1 = scan.next();
		count1 = scan.nextInt();
		price1 = scan.nextDouble();
		
		System.out.println("Enter Item2, count and its price:");
		item2 = scan.next();
		count2 = scan.nextInt();
		price2 = scan.nextDouble();
		
		System.out.println("Enter Item3, count and its price:");
		item3 = scan.next();
		count3 = scan.nextInt();
		price3 = scan.nextDouble();
		
		if(count1 > 0) {
			item1 = "Item1: " + item1 + " Price: " + count1 * price1 + ", ";
		}else {
			item1 = "";
		}
		
		if(count2 > 0) {
			item2 = "Item2: " + item2 + " Price: " + count2 * price2 + ", ";
		}else {
			item2 = "";
		}
		
		if(count3 > 0) {
			item3 = "Item3: " + item3 + " Price: " + count3 * price3;
		}else {
			item3 = "";
		}
		
		report = item1 + item2 + item3;
		
		System.out.println(report);
		
		totalPrice = count1 * price1 + count2 * price2 + count3 * price3;
		System.out.println("Total price: " +totalPrice);
		
		
	}

}
