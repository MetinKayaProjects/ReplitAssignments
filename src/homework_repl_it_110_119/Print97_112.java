package homework_repl_it_110_119;

public class Print97_112 {
	public static void main(String[] args) {
		
/* Given an int variable k that has already been declared, 
 * use a for loop to print a single line consisting of 97 asterisks. 
 * Use no variables other than k.   */		
	
		 int k = 1;
	     //WRITE YOUR CODE HERE
		 
		 String stars = "";
		 for (k = 1; k <= 97; k++) {
			stars += "*";
		}
		System.out.println(stars);
		
	}

}
