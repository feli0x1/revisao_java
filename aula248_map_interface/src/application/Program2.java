package application;

import java.util.HashMap;
import java.util.Map;

import model.entities.Product;

public class Program2 {
	public static void main(String[] args) {
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 150.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product p4 = new Product("Tv", 900.0);
		
		System.out.println("Contains 'p4' key: " + stock.containsKey(p4));
	}
}