package homework_repl_it_230_239;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels_231 {
	public static void main(String[] args) {
		String str = "apple";
		//reverseVowels(str);
	}
	/*
	 * Reverse a vowels of string without affecting any other characters.
Write a method reverseVowels() that will return a string with reversed vowels.
		Input:   str = "applei"
		Output:  str = "eppla"
		
		Input:   str = "Ab,c,de!$"
		Output:  str = "eb,c,dA!$"
		
		Input:   str = "remedy" 
		Output:  str = "rymede"
		
		Input : hello world
		Output : hollo werld 
		*/
	
	
	public String  reverseVowels(String str) {
		
		char [] strc = str.toCharArray();
		ArrayList<String> strArr = new ArrayList<String>();
		List<String> vowels = Arrays.asList("a","e","o","i","u");
		
		for (int i = 0; i < str.length(); i++) {
			strArr.add(""+str.charAt(i));
		}
		//System.out.println(strArr);
		
		ArrayList<String> strVowelRev = new ArrayList<String>();
		String temp = "";
		
// 		for (int i = 0; i < strArr.size(); i++) {
//			for (int j = strArr.size()-1; j >= 0; j--) {
//
//				if (strArr.get(i).contains("a") || strArr.get(i).contains("e") || strArr.get(i).contains("i") || strArr.get(i).contains("o") || strArr.get(i).contains("u")){
//					if(strArr.get(j).contains("a") || strArr.get(j).contains("e") || strArr.get(j).contains("i") || strArr.get(j).contains("o") || strArr.get(j).contains("u")) {
//						temp = strArr.get(i);
//						strVowelRev.set(i, strArr.get(j));
//						strVowelRev.set(j, temp);
//						
//					}else {
//						strVowelRev.set(i, strArr.get(i));
//					}
//				}
//						
//				
//			}
//		}
		
		for (int i = strArr.size()-1; i >=0 ; i--) {
			if (vowels.contains(strArr.get(i))) {
				
					strVowelRev.add(strArr.get(i));
			}
		}
		
 		//System.out.println(strVowelRev.toString());
 		
 		for (int i = 0; i < strArr.size(); i++) {
			if (!vowels.contains(strArr.get(i))) {
				strVowelRev.add(i, strArr.get(i));
			}
		}
 	//	System.out.println(strVowelRev);
 		
 		String result = "";
 		for(String s : strVowelRev) {
 			result += s;
 			
 		}
 		//System.out.println(result);
 		return result;
	  }

}
