package homework_repl_it_90_99;

import java.util.Scanner;

public class ParseJSONfile_098 {
	public static void main(String[] args) {
		
//		In this task, we gonna talk about JSON files. 
//		JavaScript Object Notation (JSON) -  is a language-independent data format. 
//		Write a program that will parse JSON file, 
//		and print out into the console first name and last name as displayed in the example below. 
//		In this task, JSON file will be provided as a String variable. 
//		
//		Example:
//		input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
//		output:
//		First name: James
//		Last name: May
		
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		
		int indexOfFirstName = json.indexOf("firstName\": \"");
//		System.out.println(indexOfFirstName);
		int indexOfFirstName2 = json.indexOf("\"", indexOfFirstName+13);
//		System.out.println(indexOfFirstName2);
		
		int indexOfLastName = json.indexOf("lastName\": \"");
//		System.out.println(indexOfLastName);
		int indexOfLastName2 = json.indexOf("\"", indexOfLastName+13);
//		System.out.println(indexOfLastName2);
		
		System.out.println("First name: " + json.substring(indexOfFirstName + 13, indexOfFirstName2));
		System.out.println("Last name: " + json.substring(indexOfLastName + 12, indexOfLastName2));
		
		
		
		
		
	}

}
