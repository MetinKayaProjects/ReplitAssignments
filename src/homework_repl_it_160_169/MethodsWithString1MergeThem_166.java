package homework_repl_it_160_169;

public class MethodsWithString1MergeThem_166 {
	public static void main(String[] args) {
		System.out.println(mergeStrings("wooden", "spoon"));
		System.out.println(mergeStrings("12345", "abcde"));
		System.out.println(mergeStrings("java", "selenium"));

	}
	/*
	 * When gears merge and work together, one teeth from each one goes in order.
	 * Write a method mergeStrings hat will return the strings merged, one letter at
	 * a time, starting with one. Please note one and two can be of different
	 * lengths. Please look at below examples:
			s1 ==> "12345"
			s2 ==> "abcde"
			mergeStrings(s1,s2) ==> "1a2b3c4d5e"
			mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
			mergeStrings("java", "selenium") ==> "jsaevlaenium"
	 */

	public static String mergeStrings(String one, String two) {
		
		String merge = "";
		if (one.length() > two.length()) {
			for (int i = 0; i < two.length(); i++) {
				merge += ""+ one.charAt(i) + "" +two.charAt(i);
			} merge += one.substring(two.length());
		}else if (one.length() < two.length()) {
				for (int i = 0; i < one.length(); i++) {
					merge += ""+ one.charAt(i) + ""+ two.charAt(i);
			}merge += two.substring(one.length());
		}else if (one.length() == two.length()) {
			for (int i = 0; i < one.length(); i++) {
				merge += ""+ one.charAt(i) + ""+ two.charAt(i);
		}
		
		
		}return merge;
	
		
		
	}

}
