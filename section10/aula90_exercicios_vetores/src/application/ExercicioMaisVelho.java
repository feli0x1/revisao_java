package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaisVelho {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int qtd = sc.nextInt();
		sc.nextLine(); // consumir quebra de linha
		
		String[] nomes = new String[qtd];
		int[] idades = new int[nomes.length];
		int maiorIdade = 0;
		int indicePessoaMaisVelha = 0;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			sc.nextLine(); // consumir quebra de linha
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indicePessoaMaisVelha = i;
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nomes[indicePessoaMaisVelha]);
		
		sc.close();
	}
}