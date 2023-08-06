package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		// acc1 can't be directly instantiated since the 'Account' class
		// is an abstract class.
		Account acc1 = new Account(1, "Oliver", 2000.0);
		
		// However, the subclasses can extend the 'Account' class
		// without any issues
		Account acc2 = new SavingsAccount(2, "Susan", 5500.0, 0.05);
		Account acc3 = new BusinessAccount(3, "Bob", 10000.0, 20000.0);
	}
}