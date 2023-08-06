package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.NaturalPerson;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> listTaxPayers = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numberOfTaxPayers = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= numberOfTaxPayers; i++) {
			System.out.printf("Tax payer #%d data:\n", i);
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (c == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				listTaxPayers.add(new NaturalPerson(name, annualIncome, healthExpenditure));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				listTaxPayers.add(new LegalEntity(name, annualIncome, numberOfEmployees));
			}
		}
		
		double sumOfTaxesPaid = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer taxPayer : listTaxPayers) {
			sumOfTaxesPaid += taxPayer.taxes();
			System.out.println(taxPayer);
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sumOfTaxesPaid);
		
		sc.close();
	}
}