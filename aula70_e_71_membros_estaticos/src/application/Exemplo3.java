package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator2;

public class Exemplo3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circum = Calculator2.circumference(radius);
		
		double vol = Calculator2.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circum);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI value: %.2f%n", Calculator2.PI);
		
		sc.close();
	}
}