package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import model.entities.Product;
import model.util.UpperCaseName;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		List<String> productNames = list.stream()
				.map(Product::staticUpperCaseName)
				.collect(Collectors.toList());
		
		productNames.forEach(System.out::println);
	}
}