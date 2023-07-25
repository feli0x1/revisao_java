package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAprovados {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		String[] alunos = new String[qtd];
		double[] notasPrimeiroSemestre = new double[alunos.length];
		double[] notasSegundoSemestre = new double[alunos.length];
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
			alunos[i] = sc.nextLine();
			notasPrimeiroSemestre[i] = sc.nextDouble();
			notasSegundoSemestre[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados:");
		for (int j = 0; j < alunos.length; j++) {
			double media = (notasPrimeiroSemestre[j] + notasSegundoSemestre[j]) / 2.0;
			if (media >= 6.0) {
				System.out.println(alunos[j]);
			}
		}
		
		sc.close();
	}
}