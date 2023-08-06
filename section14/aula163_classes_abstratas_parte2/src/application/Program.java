package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1, "Susan", 5000.0, 0.05));
		list.add(new BusinessAccount(2, "Bob", 10000.0, 20000.0));
		list.add(new SavingsAccount(3, "Alex", 7000.0, 0.06));
		list.add(new BusinessAccount(4, "John", 2000.0, 30000.0));
		
		double totalBalance = 0.0;
		for (Account account : list) {
			totalBalance += account.getBalance();
		}  
		
		System.out.printf("Total balance: %.2f\n", totalBalance);
		
		for (Account account : list) {
			account.deposit(150);
			System.out.printf("Updated balance for account %d: %.2f\n", account.getNumber(), account.getBalance());
		}
	}
}