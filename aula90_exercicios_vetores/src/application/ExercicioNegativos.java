package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar? ");
		int qtd = sc.nextInt();
		int[] vetor = new int[qtd];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for (int j = 0; j < vetor.length; j++) {
			if (vetor[j] < 0) {
				System.out.println(vetor[j]);
			}
		}
		
		sc.close();
	}
}