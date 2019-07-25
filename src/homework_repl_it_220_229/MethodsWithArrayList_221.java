package homework_repl_it_220_229;
import java.util.*;
public class MethodsWithArrayList_221 {
	/*search(["one apple","two orange","four banana"],"four")
	returns: "four banana"
	("four banana" contains "four" so method returns "four banana")

	search(["hello","world"],"goodbye")
	returns:"search failed"
	(no "goodbye" in any element)
	 * 
	 */
	 public static String search(ArrayList<String> r, String find){
	     for (String l : r) {
				 if (l.contains(find)) {
					return l;

				}

			}return "search failed";
	    
	   
	   
	  }//end wineSeller
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("foo bar");
	    arr.add("abc");
	    
	  
	    String find_tst = search(arr,"foo");
	    System.out.print(find_tst);//foo bar
	   
	    
	  }//end main
	}