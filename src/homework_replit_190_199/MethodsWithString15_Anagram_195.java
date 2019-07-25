package homework_replit_190_199;

import java.util.Arrays;

public class MethodsWithString15_Anagram_195 {
	public static boolean isAnagram(String word1, String word2) {
	    if (word1.length() != word2.length()) {
			return false;	
		}
	    
	    String str1 = word1.replace(" ", "").toLowerCase().trim();
	    String str2 = word2.replace(" ", "").toLowerCase().trim();
	    
	    char[] chars1 = str1.toCharArray();
	    char[] chars2 = str2.toCharArray();

	   Arrays.sort(chars1);
	   Arrays.sort(chars2);
	   

	   return (Arrays.equals(chars1, chars2)?true : false);
	    
	    
	  }
	public static void main(String[] args) {
		System.out.println(isAnagram("earth", "heart"));
		System.out.println(isAnagram("hi", "hello"));
	}
	

}
