package entities;

// the 'final' keyword disables the possibility of
// the SavingsAccount class being extended 
public final class SavingsAccount extends Account {
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
	// @Override warns the compiler that the method is overrode 
	public void withdraw(Double amount) {
		balance -= amount;
	}
}