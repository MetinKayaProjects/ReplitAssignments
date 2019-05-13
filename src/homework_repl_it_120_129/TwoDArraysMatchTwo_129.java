package homework_repl_it_120_129;

import java.util.Scanner;

public class TwoDArraysMatchTwo_129 {
	public static void main(String[] args) {
	/*
	 * You get a 2d array and you need to find how many two matches there are.
and return the number(int) of matches you found.

For example : 1 and 2 are not a match, 2 and 2 are a match.
a match in this case is two numbers in a row that are equal .
	
	 */
//		 Scanner inp = new Scanner(System.in);
//		    int rows = inp.nextInt(), cols = inp.nextInt();
//		    int[][] arr = new int[rows][cols];
//		    for(int i=0 ;i<=rows-1;i++)
//		    {
//		      for(int j=0 ;j<=cols-1;j++)
//		      {
//		        arr[i][j]=inp.nextInt();
//		      }//end for cols
//		    }//end for rwos
		    
		    //your code here
		int[][]arr = {	{2,2,1,3,4,5},
						{5,2,3,3,4,5},
						{3,3}};
    
		
		
		    int matches = 0;
				
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length-1; j++) {
					if (arr[i][j] == arr[i][j+1]) {
						matches++;
					}
				}
			}	
				
		    
		    
		    System.out.print("matches: "+matches);
		
	}
}
