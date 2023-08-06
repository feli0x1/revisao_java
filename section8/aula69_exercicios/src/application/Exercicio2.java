package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.print("Name: ");
		e.name = sc.nextLine();
		System.out.print("Gross salary: ");
		e.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f%n", e.name, e.netSalary());
		
		System.out.println();
		System.out.print("At which percentage should the salary increase? ");
		e.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f%n", e.name, e.netSalary());
		
		sc.close();
	}
}