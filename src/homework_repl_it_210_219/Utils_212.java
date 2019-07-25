package homework_repl_it_210_219;

import java.util.Arrays;

public class Utils_212 {
	
/*
 * Reverse a string without affecting special characters
Given a string, that contains special character together 
with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way 
that special characters are not affected.

 
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed.

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

Input:   str = "----qwe--r--tyf...gd.---" 
Output:  str = "----dgf--y--tre...wq.---" 
		
 */
	
		//TODO
		
//		String result = Utils_212.reverseLetters("..zxcv..d");
//	    System.out.println(result.equals("..dvcx..z")); //true
	public static String reverseLetters(String word){
		 char[] inputArr = word.toCharArray();  
		 char[] tempArr = new char[word.length()];  
		 int i=0;  
		 int j=0;  
		 for (char ch:inputArr){  
		   if(Character.isAlphabetic(ch)){  
		     tempArr[i] = ch;  
		     i++;  
		   }  
		 }  
		 i--;  
		 while(j<i){  
		   char temp = tempArr[i];  
		   tempArr[i]= tempArr[j];  
		   tempArr[j]=temp;  
		   j++;  
		   i--;  
		 }  
		 for(i=0,j=0;i<word.length();i++){  
		   if(Character.isAlphabetic(inputArr[i])){  
		     inputArr[i]= tempArr[j++];  
		   }  
		 }  
		 word = new String(inputArr);
		 return word;  
		  
	
		
		
		//
	//	return word;
	}
	public static void main(String[] args) {
		String result = reverseLetters("..zxcv..d");
	    System.out.println(result.equals("..dvcx..z")); //true
	    
	    String result2 = reverseLetters("---abmkl.o-");
	    System.out.println(result2.equals("---olkmb.a-")); //true
	    
	    String result3 = reverseLetters("---abmkl.o-");
	    System.out.println(result3.equals("-o.lkmba---")); //false
	}


}
