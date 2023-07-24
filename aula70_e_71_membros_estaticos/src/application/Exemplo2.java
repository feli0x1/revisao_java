package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Exemplo2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circum = calc.circumference(radius);
		
		double vol = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circum);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
}