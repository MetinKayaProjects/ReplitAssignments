package homework_repl_it_230_239;

public class CountLetters_232 {
	public static void main(String[] args) {
		System.out.println(countLetters("aaabbcccc"));
		
	}
//	Write a method countLetters that can count letters in a given string and return a new string in the given format:
//		number of letters + letter
//
//		For example:
//		input: countLetters("aaabbcccc");
//		output: "3a2b4c" 
//		Because, there are 3 a's, 2 b's and 4 c's
	public static String countLetters(String str){
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					if (str.charAt(i) == '#') {
						count = 0;
					}
				}
			}
			if (count > 0) {
				result += count + "" + str.charAt(i);
				str = str.replaceAll("" + str.charAt(i), "#");
			}
		}
		return result;
		
//		String result = "";
//		for (int i = 0; i < str.length(); i++) {
//			int count = 0;
//			for (char ch = 'a'; ch <= 'z'; ch++) {
//				if (ch == str.charAt(i)) {
//					count++;
//				}
//			}
//			if (count > 0) {
//				result += count + "" + str.charAt(i);
//			}
//		}
//		return result;
	  }
	

}
