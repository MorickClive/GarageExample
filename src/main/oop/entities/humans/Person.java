package main.oop.entities.humans;

import java.util.ArrayList;

public class Person {

	// Attributes
	// ========================================
	private String name;
	private int age;

	// Constructors
	// ========================================
	public Person() {
		this("...Missing name...", 0);
	}

	public Person(String name, int age) {
		this.name = name;
		this.setAge(age);
	}

	// Methods
	// ========================================
	public void speak(String message) {
		System.out.println(this.name + " says " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age > 0 && age <= 190) {
			this.age = age;
		} else {
			System.out.println("The age is not with a tolerable range!");
		}
	}
	
	public String toString() {
		return "[Name: "+this.name+", Age: "+ this.age + "]";
	}

}

/*
 * public static void searchPerson(ArrayList<Person> people, String searchTerm)
 * {
 * 
 * boolean flagFound = false; Person target;
 * 
 * if(false) { for (Person obj : people) { if (searchTerm.equals(obj.name)) {
 * flagFound = true; System.out.println("Found: " + obj.name + ", age: " +
 * obj.age); } } } else {
 * 
 * for(int i = 0; i < people.size(); i++) { if ( searchTerm.equals(
 * people.get(i).name ) ) { target = people.get(i); flagFound = true;
 * System.out.println("Found: " + target.name + ", age: " + target.age); } }
 * 
 * }
 * 
 * 
 * 
 * if(!flagFound) { System.out.println("Nobody by the name " + searchTerm +
 * " has been found."); }
 * 
 * }
 */