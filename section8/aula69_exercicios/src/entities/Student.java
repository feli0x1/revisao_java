package entities;

public class Student {
	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;
	
	public double finalGrade() {
		return firstGrade + secondGrade + thirdGrade;
	}
	
	public double missingGrade() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}
}
