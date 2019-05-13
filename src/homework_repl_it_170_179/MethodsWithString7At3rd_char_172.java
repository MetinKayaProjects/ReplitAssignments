package homework_repl_it_170_179;

public class MethodsWithString7At3rd_char_172 {
	public static void main(String[] args) {
		
	System.out.println(at3("longword","foo"));	
		
	}
	/*
	 * at3 gets two strings and returns a string.
	the first string is the one that will be manipulated. 
	at the 3rd char position of target you will insert the word argument.

example use:
at3("longword","foo")
will return: "lonfoogword"

at3("blabla","a")
will return: "blaabla"
	 */
	public static String at3(String target,String word){
		 return target.substring(0, 3) + word + target.substring(3);
		 
	    
	  }
	

}
