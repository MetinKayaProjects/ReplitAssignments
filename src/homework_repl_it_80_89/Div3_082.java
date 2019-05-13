package homework_repl_it_80_89;

public class Div3_082 {
	public static void main(String[] args) {
		
//		Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
//		Expected Output:  3 6 9 12 15 18	
		
		for(int i = 1; i <= 20; i++) {
			int result = i % 3;
			if(result == 0) {
				System.out.print(i + " ");
								
			}
		}
		
		
		
	}

}
