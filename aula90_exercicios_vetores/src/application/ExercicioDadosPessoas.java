package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int qtd = sc.nextInt();
		int qtdHomens = 0;
		int qtdMulheres = 0;
		double maiorAltura = 0.0;
		double menorAltura;
		double mediaAlturaMulheres = 0.0;

		double[] alturas = new double[qtd];
		char[] generos = new char[alturas.length];
		
		for (int i = 0; i < alturas.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			generos[i] = sc.next().charAt(0);
		}
		
		menorAltura = alturas[0];
		
		for (int j = 0; j < alturas.length; j++) {
			if (alturas[j] > maiorAltura) {
				maiorAltura = alturas[j];
			}
			if (alturas[j] < menorAltura) {
				menorAltura = alturas[j];
			}
			if (generos[j] == 'F') {
				qtdMulheres += 1;
				mediaAlturaMulheres += alturas[j];
			} else {
				qtdHomens += 1;
			}
		}
		
		mediaAlturaMulheres /= qtdMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
		System.out.printf("Número de homens = %d", qtdHomens);
		
		sc.close();
	}
}