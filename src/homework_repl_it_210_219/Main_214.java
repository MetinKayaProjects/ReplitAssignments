package homework_repl_it_210_219;
import java.util.*;
public class Main_214 {
	public static  double convertC(String[][] money,String[][] convertionRate) {
	    /*
	     * hint: use  
			Double.parseDouble(text);
			to convert string to double
	     */
		double sum = 0.0;
		
		for (int i = 0; i < money.length; i++) {
			double d1 = Double.parseDouble(money[i][1]);
			double d2 = Double.parseDouble(convertionRate[i][1]);
			sum += d1 * d2;
		}

	   return sum;
	  }
	  
	    public static void main(String[] args) {
	     
	     
	     
	     String[][] test_money = { {"mark","5"},
	    		 				   {"shekel","30.5"}};
	     
	     String[][] test_convert={ {"mark","1"},
	    		 				   {"shekel","0.5"}};
	     
	  // double result=  convertC(test_money, test_convert);
	     double res = Main_214.convertC(test_money,test_convert);
	     System.out.print(res);
	    // System.out.println(result);
	   }

	 

}
