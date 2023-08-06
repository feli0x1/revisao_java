package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client's data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());
		Date moment = new Date();
		
		Order order = new Order(moment, status, client);
		
		System.out.print("How many items will this have? ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quantity; i++) {
			System.out.printf("Enter #%d item data:\n", i + 1);
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			sc.nextLine();
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.print(order);
		System.out.println("Order items:");

		for (OrderItem orderItem : order.getOrderItems()) {
			System.out.println(orderItem);
		}
		
		System.out.printf("Total price: $%.2f", order.total());
		sc.close();
	}
}