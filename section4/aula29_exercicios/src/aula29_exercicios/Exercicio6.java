package aula29_exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", a * c / 2);
		System.out.printf("CIRCULO: %.3f%n", 3.14159 * Math.pow(c, 2));
		System.out.printf("TRAPEZIO: %.3f%n", (a + b) * c / 2.0);
		System.out.printf("QUADRADO: %.3f%n", Math.pow(b, 2));
		System.out.printf("RETANGULO: %.3f%n", a * b);
		
		sc.close();
	}
}