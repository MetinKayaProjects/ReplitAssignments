package homework_repl_it_130_139;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDiving_130 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 float[] score = new float[7];
		    //WRITE YOUR CODE HERE
		 
		 double total = 0;
		 for(int i=0; i<7; i++){
		      System.out.println("Enter score for judge " + (i+1) +":");
		      score[i] = input.nextFloat();
		    }
		 Arrays.sort(score);
//		 System.out.println(Arrays.toString(score));
		 for (int i = 1; i < 6; i++) {
			total += score[i];
		}   
//		System.out.println("TT: " + total);
		 System.out.println("Enter difficulty:");
		 double difficulty = input.nextDouble();
		 total = (total * difficulty*0.6);
		    
		    
		    // FINAL OUTPUT
		    System.out.printf("Total: %.2f", total);
		
		
	}

}
