package main.oop.principles;

import java.util.ArrayList;

import main.oop.entities.humans.Person;

public class Constructors {
	public static void init() {
		String div = "==============================";
		
		System.out.println(div);
		System.out.println("Running Constructor Task");
		System.out.println(div);
		
		// TASKS
		search();
	}
	
	public static void search() {
		ArrayList<Person> peopleList = new ArrayList<>();

		peopleList.add(new Person("John", 38));
		peopleList.add(new Person("Sue", 57));
		peopleList.add(new Person("Lucas", 35));
		peopleList.add(new Person("Jessica", 46));
		peopleList.add(new Person("Daniel", 32));
		
		String searchTerm = "sue";
		Person result = searchPerson(peopleList, searchTerm);
		
		if(result != null) {
			System.out.println("Found: "+ result.toString());
		} else { System.out.println("No one found in the list."); }
		
	}
	
	public static Person searchPerson(ArrayList<Person> people, String searchTerm) {
		for (Person obj : people) {
			if (searchTerm.toLowerCase().equals(obj.getName().toLowerCase())) {
				return obj;
			}
		}
		return null;
	}
	
}
