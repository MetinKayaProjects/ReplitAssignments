package homework_repl_it_170_179;

public class MethodsWithString8Bigger_173 {
	public static void main(String[] args) {
		//biggerS("orange", "red");
		System.out.println(biggerS("orange", "red"));
		
	}
	
	/*
	 * the method gets two strings and return the longest one

		biggerS("apple","orange") ==> "orange"
	 */
	
	
	
	public static String biggerS(String a ,String b){
		  //String longest;
		   if(a.length() > b.length()){
		     //longest = a;
		    // return longest;
		    return a;
		   }else{
		   //  longest = b;
		    // return longest;
		    return b;
		   }
		   
		  }
	

}
