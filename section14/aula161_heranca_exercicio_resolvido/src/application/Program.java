package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = sc.nextInt();
		sc.nextLine();
		
		List<Employee> employees = new ArrayList<Employee>();
		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.printf("Employee #%d data:\n", i + 1);
			System.out.print("Outsourced (y/n)? ");
			char character = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (character == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("\nPAYMENTS:");
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		sc.close();
	}
}