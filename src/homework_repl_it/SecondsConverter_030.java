package homework_repl_it;

import java.util.Scanner;

public class SecondsConverter_030 {
	public static void main(String[] args) {
		
		Scanner time = new Scanner(System.in);
		   
		   int inputSeconds, hours, minutes, seconds;
		   
		   System.out.println("Enter seconds:");
		   inputSeconds = time.nextInt();
		   
		   hours = inputSeconds/3600;
		   minutes = inputSeconds % 3600/60;
		   seconds = inputSeconds % 3600 %60;
		   
		   System.out.println(hours + " hours, " + minutes 
		   + " minutes, and " + seconds + " seconds");
		   
	}

}
/*
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds. 

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

 Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */
