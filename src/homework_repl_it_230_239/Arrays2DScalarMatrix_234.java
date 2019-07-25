package homework_repl_it_230_239;

import java.util.Arrays;

public class Arrays2DScalarMatrix_234 {
	/*
	 * scalar(matrix,5)

returns(after multiplying each value by 5):

		[
		[5,5,5]
		[5,5,10]
		]
	 */

	 public static int[][] scalar(int[][] matrix ,int n) {
		   
		 for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j]=n*matrix[i][j];
			}
		}return matrix;
		    
	  }
	  
	public static void main(String[] args)
	{
	  
	  int [][] i= new int[][]
	  {
	   {1,1,1},
	   {1,1,1}
	  }; 
	  i = scalar(i,2);
	  System.out.println(Arrays.deepToString( i ));
	  
	}//end main
	}