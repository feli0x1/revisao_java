package aula53_exercicios_for;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int qtdNumerosDentroIntervalo = 0;
		int qtdNumerosForaIntervalo = 0;
		int inputUsuario;
		
		for (int i = 0; i < n; i++) {
			inputUsuario = sc.nextInt();
			if (inputUsuario >= 10 && inputUsuario <= 20) {
				qtdNumerosDentroIntervalo += 1;
			}
			else {
				qtdNumerosForaIntervalo += 1;
			}
		}
		
		System.out.printf("%d in%n", qtdNumerosDentroIntervalo);
		System.out.printf("%d out%n", qtdNumerosForaIntervalo);
		sc.close();
	}
}