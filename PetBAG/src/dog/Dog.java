/*
	Dog.java
Dog class for the PetBAG project. The purpose of this class is to have
the ability to instantiate a new dog object and update values related to
a specific dog. This records the type, name, age, length of stay,
space number, weight, grooming option, and total amount due of a specific dog.

Author: Donovan Rudnik
Creation Date: 5/16/2025
Edit date: 5/18/2025 by Donovan Rudnik
	I removed the attributes, setters, and getters that belong to the Pet class
	and changed the constructors accordingly.
*/
package dog;

public class Dog {

	//Initialized field variables.
	private int dogSpaceNumber;
	private double dogWeight;
	private boolean grooming;
	
	//Default constructor for a Dog object.
	//TODO: Change when adding Pet Class inheritance.
	public Dog() {
		dogSpaceNumber = 0;
		dogWeight = 0.0;
		grooming = false;
	}
	
	//Overloaded constructor for Dog object. Able to pass each attribute as an argument.
	//TODO: Change when adding Pet class inheritance
	public Dog(int dogSpaceNumber, double dogWeight, boolean grooming) {
		this.dogSpaceNumber = dogSpaceNumber;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
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
}
