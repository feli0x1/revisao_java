package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAbaixoDaMedia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int qtd = sc.nextInt();
		double[] vetor = new double[qtd];
		double soma = 0.0;
		double media = 0.0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		media = soma / vetor.length;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		
		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] < media) {
				System.out.printf("%.1f\n", vetor[j]);
			}
		}
		
		sc.close();
	}
}