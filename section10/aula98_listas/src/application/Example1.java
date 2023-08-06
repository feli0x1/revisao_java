package application;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		
		// List<type> doesn't accept java's primitive data types
		List<Integer> randomNumbers;
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		
		// Adding number 2 to index 0
		evenNumbers.add(0, 2);
		// Adding number 1 to index 1
		evenNumbers.add(1, 4);
		evenNumbers.add(6);
		
		System.out.println("Odd numbers:");
		for (Integer number : oddNumbers) {
			System.out.println(number);
		}
		
		System.out.println("Even numbers:");
		for (Integer number : evenNumbers) {
			System.out.println(number);
		}
		
		System.out.println("Size of oddNumbers = " + oddNumbers.size());
		
		// Remove an item from the list based on the index
		oddNumbers.remove(2);
		
		System.out.println("Odd numbers:");
		for (Integer number : oddNumbers) {
			System.out.println(number);
		}
		
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Caleb");
		names.add("Denis");
		names.add("Noah");
		
		System.out.println("Names:");
		for (String name : names) {
			System.out.println(name);
		}
		
		names.remove("Denis");
		names.remove(0);
		
		System.out.println("Updated names:");
		for (String name : names) {
			System.out.println(name);
		}
	}
}