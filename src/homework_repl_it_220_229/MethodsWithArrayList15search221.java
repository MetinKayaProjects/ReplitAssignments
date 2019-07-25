package homework_repl_it_220_229;
import java.util.*;
public class MethodsWithArrayList15search221 {
	 public static String search(ArrayList<String> r, String find) {
	    
		 for (String l : r) {
			 if (l.contains(find)) {
				return l;

			}

		}return "search failed";
	   
//		 for (int i = 0; i < r.size(); i++) {
//			if (r.get(i).contains(find)) {
//				return r.get(i);
//			}
//		}return "search failed";
	   
	  }//end wineSeller
	  
	  public static void main(String[] args) {
	    
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("foo bar");
	    arr.add("abc");
	    
	  
	    String find_tst = search(arr,"foo");
	    System.out.print(find_tst);//foo bar
	   
	    
	  }//end main
	}