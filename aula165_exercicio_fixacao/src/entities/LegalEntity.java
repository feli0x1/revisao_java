package entities;

public class LegalEntity extends TaxPayer {
	private Integer numberOfEmployees;
	
	public LegalEntity() {
		
	}
	
	public LegalEntity(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double taxes() {
		if (numberOfEmployees > 10) {
			return 0.14 * getAnnualIncome();
		}
		else {
			return 0.16 * getAnnualIncome();
		}
	}
}
