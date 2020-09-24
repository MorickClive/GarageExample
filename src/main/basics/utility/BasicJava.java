package main.basics.utility;

import java.util.Scanner;

public class BasicJava {

	private static Scanner input;
	private static String menu;
	private static int choice = 0;

	public static void init() {
		input = new Scanner(System.in);
		menu =	"App Menu\n" +
				"====================\n" +
				"Options:\n" +
				"\t"+"1). Iteration\n" +
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
	
	public static void menu() {
		System.out.println(menu);
		
		do {
			System.out.println("\nPlease enter input:");
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
					Iteration.init();
					break;
					
				default :
					System.out.println("Something went wrong.\nExiting..");
					choice = 0;
					break;
			}
		} while(choice != 0);
		
	}

}
