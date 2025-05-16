package dog;

import java.util.Scanner;

public class Dog {

	//Initialized field variables. petType, petName, petAge, and daysStay to be moved to Pet class later
	String petType;
	String petName;
	int petAge;
	int daysStay;
	int dogSpaceNumber;
	double dogWeight;
	boolean grooming;
	double amountDue;
	
	//Default constructor for a Dog object
	public Dog() {
		petType = "Dog";
		petName = "NoName";
		petAge = 0;
		daysStay = 0;
		dogSpaceNumber = 0;
		dogWeight = 0.0;
		grooming = false;
		amountDue = 0.0;
	}
	
	//Overloaded constructor
	public Dog(String petType, String petName, int petAge, int daysStay, int dogSpaceNumber, double dogWeight, boolean grooming, double amountDue) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
		this.daysStay = daysStay;
		this.dogSpaceNumber = dogSpaceNumber;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
		this.amountDue = amountDue;
	}
	
	//Mutator for petType. TODO: move to Pet class in future assignment
	public void setPetType(String inputPetType) {
		this.petType = inputPetType;
	}
	
	//Accessor for petType TODO: move to Pet class in future assignment
	public String getPetType() {
		return this.petType;
	}
	
	//Mutator for petName TODO: move to Pet class in future assignment
	public void setPetName(String inputPetName) {
		this.petName = inputPetName;
	}
	
	//Accessor for petName TODO: move to Pet class in future assignment
	public String getPetName() {
		return this.petName;
	}
		
	//Mutator for petAge TODO: move to Pet class in future assignment
	public void setPetAge(int inputPetAge) {
		this.petAge = inputPetAge;
	}
	
	//Accessor for petAge TODO: move to Pet class in future assignment
	public int getPetAge() {
		return this.petAge;
	}
	
	//Mutator for daysStay TODO: move to Pet class in future assignment
	public void setDaysStay(int inputDaysStay) {
		this.daysStay = inputDaysStay;
	}
	
	//Accessor for daysStay TODO: move to Pet class in future assignment
	public int getDaysStay() {
		return this.daysStay;
	}
	
	//Mutator for dogSpaceNumber
	public void setDogSpaceNumber(int inputSpaceNumber) {
		this.dogSpaceNumber = inputSpaceNumber;
	}
	
	//Accessor for dogSpaceNumber
	public int getDogSpaceNumber() {
		return this.dogSpaceNumber;
	}
	
	//Mutator for dogWeight
	public void setDogWeight(double inputDogWeight) {
		this.dogWeight = inputDogWeight;
	}
	
	//Accessor for dogWeight
	public double getDogWeight() {
		return this.dogWeight;
	}
	
	//Mutator for grooming
	public void setGrooming(boolean inputGrooming) {
		this.grooming = inputGrooming;
	}
	
	//Accessor for grooming
	public boolean getGrooming() {
		return this.grooming;
	}
	
	//Mutator for amountDue TODO: move to Pet class with proper amounts later
	public void setAmountDue(double insertAmountDue) {
		this.amountDue = insertAmountDue;
	}
	
	//Accessor for amountDue TODO: move to Pet class later
	public double getAmountDue() {
		return this.amountDue;
	}
	
	//Method for creating a new dog object for testing purposes TODO: Take this out before submitting.
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Dog dog1 = new Dog();
		
		String userPetType;
		String userPetName;
		int userPetAge;
		int userDaysStay;
		int userSpaceNum;
		double userWeight;
		boolean userGrooming;
		double userAmountDue;
		
		System.out.println("Enter pet type:");
		userPetType = scnr.nextLine();
		dog1.setPetType(userPetType);
		
		System.out.println("Name:");
		userPetName = scnr.nextLine();
		dog1.setPetName(userPetName);
		
		System.out.println("Age:");
		userPetAge = scnr.nextInt();
		dog1.setPetAge(userPetAge);
		
		System.out.print("Name: ");
		System.out.print("Age: ");
		System.out.println("Type: ");
		System.out.println(dog1.getPetName());
		System.out.println(dog1.getPetAge());
		System.out.println(dog1.getPetType());
		
		scnr.close();

	}

}
