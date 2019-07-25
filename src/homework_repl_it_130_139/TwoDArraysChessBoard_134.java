package homework_repl_it_130_139;

import java.util.*;

public class TwoDArraysChessBoard_134 {
	public static void main(String[] args) {
		/*
		 * Given a 8x8 two-dimensional array of strings named chessboard. Initialize
		 * values inside an array accordingly to the chess board. So first element in
		 * the array, chessboard[0][0] should have a value "1a", and last element in the
		 * array, chessboard[7][7] should have a value "8h".
		 */
		
		String[][] chessBoard = new String[8][8];
		// WRITE YOUR CODE HERE
		int idx = 0;
		for (int i = 0; i <= 7; i++) {
			idx=0;
			for (char letter = 'a'; letter <= 'h'; letter++, idx++) {
				chessBoard[i][idx] = (i+1) + ""+letter;
				
			}
		}
		
		
		// DO NOT CHANGE
		System.out.println(Arrays.deepToString(chessBoard));
	}
}