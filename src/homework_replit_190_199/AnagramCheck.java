package homework_replit_190_199;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class AnagramCheck {

	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "Silent"));
		System.out.println(isAnagram("hi", "hello"));
	}

public static boolean isAnagram(String word1, String word2){       
	
	 if (word1.length() != word2.length()) {
			return false;	
		}
	
	String str1 = word1.replace(" ", "").toLowerCase().trim();
    String str2 = word2.replace(" ", "").toLowerCase().trim();
    
    
    
    
    
    char[] chars1 = str1.toCharArray();
    char[] chars2 = str2.toCharArray();
    
//    Arrays.sort(chars1);
//    Arrays.sort(chars2);
//    System.out.println(Arrays.toString(chars1));
//    System.out.println(Arrays.toString(chars2));
//   return (chars1==(chars2))?true : false;
    int sumstr1 = 0;
    int sumstr2 = 0;
    for(int c1 : chars1) {
    	sumstr1 += c1;
    }
    for(int c2 : chars2) {
    	sumstr2 += c2;
    }

   

    return (sumstr1 == sumstr2)?true:false;
}
}