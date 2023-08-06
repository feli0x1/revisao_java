package entities;

public class NaturalPerson extends TaxPayer {
	private Double healthcareExpenditure;
	
	public NaturalPerson() {
		
	}
	
	public NaturalPerson(String name, Double annualIncome, Double healthcareExpenditure) {
		super(name, annualIncome);
		this.healthcareExpenditure = healthcareExpenditure;
	}
	
	public Double getHealthcareExpenditure() {
		return healthcareExpenditure;
	}
	
	public void setHealthcareExpenditure(Double healthcareExpenditure) {
		this.healthcareExpenditure = healthcareExpenditure;
	}
	
	@Override
	public double taxes() {
		if (getAnnualIncome() < 20000.00) {
			return 1.15 * getAnnualIncome();
		}
		else {
			return 0.25 * getAnnualIncome() - 0.5 * healthcareExpenditure;
		}
	}
}
