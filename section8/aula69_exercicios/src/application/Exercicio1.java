package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		System.out.println("Enter the rectangle's width and height:");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rec.area());
		System.out.printf("PERIMETER = %.2f%n", rec.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rec.diagonal());
		
		sc.close();
	}
}