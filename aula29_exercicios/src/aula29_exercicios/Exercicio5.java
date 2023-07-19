package aula29_exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigoPeca1, qtdPecas1;
		int codigoPeca2, qtdPecas2;
		double valorUnitarioPeca1, valorUnitarioPeca2, custoTotal;
		
		codigoPeca1 = sc.nextInt();
		qtdPecas1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();
		codigoPeca2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();
		custoTotal = (qtdPecas1 * valorUnitarioPeca1) + (qtdPecas2 * valorUnitarioPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n%n", custoTotal);
		sc.close();
	}
}