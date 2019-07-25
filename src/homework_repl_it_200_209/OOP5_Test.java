package homework_repl_it_200_209;

import java.util.*;

public class OOP5_Test {
	public static void main(String[] args) {
		OOP5_PersonI_201 person = new OOP5_PersonI_201();
		System.out.println(person.getFirstName());//undifined. since it is not assigned
		System.out.println(person.getLastName());//undifined
		System.out.println(person.getAge());//-1
		System.out.println(person.toString());//undefined | undefined | -1
		
		System.out.println();
		
		person.setFirstName("John");
		System.out.println(person.getFirstName());//John
		person.setLastName("Doe");
		System.out.println(person.getLastName());//Doe
		person.setAge(44);
		System.out.println(person.getAge());//44
		System.out.println(person.toString());////Doe

		System.out.println();

		/*
		 * System.out.println(person.getFirstName()); //"undefined"
		 * System.out.println(person.getLastName()); //"undefined"
		 * System.out.println(person.getAge()); // -1
		 * System.out.println(person.toString()); //"undefined | undefined | -1"
		 * 
		 * person.setFirstName("John"); person.setLastName("Doe"); person.setAge(44);
		 * 
		 * System.out.println(person.toString() ); // "John | Doe | 44"
		 */

		OOP5_PersonI_201 person2 = new OOP5_PersonI_201("Fatima", "Lee", 22);

		System.out.println(person2.getFirstName()); // "Fatima"
		System.out.println(person2.getLastName()); // "Lee"
		System.out.println(person2.getAge()); // 22
		System.out.println(person2.toString()); // "Fatima | Lee | 22"
	}

}
