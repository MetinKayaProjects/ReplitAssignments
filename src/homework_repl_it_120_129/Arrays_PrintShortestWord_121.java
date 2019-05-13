package homework_repl_it_120_129;


import java.util.Arrays;
import java.util.Scanner;

public class Arrays_PrintShortestWord_121 {
	public static void main(String[] args) {
//		Write a program that will find out shortest words in the given string str. 
//		If there are few words that are evenly short, print them all. 
//		Use split method in order to split str string variable and create an array of strings.  
//		Print array with Arrays.toString() method. Sort array before printing. 	
//		
//		input: olive, fish, hot pursuit, old, warning, python, java, coffee, cat, ray
//		output: [cat, old, ray]
		
	
		String str = "olive, fish, hot pursuit, old, warning, python, java, coffee, cat, ray";
//		String str = "olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer";
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
		
		String[] strArr = str.split(", ");
//		System.out.println(Arrays.toString(strArr));
		
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < strArr.length; i++) {
			//for (int j = 0; j < strArr.length; j++) {
				if (strArr[i].length() < smallest) {
					smallest = strArr[i].length();
//					System.out.println(smallest);
				}
			//}
		}
//		System.out.println(smallest);
		
		int count = 0;
		for (int j = 0; j < strArr.length; j++) {
			if (strArr[j].length() == smallest) {
				count++;
			}
		}
		String[] result = new String[count];
		int k = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() == smallest) {
				result[k] = strArr[i];
				k++;
			}
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		
		

		
	}

}
