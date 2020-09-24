package main.oop.principles;

import java.util.ArrayList;

import main.oop.entities.animals.Cat;
import main.oop.entities.animals.DomesticCat;
import main.oop.entities.animals.Lion;

public class Polymorphism {
	
	public static void init() {
		System.out.println("Polymorphism");
		System.out.println("====================");
		main();
		System.out.println("====================\n");
	}
	
	public static void main() {
		Cat houseCat = new DomesticCat();
		Cat wildLion = new Lion();

		ArrayList<Cat> catZoo = new ArrayList<>();

		catZoo.add(houseCat);
		catZoo.add(wildLion);
		catZoo.add(wildLion);
		catZoo.add(houseCat);
		catZoo.add(wildLion);
		catZoo.add(wildLion);
		
		// Cat.speak()
		// ^
		//	\-------------|
		// DomesticCat.speak->(Meow), Lion.speak->(Roar)
		
		for (Cat obj : catZoo) {
			// Is our Cat a Lion?
			if (obj instanceof Lion) {
				obj.speak();
				
				Lion target = (Lion) obj;
				target.sleep();
			}else {
				obj.speak();
			}
		}
		
		System.out.println("Code ends:");
	}

}
