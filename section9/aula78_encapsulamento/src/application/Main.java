package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: "); 
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
				
		Product p = new Product(name, price);
		p.setName("Desktop");
		System.out.println("Updated name: " + p.getName());
		p.setPrice(50.0);
		System.out.println("Updated price: " + p.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + p);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		p.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + p);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		p.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + p);
		sc.close();
	}
}