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
		
		System.out.printf("Área do triângulo X: %.4f%n", x.area());
		System.out.printf("Área do triângulo Y: %.4f%n", y.area());
		
		System.out.printf("Triângulo com maior área: %s%n", (x.area() > y.area()) ? "X" : "Y");
		sc.close();
	}
}