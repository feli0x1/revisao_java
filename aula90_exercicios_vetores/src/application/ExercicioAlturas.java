package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAlturas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int qtd = sc.nextInt();
		sc.nextLine();
		String[] nomes = new String[qtd];
		int[] idades = new int[qtd];
		double[] alturas = new double[qtd];
		double somaAlturas = 0.0;
		double alturaMedia = 0.0;
		int qtdMenores16 = 0;
		double porcentagemMenores16 = 0.0;
		
		for (int i = 0; i < qtd; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			if (idades[i] < 16) {
				qtdMenores16 += 1;
			}
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			sc.nextLine();
			somaAlturas += alturas[i];
		}
		
		alturaMedia = somaAlturas / alturas.length;
		porcentagemMenores16 = (double) qtdMenores16 / qtd * 100;
		
		System.out.printf("\nAltura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores16);
		
		for (int j = 0; j < idades.length; j++) {
			if (idades[j] < 16) {
				System.out.println(nomes[j]);
			}
		}
		
		sc.close();
	}
}