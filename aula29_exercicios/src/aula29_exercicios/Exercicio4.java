package aula29_exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salarioFuncionario;
		Scanner sc = new Scanner(System.in);
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		salarioFuncionario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n%n", salarioFuncionario);
		sc.close();
	}
}