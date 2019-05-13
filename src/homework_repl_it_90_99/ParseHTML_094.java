package homework_repl_it_90_99;

import java.util.Scanner;

public class ParseHTML_094 {
	public static void main(String[] args) {
		
//		Hypertext Markup Language (HTML) is the standard markup language for creating web pages 
//		and web applications. HTML is the language in which most websites are written. 
//		HTML is used to create pages and make them functional.
		
//		Write a program, that will read html variable and output attribute value of id attribute (tag) into the console. 
//		Input will be provided in a single line as outlined below. 
//		If html variable doesn't contain <html> attribute, print out into the console message: "Invalid input!". 
//
//		Example: 
//		input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
//		output: myid
//		
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();
		
		if(!html.contains("<html>")) {
			System.out.println("Invalid input!");
			return;
		}
		
			int indexOfId = html.indexOf("id=");
			int indexOfOk = html.indexOf("\">", indexOfId+1);
//			System.out.println(indexOfId);
//			System.out.println(indexOfOk);
			System.out.println(html.substring(indexOfId+4, indexOfOk));
		

	}  

}
