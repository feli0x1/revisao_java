package aula36_exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double intervalo;
		
		intervalo = sc.nextDouble();
		
		if (intervalo >= 0.00) {
			if (intervalo >= 0.00 && intervalo <= 25.00) {
				System.out.println("Intervalo [0,25]");
			}
			else if (intervalo <= 50.00) {
				System.out.println("Intervalo (25,50]");
			}
			else if (intervalo <= 75.00) {
				System.out.println("Intervalo (50,75]");
			}
			else if (intervalo <= 100.00) {
				System.out.println("Intervalo (75,100]");
			}
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}
}