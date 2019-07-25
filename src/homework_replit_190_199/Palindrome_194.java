package homework_replit_190_199;

import java.lang.reflect.Array;

public class Palindrome_194 {
	/*
	 * Palindrome is a word, phrase, or sequence that reads the same backward as
	 * forward, e.g., madam or nurses run.
	 * 
	 * So method isPalindrome checks that and returns true if check is palindrome
	 * and false if it is not.
	 * 
	 * - make your conditions case insensitive. ex: Civic and civic are both
	 * palindromes - make your conditions space insensitive. Race car is a
	 * palindrome even though there is space in between.
	 * 
	 * Examples:
			isPalindrome("Noon") ==> true
			isPalindrome("I am not palindrome") ==> false
			isPalindrome("wooden") ==> false
			isPalindrome("Nurses Run") ==> true
	 */
	 public static boolean isPalindrome(String check) {
		  check = check.replace(" ", "").toLowerCase();
		  String reverseCheck = "";
		  //char charArr = Array.toCharacter(check);
		 for (int i = check.length()-1; i >= 0; i--) {
			reverseCheck += check.charAt(i);
			System.out.println(reverseCheck);
		}
		 if (check.equalsIgnoreCase(reverseCheck)) {
			return true;
		}
		 return false;
	  }
	

}
