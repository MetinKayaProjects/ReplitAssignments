package homework_repl_it_220_229__225;

//Write a class Dog that extends the Animal class. 
public class Dog extends Animal {

	// Define 2 instance variables for this class:
//	breed (String) and humanYears (int).
	private String breed;
	private int humanYears;


	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getHumanYears() {
		return humanYears;
	}

	public void setHumanYears(int humanYears) {
		this.humanYears = humanYears;
	}

	//Add a constructor that accepts three String parameters. 
//	The value of the first is used to initialize 
//	the value of name, the value of the second is used 
//	to initialize age and the value of the third is used to initialize breed.

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Name: " + super.getName() +"\n" +
				"Breed : "+ breed +"\n" +
				"Age in calendar years: " + super.getAge() +"\n" +
				"Age in human years: " + getAgeInHumanYears();
	}
		
	/*	Also, implement getAgeInHumanYears method, 
	 * 	so It will convert dogs age into humans age as follows:
		if dogs age is less or equals to 2, multiple age by 11;
		otherwise, human years is equals to: 22 + ((age-2) * 5);
	 */


	@Override
	public int getAgeInHumanYears() {
		if (getAge() <= 2) {
			return getAge() * 11;
	}
	//	humanYears = 22+(getAge()-2)*5;
		return 22+(getAge()-2)*5;
	}
//	Define an equals method for the Dog class that 
//	returns true if the dog’s name, age, and breed match 
//	the same variables for the other object that is being compared. 
	
//	public boolean equals(String name, int age, String breed) {
//		if (this.getName().equalsIgnoreCase(name) && this.getAge() == age && this.getBreed().equalsIgnoreCase(breed)) {
//			return true;
//		}
//		return false;
//	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Dog) {
			Dog dog= (Dog) obj;
			boolean result= this.getName()==dog.getName() && this.getAge()==dog.getAge()&& this.getBreed()==dog.getBreed();
			return result;
		
		}
		
		return false;
	}
	
}
