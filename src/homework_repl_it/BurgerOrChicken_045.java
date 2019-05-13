package homework_repl_it;

import java.util.Scanner;

public class BurgerOrChicken_045 {
	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		    
		    
		    String in = s.next();
		    
		    //your code here
		float price1 = (float)10.0;
		float price2 = (float)2.0;
		
		if(in.equals("burger") || in.equals("chicken")){
		  System.out.println(price1);
		}else if(in.equals("soda")){
		  System.out.println(price2);
		}
		
	}

}
