package homework_repl_it_230_239;

import java.util.ArrayList;

public class BlogPostDb_230 {
	public String blogDb(ArrayList<String[]> r,String id)  {
	    
		for (int i = 0; i < r.size(); i++) {
			
			if (r.get(i)[0] == id) {
				
				return r.get(i)[1] + "\n"+  r.get(i)[2];
			}
			
		}
		return id;
	    
		   
	  }
	  
	  public static void main(String[] args) {
		BlogPostDb_230 m = new BlogPostDb_230();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});

	    String post = m.blogDb(arr,"3");
	    System.out.print(post);
	    //should output:
	    //title 3 
	    //content3
	   
	    
	  }//end main
	}