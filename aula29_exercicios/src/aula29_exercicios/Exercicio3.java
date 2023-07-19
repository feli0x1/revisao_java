package aula29_exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int a, b, c, d, diferenca;
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		diferenca = a * b - c * d;
		
		System.out.printf("DIFERENCA = %d%n%n%n", diferenca);
		
		sc.close();

	}
}