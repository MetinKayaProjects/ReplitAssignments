package homework_repl_it_120_129;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArrayLargestNumber_127 {
	
	public static void main(String[] args) {
//	    Scanner inp = new Scanner(System.in);
//	    int rows = inp.nextInt(), cols = inp.nextInt();
//	    int[][] arr = new int[rows][cols];
//	    for(int i=0 ;i<=rows-1;i++)
//	    {
//	      for(int j=0 ;j<=cols-1;j++)
//	      {
//	        arr[i][j]=inp.nextInt();
//	      }//end for cols
//	    }//end for rows
	    
	    
	    
//	    Given a 2d array of ints, find the biggest number(int) in the array and print it.

	    //TODO write your code below
	    
	    int[][] arr = { 
				{10, 20},    						//array 0   i=0 >nums[0]
				{25,35,45,55},						//array 1   i=1 >nums[1]
				{111,211,411},						//array 2   i=2 >nums[2]
				{1000,2000,3000,4000,5000,6000} 	//array 3   i=3 >nums[3]
				  };
	    
	    int max = 0;
	    for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}System.out.println(max);
	    
	    
	    
	    
	   
	  }//end main

}
