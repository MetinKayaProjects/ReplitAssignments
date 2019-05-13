package homework_repl_it;

import java.util.Scanner;

public class ThreeNums_IfAndLogOpertors_48 {
	
	public static void main(String[] args) {
		
		
		/*in this problem you need to write a program that checks for the bigger of 3 numbers.

you get 3 int variables: n1 , n2 and n3

if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n4 is biggest output: "n3 is bigger"

hint: this can be done with 3 ifs and && operator (and operator). 

like: if n1>2 and n1>3

		*/
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		 int n1 = s.nextInt();
		System.out.println("Enter number2: ");
		 int n2 = s.nextInt();
		System.out.println("Enter number3: ");
		int n3 = s.nextInt();
	
	    
		if(n1 > n2 && n1>n3) {
			System.out.println("n1 is bigger");
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("n2 is bigger");
		}else if(n3 > n1 && n3 > n2) {
		//}else{
			System.out.println("n3 is bigger");
		}
		    
		   /*
		    * if(n1 > n2 && n1 > n3) {
			System.out.println("n1 is bigger");
		}else if(n2 > n3 ) {
			System.out.println("n2 is bigger");
		}else {
			System.out.println("n3 is bigger");
		} 
		    */
		
	}
	

}
