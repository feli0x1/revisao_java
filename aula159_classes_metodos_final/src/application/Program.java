package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Account acc1 = new Account(1, "John", 100.0);
		SavingsAccount acc2 = new SavingsAccount(2, "Oliver", 100.0, 0.10);
		BusinessAccount acc3 = new BusinessAccount(3, "Joseph", 100.0, 0.05);
		
		System.out.println("Account1 balance before withdraw = " + acc1.getBalance());
		acc1.withdraw(5.0);
		System.out.println("Account1 balance after withdraw = " + acc1.getBalance());
		
		System.out.println("\nAccount2 balance before withdraw = " + acc2.getBalance());
		acc2.withdraw(5.0);
		System.out.println("Account2 balance after withdraw = " + acc2.getBalance());
		
		System.out.println("\nAccount3 balance before withdraw = " + acc3.getBalance());
		acc3.withdraw(5.0);
		System.out.print("Account3 balance after withdraw = " + acc3.getBalance());
		
	}
}