package homework_repl_it_170_179;

public class Reverse_179 {
	public static void main(String[] args) {
		System.out.println(reverse("apple"));
	}
	public static String reverse(String input){
//		reverse("foo") ==> "oof"
//		reverse("student") ==> "tnedust"

		String reverseInput = "";
		for (int i = input.length()-1; i >= 0; i--) {
			char[] strArr = input.toCharArray();
			reverseInput += strArr[i];
			
		}
		
		
		return reverseInput;
	}

}
