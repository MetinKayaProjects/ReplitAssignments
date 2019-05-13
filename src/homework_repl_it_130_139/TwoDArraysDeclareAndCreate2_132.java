package homework_repl_it_130_139;

import java.util.Arrays;

public class TwoDArraysDeclareAndCreate2_132 {
	public static void main(String[] args) {
//		Declare and create a two-dimensional array of chars called tictactoe, 
//		with 3 rows, each with 3 elements, and initialize it to all space characters. 
		
		// WRITE YOUR CODE HERE
		
		char[][] tictactoe = new char[3][3];
	    for(int i=0; i < 3; i++){
	      for(int j=0; j<3; j++){
	        tictactoe [i][j] = ' ';
	      }
	      
	    }
		
		// DO NOT CHANGE
		System.out.println(Arrays.deepToString(tictactoe));
	}

}
