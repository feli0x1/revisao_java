package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();

		System.out.print("Holder: ");
		String holder = sc.nextLine();

		System.out.print("Initial balance: $");
		double initialBalance = sc.nextDouble();

		System.out.print("Withdraw limit: $");
		double withdrawLimit = sc.nextDouble();

		Account acc = new Account(accountNumber, holder, initialBalance, withdrawLimit);

		System.out.print("\nEnter the amount for withdraw: $");
		double withdrawAmount = sc.nextDouble();

		try {
			acc.withdraw(withdrawAmount);
			System.out.printf("Updated balance: $%.2f", acc.getBalance());
		} catch (WithdrawException e) {
			System.out.print("Withdraw error: " + e.getMessage());
		}

		sc.close();
	}
}