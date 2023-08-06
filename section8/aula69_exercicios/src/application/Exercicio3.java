package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.name = sc.nextLine();
		s.firstGrade = sc.nextDouble();
		s.secondGrade = sc.nextDouble();
		s.thirdGrade = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", s.finalGrade());
		if (s.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("YOU'RE %.2f POINTS SHORT%n", s.missingGrade());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}
}