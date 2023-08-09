package model.entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public String toString() {
		return String.format("%s,%.2f,%d", name, price, quantity);
	}
}