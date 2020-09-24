package main.oop.principles;

import main.oop.entities.animals.Duck;

public class Inheritance {

	public static void init() {
		System.out.println("Inheritance");
		System.out.println("====================");
		main();
		System.out.println("====================\n");
	}

	public static void main() {
		Duck duck1 = new Duck("Black", "American Black Duck", "Male", 8, "Daffy");
		
		duck1.fly();
	}

}
