package main.oop.entities.animals;

public class Cat {
	
	protected String name;
	protected int age;
	protected int numberOfLives;
	
	public Cat() {
		super(); // <- Object.class Constructor
	}
	
	public Cat(String name, int age, int numberOfLives) {
		super();
		this.name = name;
		this.age = age;
		this.numberOfLives = numberOfLives;
	}

	// Methods
	public void speak() {
		System.out.println("Meow");
	}
		
	// setters and getters
	
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

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}

}
