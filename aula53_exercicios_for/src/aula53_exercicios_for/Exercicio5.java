package aula53_exercicios_for;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i < n; i++) {
			fatorial = fatorial * (i + 1);
		}
		
		System.out.println(fatorial);
		sc.close();
	}
}