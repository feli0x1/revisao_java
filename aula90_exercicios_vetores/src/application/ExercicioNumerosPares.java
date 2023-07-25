package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNumerosPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int qtd = sc.nextInt();
		int qtdNumerosPares = 0;
		int[] numeros = new int[qtd];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
			
			if (numeros[i] % 2 == 0) {
				qtdNumerosPares += 1;
			}
		}
		
		System.out.println("NÚMEROS PARES:");
		
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] % 2 == 0) {
				System.out.printf("%d  ", numeros[j]);
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES = " + qtdNumerosPares);
		
		sc.close();
	}
}