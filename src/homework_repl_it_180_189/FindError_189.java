package homework_repl_it_180_189;

public class FindError_189 {
	public static void main(String[] args) {
		
		System.out.println(isError("foo bar"));
		//returns : false

		System.out.println(isError("error foo bar"));
	//	returns : true

		System.out.println(isError("error one two"));
		//returns : true

		System.out.println(isError("three four error"));
		//returns : false
		
	}
	 public static boolean isError(String line) 
	  {
	    //return (line.startsWith("error");
	    return (line.substring(0,5).equals("error"));
	  }
	

}
