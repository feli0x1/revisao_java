package aula53_exercicios_for;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
		}
		sc.close();
	}
}