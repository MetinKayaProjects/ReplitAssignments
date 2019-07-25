package homework_repl_it_220_229__225;

//Write an abstract class Animal that contains 2 instance variables: name and age. 
public abstract class Animal {
	private String name;
	private int age;
	
	
//	Define 2 args constructor that initializes instance variables.
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	Add an abstract method getAgeInHumanYears() that returns int.
	public abstract int getAgeInHumanYears();
	
//	Provide getters and setters for these variables. 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
