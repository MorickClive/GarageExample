package main.oop.entities.animals;

public class Bird {

	// Attributes
	private String wingColour;
	private String speciesName;
	private String gender;
	private int age;
	private boolean hasWings;
	private boolean hasBeak;

	// Constructors
	public Bird() {
		//this("black", "???", "???", 1, true);
		
		//same as:
		super();
		this.wingColour = "black";
		this.speciesName = "???";
		this.gender = "???";
		this.age = 1;
		this.hasBeak = true;
	}

	public Bird(String wingColour, String species, String gender, int age, boolean hasBeak) {
		super();
		this.wingColour = wingColour;
		this.speciesName = species;
		this.gender = gender;
		this.age = age;
		
		this.hasWings = true;
		this.hasBeak = true;
	}
	
	//Method
	public void fly() {
		System.out.println("The \""+ this.speciesName + "\" is now flying.");
	}
	public void sing() {
		System.out.println("The \""+ this.speciesName + "\" is now twerping a bird song.");
	}
	
	public void seekPartner() {
		System.out.println("the bird is searching for a mate.");
	}
	
	//setter and getters
	public String getWingColour() {
		return wingColour;
	}

	public void setWingColour(String wingColour) {
		this.wingColour = wingColour;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
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

	public boolean isHasWings() {
		return hasWings;
	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	public boolean isHasBeak() {
		return hasBeak;
	}

	public void setHasBeak(boolean hasBeak) {
		this.hasBeak = hasBeak;
	}	
}
