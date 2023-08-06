package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount client;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder's name: ");
		sc.nextLine();
		String holdersName = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double amount = sc.nextDouble();
			client = new BankAccount(holdersName, accountNumber, amount);
		} else {
			client = new BankAccount(holdersName, accountNumber);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		client.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(client);
			
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		client.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(client);
		
		sc.close();
	}
}