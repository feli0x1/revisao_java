package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.util.ProductPredicate;

public class Program2 {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
		
		list.removeIf(new ProductPredicate());
		for (Product p : list) {
			System.out.println(p);
		}
	}
}