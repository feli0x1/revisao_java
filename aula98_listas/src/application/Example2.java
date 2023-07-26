package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Caleb");
		names.add("Denis");
		names.add("Noah");
		
		System.out.println("Names:");
		System.out.println("======================");
		for (String name : names) {
			System.out.println(name);
		}
		
		// Predicate
		names.removeIf(c -> c.charAt(0) == 'N');
		
		System.out.println("======================");
		System.out.println("Updated names:");
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("======================");
		System.out.println("Index of Caleb: " + names.indexOf("Caleb"));
		System.out.println("Index of Anna: " + names.indexOf("Anna"));
		
		names.add("Julian");
		names.add("Joshua");
		names.add("Jonathan");
		System.out.println("======================");
		System.out.println("Updated names:");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		List<String> namesStartWithJ = 
				names
				.stream().filter(c -> c.charAt(0) == 'J')
				.collect(Collectors.toList());
		System.out.println("======================");
		System.out.println("Names that start with a J:");
		
		for (String name : namesStartWithJ) {
			System.out.println(name);
		}
		
		String person = 
				names.stream().
				filter(c -> c.charAt(1) == 'o').findFirst().orElse(null);
		System.out.println("======================");
		System.out.println("First name that contains an 'o': " + person);
	}
}
