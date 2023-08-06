package application;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
	// the 'final' keyword turns PI into a constant
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double circum = circumference(radius);
		
		double vol = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", circum);
		System.out.printf("Volume: %.2f%n", vol);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * Math.pow(radius, 3) / 3; 
	}
}