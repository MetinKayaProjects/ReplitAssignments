package homework_repl_it_200_209;

public class OOP5_PersonI_201 {
	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return firstName + " | " + lastName + " | " + age;
	}
	/*Constructor-1
	 * 1) No-Args constructor
 		-sets default values for the Person object
 		name and lastName => "undefined"
 		age => -1
	 */
	
	public OOP5_PersonI_201() {
		this.firstName = "undefined";
		this.lastName = "undefined";
		this.age = -1;
	}
	/*
	 *2) 3-Args  Constructor:
 		- accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
 			try to use this. keyword
	 */
	public OOP5_PersonI_201(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

}
