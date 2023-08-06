package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {
	public static void main(String[] args) {
		Order order = new Order(1, new Date(), OrderStatus.PROCESSING);
		OrderStatus os1 = OrderStatus.SHIPPED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(order);
		System.out.println(os1);
		System.out.println(os2);
	}
}