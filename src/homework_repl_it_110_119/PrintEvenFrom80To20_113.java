package homework_repl_it_110_119;

public class PrintEvenFrom80To20_113 {
	public static void main(String[] args) {

		/*
		 * Write a for loop that prints all the even integers from 80 through 20
		 * inclusive, separated by spaces.
		 */
		
		for (int i = 80; i >= 20; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		

	}

}
