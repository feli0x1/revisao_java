package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exemplo2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] products = new Product[n];
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			sum += price;
			products[i] = new Product(name, price);
		}
		
		double averagePrice = sum / products.length;
		
		System.out.printf("AVERAGE PRICE = %.2f", averagePrice);
		
		sc.close();
	}
}