package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int numberOfEmployees = sc.nextInt();
		sc.nextLine();

		List<Employee> employees = new ArrayList<>();
		System.out.println();

		for (int i = 0; i < numberOfEmployees; i++) {
			System.out.printf("Employee #%d:\n", i + 1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}

		System.out.print("Enter the employee's id that will have the salary increase: ");
		int employeeId = sc.nextInt();
		
		// Predicate
		Employee employee = 
				employees
				.stream().filter(e -> e.getId() == employeeId)
				.findFirst().orElse(null);
		
		if (employee != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}
		else {
			System.out.println("The id doesn't exist!");
		}

		System.out.println("\nList of employees:");
		for (Employee e : employees) {
			System.out.println(e);
		}

		sc.close();
	}
}