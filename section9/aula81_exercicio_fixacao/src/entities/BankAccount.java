package entities;

public class BankAccount {
	private String holderName;
	private int number;
	private double balance;
		
	// Constructor made to initialize the bank account with a deposit, if that is the case
	public BankAccount(String holderName, int number, double moneyAmount) {
		this.holderName = holderName;
		this.number = number;
		deposit(moneyAmount);
	}
	
	public BankAccount(String holderName, int number) {
		this.holderName = holderName;
		this.number = number;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double moneyAmount) {
		balance += moneyAmount;
	}
	
	public void withdraw(double moneyAmount) {
		balance -= moneyAmount + 5.0;
	}
	
	public String toString() {
		return "Account " +
			   number + 
			   ", " +
			   "Holder: " +
			   holderName +
			   ", " +
			   "Balance: $ "+
			   String.format("%.2f", balance);
	}
}
