package main.oop;

import java.util.Scanner;

import main.basics.utility.Iteration;
import main.oop.principles.Constructors;
import main.oop.principles.Encapsulation;
import main.oop.principles.Inheritance;
import main.oop.principles.Polymorphism;

public class ObjectOrientedProgramming {
	
	private static Scanner input;
	private static String title, menu;
	private static int choice = 0;
	
	public static void menu() {
		System.out.println(menu);
		
		do {
			System.out.println("\n"+title+"\n====================\nPlease enter input:");
			choice = Integer.parseInt(input.nextLine());
			
			switch(choice) {
				// Controls
				// ====================
				case 0:
					System.out.println("Exiting System..");
					break;
					
				// Options
				// ====================
				case 1:
					Constructors.init();
					break;
				case 2:
					Encapsulation.init();
					break;
				case 3:
					Inheritance.init();
					break;
				case 4:
					Polymorphism.init();
					break;
				case 5:
					pending("Abstraction");
					break;
					
				default :
					choice = 0;
					System.out.println("Exiting System..");
					break;
			}
		} while(choice != 0);
		
	}
	
	public static void init() {
		input = new Scanner(System.in);
		title = "Object-Oriented Programming";
		menu =	title + "\n" +
				"====================\n" +
				"Options:\n" +
				"\t"+"1). Constructors\n" +
				"\t"+"2). Encapsulation\n" +
				"\t"+"3). Inheritance\n" +
				"\t"+"4). Polymorphism\n" +
				"\t"+"5). Abstraction\n" +
				"\t"+"0). Exit\n"+
				"====================";
		try {
			menu();
		}catch(Exception e) {}
		finally {
			System.out.println("Closing Scanner...");
			input.close();
		}
	}
	
	public static void pending(String msg) { System.out.println(msg + " - pending implementation."); }

}
