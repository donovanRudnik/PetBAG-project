package dog;

public class Dog {

	//Initialized field variables
	String petType = "Dog";
	String petName;
	int petAge;
	int daysStay;
	int dogSpaceNumber;
	double dogWeight;
	boolean grooming;
	
	//Default constructor for a Dog object
	public Dog() {
		petType = "Dog";
		petName = "NoName";
		petAge = 0;
		daysStay = 0;
		dogSpaceNumber = 0;
		dogWeight = 0.0;
		grooming = false;
	}
	
	//Overloaded constructor
	public Dog(String petType, String petName, int petAge, int daysStay, int dogSpaceNumber, double dogWeight, boolean grooming) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.daysStay = daysStay;
		this.dogSpaceNumber = dogSpaceNumber;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
	}
	
	//Method for creating a new dog object
	public static void main(String[] args) {
		
		//Setter and getter for petType
		

	}

}
