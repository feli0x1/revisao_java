package aula53_exercicios_for;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdCasosTeste = sc.nextInt();
		double numero1, numero2, numero3;
		double mediaPonderada;
		
		for (int i = 0; i < qtdCasosTeste; i++) {
			numero1 = sc.nextDouble();
			numero2 = sc.nextDouble();
			numero3 = sc.nextDouble();
			mediaPonderada = (numero1 * 2 + numero2 * 3 + numero3 * 5) / (2 + 3 + 5);
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		sc.close();
	}
}