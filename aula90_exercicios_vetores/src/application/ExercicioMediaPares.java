package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int qtd = sc.nextInt();
		int[] vetor = new int[qtd];
		int soma = 0;
		int qtdNumerosPares = 0;
		double media = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				qtdNumerosPares += 1;
			}
		}
		
		if (qtdNumerosPares > 0) {
			media = (double) soma / qtdNumerosPares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		sc.close();
	}
}