package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the file's absolute path: ");
		String path = sc.next();
		
		System.out.print("Enter salary: ");
		double expectedSalary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				double salary = Double.parseDouble(fields[2]);
				
				list.add(new Employee(name, email, salary));
			
				line = br.readLine();
			}
			
			System.out.println("Emails of people whose salary is greater than "
					+ String.format("%.2f", expectedSalary) + ":");
						
			List<String> emails = list.stream()
					.filter(employee -> employee.getSalary() > expectedSalary)
					.map(employee -> employee.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(employee -> employee.getName().charAt(0) == 'M')
					.map(employee -> employee.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Total salary sum of people whose names start with 'M': "
					+ String.format("%.2f", sum));
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}