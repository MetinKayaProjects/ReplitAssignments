package homework_repl_it_220_229__226;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
			
		
		MultiplicationTable table = new MultiplicationTable();


		int [] n= table.generateTable(3,6);
		System.out.println(Arrays.toString(n));
		//returns:
		//[0,3,6,9,12,15]

		table.generateTable(9,3);
		System.out.println(Arrays.toString(table.generateTable(9,3)));
		//returns:
		//[0,9,18]

		n=table.generateTable(7,9);
		System.out.println(Arrays.toString(n));
		//returns:
		//[0,7,14,21,28,35,42,49,56]
		
		
		int[] tableToTest = {0,3,6,9,12,15};
				table.checkTable(3,tableToTest);
				System.out.println(table.checkTable(3,tableToTest));
//				returns:true

		int[] tableToTest2 = {0,3,6,999,12,15};
				table.checkTable(3,tableToTest2);
				System.out.println(table.checkTable(3,tableToTest2));
//				returns:false
		
		
        
    }
}
