package main.oop.entities.animals;

// 'Is-a' relationship: a Lion 'Is-a' Cat
public class Lion extends Cat {

	public Lion() {
		super();
	}
	
	public Lion(String name, int age, int numberOfLives) {
		super(name, age, numberOfLives);
	}

	@Override
	public void speak() {
		System.out.println("Roar");
	}
	
	@Override
	public String toString() {
		return "Class: "+ this.getClass().getName();
	}
	
	public void sleep() {
		System.out.println("This Lion goes to sleep");
	}
}
