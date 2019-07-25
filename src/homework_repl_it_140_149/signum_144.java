package homework_repl_it_140_149;

import java.util.Scanner;

public class signum_144 {
	 
	  public static void sign(int n){
	    //your code here
//		sign(5)  => 1
//		sign(-30)=> -1
//		sign(0)  => 0
		  if (n>0) {
			  System.out.println("1");
			
		}else if (n<0) {
			System.out.println("-1");
		}else {
			System.out.println("0");
		}
		  
		  
		  
	  }//end sign
	  
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	  }
	}