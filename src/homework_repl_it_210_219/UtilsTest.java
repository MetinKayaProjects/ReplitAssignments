package homework_repl_it_210_219;

public class UtilsTest {
	public static void main(String[] args) {
		String result = Utils_212.reverseLetters("..zxcv..d");
	    System.out.println(result.equals("..dvcx..z")); //true
	    
	    String result2 = Utils_212.reverseLetters("---abmkl.o-");
	    System.out.println(result2.equals("---olkmb.a-")); //true
	    
	    String result3 = Utils_212.reverseLetters("---abmkl.o-");
	    System.out.println(result3.equals("-o.lkmba---")); //false
	}

}
