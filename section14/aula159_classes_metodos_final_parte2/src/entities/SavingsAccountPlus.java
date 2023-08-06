package entities;

public class SavingsAccountPlus extends SavingsAccount {
	@Override
	public void withdraw(Double amount) {
		balance -= amount + 2.0;
	}
}