package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.entities.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 600.00));
		
		list.sort(new CustomComparator());
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Comparator<Product> comp = new Comparator<>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getPrice().compareTo(p2.getPrice());
			}
		};
		
		list.sort(comp);
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
		
		// Anonymous function | arrow function | lambda expression
		Comparator<Product> comp2 = (p1, p2) -> {
			return -p1.getPrice().compareTo(p2.getPrice());
		};
		
		list.sort(comp2);
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
		
		Comparator<Product> comp3 = (p1, p2) -> -p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		list.sort(comp3);
		for (Product p : list) {
			System.out.println(p);
		}
	}
}