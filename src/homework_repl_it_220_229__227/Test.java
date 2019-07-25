package homework_repl_it_220_229__227;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		System.out.println(isPrime(11));
		System.out.println(Arrays.toString(generateTable(100, 5)));
       
	}
public static boolean isPrime(int number) {
        
        //TODO:
    	if (number <=1) {
    		return false;
			
		}
    	for (int i = 2; i < number; i++) {
			
    		if (number % i == 0) {
				return false;
			}
		}
       return true;
    }
public static int[] generateTable(int start, int numberOfEntries) {
    //TODO
 	
    int [] primetable = new int[numberOfEntries];
    int idx=0;
    while(idx < numberOfEntries) {
 	   if (isPrime(start)) {
			primetable[idx] = start;
			start++;
			idx++;
		}else {
			start++;
			
		}
 	   
    } return primetable;
 }

}
