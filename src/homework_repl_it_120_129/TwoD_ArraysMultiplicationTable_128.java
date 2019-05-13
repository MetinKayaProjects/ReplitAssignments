package homework_repl_it_120_129;

import java.util.Arrays;

public class TwoD_ArraysMultiplicationTable_128 {
	public static void main(String[] args) {
	
//	You have  2D array multiplicationTable declared with 10 rows and 10 columns.
//	Write java program to populate the array with multiplication table values like in the picture below:

//	1   2    3    4    5    6    7    8    9  10
//	2   4    6    8   10   12   14   16   18  20
//	3   6    9   12                           30
//	4   8   12   16                           40
//	5  10   15   20                           50 
//	6  12   18   24                           60
//	7  14   21   27                           70
//	8  16	24								  80
//	9  18   27                                90
//	10 20   30   40                          100

		int [][] multiplicationTable = new int[10][10];
	    
	    //TODO: type your code below
	    
		for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j = 0; j < multiplicationTable.length; j++) {
				multiplicationTable [i][j] = (i+1) * (j+1);
			}
		}
		
		
		
		
	    
	    //Do not modify below line it will be used to test your code. And 
	    //Can be used by you while developing your code
	    System.out.println(Arrays.deepToString(multiplicationTable) ) ;	
		
  }
}
