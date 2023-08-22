package model.services;

public class BrazilTaxService implements TaxService {
	public double tax(double amount) {
		return (amount <= 100.00) ? 0.2 * amount : 0.15 * amount;
	}	
}