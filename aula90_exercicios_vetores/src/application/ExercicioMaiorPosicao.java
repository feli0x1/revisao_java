package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaiorPosicao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int qtd = sc.nextInt();
		double[] numeros = new double[qtd];
		double maiorNumero = 0.0;
		int indiceMaiorNumero = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		
		for (int j = 0; j < numeros.length - 1; j++) {
			if (numeros[j] < numeros[j+1]) {
				maiorNumero = numeros[j+1];
				indiceMaiorNumero = j+1;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f\n", maiorNumero);
		System.out.println("POSICAO DO MAIOR VALOR = " + indiceMaiorNumero);
		
		sc.close();
	}
}