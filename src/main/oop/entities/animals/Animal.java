package main.oop.entities.animals;

public class Animal {

	String species;
	String gender;
	int age;
	int numLegs;

	public Animal() {
		this("Generic Animal", 1, "???", 4);
	}

	public Animal(String species, int age, String gender, int numOfLegs) {
		this.species = species;
		this.age = age;
		this.gender = gender;
		this.numLegs = numOfLegs;
	}

	// Methods
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

}
