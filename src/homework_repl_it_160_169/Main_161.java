package homework_repl_it_160_169;

/*
 * This method calculates a water bill, the method gets a double and returns a double.
 * the regular calculation 
 * 		under 50 is :  bill = units * 0.60;
		above 50 is:	bill = units * 0.90;
		above 100 the calculation is like above 50 but with a 50 as fine
	and above 150 its the same as above 50 (units *0.90) but with a 100 fine added to the price .
	Exp:	waterTax(50)
			returns 30

 */
public class Main_161 {
	public static double waterTax(double units) {
		double bill = 0.0;
		// your code here
		if (units <= 50) {
			bill = units * 0.60;
		}else if (units > 50 && units <= 100) {
			bill =  units * 0.90;
		}else if (units >100 && units <= 150) {
			bill = units * 0.90 + 50;
		}else if (units > 150) {
			bill = units * 0.90 + 100;
		}
		
		// end your code here

		return bill;
	}// end waterTax

	public static void main(String[] args) {
		System.out.println(waterTax(151));

	}
}
