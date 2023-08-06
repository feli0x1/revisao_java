package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
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
		
		System.out.print("VALORES = ");
		for (int j = 0; j < vetor.length; j++) {
			System.out.printf("%.1f ", vetor[j]);
		}
		
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		sc.close();
	}
}