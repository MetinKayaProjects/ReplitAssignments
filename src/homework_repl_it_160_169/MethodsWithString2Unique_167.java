package homework_repl_it_160_169;

public class MethodsWithString2Unique_167 {
	public static void main(String[] args) {

		// test your code
		System.out.println(uniqueChars("mama"));
		System.out.println(uniqueChars("wooden-spoon"));
	}

	/*
	 * uniqueChars is a method that you will code now, should be able to accept any
	 * string in the world and return unique characters from the parameter.
	 * 
	 * Examples:
		uniqueChars("java") ==> "jav"
		uniqueChars("java") ==> "jav"
		uniqueChars("mama") ==> "ma"
		uniqueChars("spoon") ==> "spon"
	 */
	public static String uniqueChars(String str) {
		// TODO: write your below

		String unique = "";
		 for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			String letterString = Character.toString(letter); //char is converted to String
			if(!unique.contains(letterString)){ //
			unique +=letterString;
			}
		
		}return unique;
		
		//2nd way
//		String unique = "";
//		 for(int i = 0; i < str.length(); i++) {
//			char letter = str.charAt(i);
//			//String letterString = Character.toString(letter); //char is converted to String
//			if(!unique.contains("" +letter)){ //
//			unique +=letter;
//			}
//		
//		}return unique;

	}

}
