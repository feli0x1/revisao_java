package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaTrianguloX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaTrianguloY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Área do triângulo X: %.4f%n", areaTrianguloX);
		System.out.printf("Área do triângulo Y: %.4f%n", areaTrianguloY);
		
		System.out.printf("Triângulo com maior área: %s%n", (areaTrianguloX > areaTrianguloY) ? "X" : "Y");
		sc.close();
	}
}