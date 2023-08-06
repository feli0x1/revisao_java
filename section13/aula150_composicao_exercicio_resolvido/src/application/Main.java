package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the department's name: ");
		String departmentName = sc.next();
		sc.nextLine();
		
		System.out.println("Enter the worker's data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.nextLine().toUpperCase();
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		System.out.print("How many contracts this worker has? ");
		int numberOfContracts = sc.nextInt();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));

		for (int i = 0; i < numberOfContracts; i++) {
			System.out.printf("Enter the data of contract #%d:\n", i + 1);
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
		sdf = new SimpleDateFormat("MM/yyyy");
		Date date = sdf.parse(sc.next());
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month, year;
		month = cal.get(Calendar.MONTH) + 1;
		year = cal.get(Calendar.YEAR);
		
		System.out.printf("Name: %s\n", worker.getName());
		System.out.printf("Department: %s\n", worker.getDepartment().getName());
		System.out.printf("Income for %s: %.2f\n", sdf.format(date), worker.income(year, month));

		sc.close();
	}
}