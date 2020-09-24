package main.oop.entities.animals;

public class Duck extends Bird {
	
	public String name;
	
	// Empty/Generic Duck
	public Duck() {
		super();
		this.name = "???";
		System.out.println("I'm a Duck!");
	}
	
	// Overloaded Constructor
	public Duck(String name) {
		super();
		this.name = name;
		System.out.println("I'm a not Duck!");
		System.out.println("Quack!");
	}

	public Duck(String wingClr, String species, String gender, int age, String name) {
		super(wingClr, species, gender, age, false);
		this.name = name;
	}
}
