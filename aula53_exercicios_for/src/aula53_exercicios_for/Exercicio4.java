package aula53_exercicios_for;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdInputs = sc.nextInt();
		int primeiroNumero, segundoNumero;
		
		for (int i = 0; i < qtdInputs; i++) {
			primeiroNumero = sc.nextInt();
			segundoNumero = sc.nextInt();
			if (segundoNumero == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = (double)primeiroNumero / segundoNumero;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();
	}
}