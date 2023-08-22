package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Student;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> students = new HashSet<>();

		System.out.print("How many students enrolled course A? ");
		int numberOfStudentsCourseA = sc.nextInt();
		
		for (int i = 0; i < numberOfStudentsCourseA; i++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}
		
		System.out.print("How many students enrolled course B? ");
		int numberOfStudentsCourseB = sc.nextInt();
		
		for (int j = 0; j < numberOfStudentsCourseB; j++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}
		
		System.out.print("How many students enrolled course C? ");
		int numberOfStudentsCourseC = sc.nextInt();
		
		for (int l = 0; l < numberOfStudentsCourseC; l++) {
			int id = sc.nextInt();
			students.add(new Student(id));
		}
	
		System.out.println("Number of students: " + students.size());
		sc.close();
	}
}