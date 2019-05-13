package homework_repl_it_120_129;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysConvertDecimalToBinary_123 {
	public static void main(String[] args) {
		/*
		 Binary number is a number expressed in the base-2 numeral system or binary numeral system, 
		 which uses only two symbols: typically 0 (zero) and 1 (one). Each digit is referred to as a bit.
		128  64  32  16  8  4  2  1
		0    0   0   0   0  1  1  1   >> 7
		
		Given an int variable decimal,  
		write java program to calculate binary value of 
		the decimal variable and assign it binary array. 
		print out value of binary array matching below format. 
		Feel free to use additional arrays or formulas.

				Example:
				decimal -> 3
				binary -> [0, 0, 0, 0, 0, 0, 1, 1]
				
				decimal -> 35
				binary -> [0, 0, 1, 0, 0, 0, 1, 1]
				
				decimal -> 255
				binary -> [1, 1, 1, 1, 1, 1, 1, 1]
		 */
		
		 Scanner input = new Scanner(System.in);
		    
		 int decimal = input.nextInt();
		 int[] binary = new int[8];
		    
		    //TODO: Write your code below.
	
//		 int count = 0;
//		
//		    while (decimal >= 2) {
//				decimal = decimal / 2;
//
//				count++;
//			}
		   	int remain = 0;
		    for (int i = 7; i >= 0; i--) {
		    	if(i==7) {
		    		binary[7-i] = decimal / (int)Math.pow(2, i);
		    		remain = decimal % (int)Math.pow(2, i);
		    	}else {
		    		
		    		binary[7-i] = remain/ (int)Math.pow(2, i);
					remain = remain % (int)Math.pow(2, i);
				}
				
		    }
		   	
		   System.out.println(Arrays.toString(binary));
		
		/* Cengiz:
		 int k=binary.length-1;
	    for(int i=0; i<binary.length; i++) {	
	    	int division= (int)(Math.pow(2, k));    	
	    	binary[i]= decimal/division;
	    	
	    	if(decimal/division==1) {
	    		decimal=decimal%division;
	    	}
	    	k--;
	    }
	    
	    
//	    System.out.println(35%128);
//	    System.out.println(35/64);
//	    System.out.println(35/32);
	    
	    System.out.println(Arrays.toString(binary));
	    
		 */
		
	}

}
