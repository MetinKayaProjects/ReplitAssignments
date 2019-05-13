package homework_repl_it_170_179;

public class MethodsWithString9RemoveFirstChar_174 {
	public static void main(String[] args) {
		
		System.out.println(removeFirst("aaa"));
		
	}
	/*
	 * The method gets a string and returns a string minus the first string.

for example:

removeFirst("aaa")
returns "aa"
	 */
	 public static String removeFirst(String target) {
		    
		    return target.substring(1,target.length());
		    
		  }
	

}
