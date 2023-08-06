package aula36_exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int numero1, numero2;
		Scanner sc = new Scanner(System.in);
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}