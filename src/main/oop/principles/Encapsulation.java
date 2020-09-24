package main.oop.principles;

import main.oop.entities.animals.Bird;

public class Encapsulation {
	
	public static void init() {
		Bird bird = new Bird();
		bird.setSpeciesName("BlueBird");
		
		bird.fly();
		bird.sing();
	}

}
