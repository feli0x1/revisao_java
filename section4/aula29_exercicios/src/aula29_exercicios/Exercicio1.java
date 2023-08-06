package aula29_exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int numero1, numero2, soma;
		Scanner sc = new Scanner(System.in);
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		soma = numero1 + numero2;
		
		System.out.println("SOMA = " + soma);
		sc.close();
	}
}