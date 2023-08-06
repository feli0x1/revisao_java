package entities;

public class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	// This method can't be overriden by a subclass
	// Since it contains the 'final' keyword
	public final void withdraw(Double amount) {
		balance -= amount;
	}
}