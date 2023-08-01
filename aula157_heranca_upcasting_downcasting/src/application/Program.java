package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Account account = new Account(5000, "John", 0.0);
		BusinessAccount businessAccount = new BusinessAccount(5500, "Jordan", 10000.0, 0.05);
		
		// Upcasting
		Account account2 = businessAccount;
		Account account3 = new BusinessAccount(5501, "Oliver", 1000.0, 0.1);
		Account account4 = new SavingsAccount(5502, "Anna", 200.0, 0.01);
		
		// Downcasting
		BusinessAccount account5 = (BusinessAccount) account2;
		account5.loan(1000.0);
		
		
		if (account4 instanceof BusinessAccount) {
			BusinessAccount account6 = (BusinessAccount) account4;
			account6.loan(100.0);
			System.out.println("Loan!");
		}
		else if (account4 instanceof SavingsAccount) {
			SavingsAccount account6 = (SavingsAccount) account4;
			account6.updateBalance();
			System.out.println("Update!");
		}
	}
}