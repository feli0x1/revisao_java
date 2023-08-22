package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract's data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), format);
		
		System.out.print("The contract's value: ");
		double value = sc.nextDouble();
		
		System.out.print("Enter the amount of installments: ");
		int amountOfInstallments = sc.nextInt();
		
		Contract contract = new Contract(number, date, value);
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, amountOfInstallments);
		
		System.out.println("Installments:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}