package homework_repl_it;

import java.util.Scanner;

public class VideoGameCoupons_034 {
	public static void main(String[]args) {
		
		int coupon, candyBars, gumballs;
		
		System.out.println("Enter number of coupons:");
		
		Scanner scan = new Scanner(System.in);
		
		coupon = scan.nextInt();
		
		candyBars = coupon / 10;
		gumballs = (coupon % 10) / 3;
		
		if(coupon>=3) {
			System.out.println("Number of Candies: " + candyBars);
			System.out.println("Number of Gumballs: " + gumballs);
						
		}else {
			System.out.println("Not enough coupons");
			
		}

		
		
	}

}
