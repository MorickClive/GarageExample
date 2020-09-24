package main.basics.utility;

import java.util.ArrayList;

import main.oop.entities.humans.Person;

public class Iteration {
	
	private static String menu;

	public static void init() {
		menu =	"Iteration Module:\n" +
				"====================\n" +
				"Options:\n" +
				"\t"+"1). Task1\n" +
				"\t"+"0). Exit\n"+
				"====================";
		
		System.out.println(menu);
		flowcharts();
	}

	public static void flowcharts() {
		
		// While Loop:
		int A = 1;
		
		while(A < 2) {
			System.out.println("A");
			A++; // could be ++
			if(A == 2) {System.out.println("END");}
		}
		
		// 2)
		A = 1;
		while(A < 2) {
			if(A%2 == 0) { System.out.println("-"); }
			else { System.out.println("*"); }
			
			A++; // could be ++
			if(A == 2) {System.out.println("END");}
		}
		
		// 3)
		numberLoop(10, 10);
		
		// 4)
		// Can do if needed
		
		// 5)
				
	}
	
	public static void numberLoop(int x, int times) {		
		for(int a = 0; a < times; a++) {
			for(int b = 0; b < 10; b++) {
				System.out.println("Iteration "+(a+1)+":\n"+(b+1));
			}
		}
	}
	
	public static void coins(double amount, double cost) {
		double result = amount - cost;
		
		

		System.out.println((int)result / 10 * 10);
		result -= (int)result / 10 * 10;
		
		System.out.println((int)result / 1);
		result -= (int)result / 1;
		
		System.out.println(result);
						
	}
	// enhanced for-loop

	public static void timesTen() {
		int[] arrayInts = new int[4];

		for(int i = 0; i < arrayInts.length; i++) {
			arrayInts[i] = i + 2;
		}
		
		for(int item : arrayInts) {
			System.out.println("Item: " + (item*10));
		}
	}
	
	public static void enhancedFor() {
		String[] args = {"Hello", "World"};
		
		for(String item : args) {
			System.out.print(item + "\s");
		}
		System.out.println();
	}
	
	public static void list20() {
		int[] args = new int[20];
		
		for(int x = 0; x < 20; x++) {
			args[x] = x+1;
		}
		
		int limit = 5;
		int i = 1;
		
		for(int item : args) {
			System.out.print(item + ",\s");
			if(i % limit == 0) {System.out.println();}
			i++;
		}
		
	}
	
	public static boolean isEven(int val) {
		return (val % 2 == 0 && val != 0);
	}
	
}
