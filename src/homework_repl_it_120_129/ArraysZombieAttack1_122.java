package homework_repl_it_120_129;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombieAttack1_122 {
	public static void main(String[] args) {
		

	/*
	 * An array inhabitants represents cities and their respective populations. 
	 For example, the following arrays shows 8 cities and their respective
	 populations: [3, 6, 0, 4, 3, 2, 7, 1] 
	 Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. 
	 After each day, every city will lose half of its population. write a program to loop
	 though each city population and make it lose half of its population until all
	 cities have no humans left. 
	 Make updates to each element in the array and print the array like below for each day:
	 
	 	Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
		Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
		Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
		Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
		---- EXTINCT ----
	 * Write the program in a way that it will handle any number of people in cities, 
	 above was just an example numbers to follow.

			Hint: 
			Below expression will print array in this format:
			
			[3, 6, 0, 4, 3, 2, 7, 1]
			
			Code:
			System.out.println(Arrays.toString(inhabitants)));
	 */
	
//			Scanner input = new Scanner(System.in);
		   // int[] inhabitants = new int[8];
		    int[]inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
//		    for(int i=0; i<inhabitants.length; i++) {
//		      inhabitants[i] = input.nextInt();
//		    }
		    
		    //TODO. Write you code below this line. 
		    int largestPop = inhabitants[0];
		   
		    for (int i = 0; i < inhabitants.length; i++) {
				for (int j = 0; j < inhabitants.length; j++) {
					
					if (inhabitants[i] > largestPop) {
						largestPop = inhabitants[i];
					}
				}
			}
//		    System.out.println(largestPop);
//		    int result = 0;
		    int count = 1;
		    while (largestPop > 0) {
				largestPop = largestPop / 2;
//				System.out.println(largestPop);
				count++;
			}
//		   	
//		   System.out.println(count);
		    
		   System.out.println("Day 0 " +Arrays.toString(inhabitants));
		   for (int i = 1; i < count; i++) {
				for (int j = 0; j < inhabitants.length; j++) {
					inhabitants[j] = inhabitants[j] / 2;
					
				}
		    	
				System.out.println("Day " + i + " " +Arrays.toString(inhabitants));
				
			}
		   System.out.println("---- EXTINCT ----");
    
    
	}
}
