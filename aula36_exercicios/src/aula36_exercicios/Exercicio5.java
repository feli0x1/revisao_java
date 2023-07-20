package aula36_exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigoItem, qtItem;
		double custoTotal = 0.0;
		
		codigoItem = sc.nextInt();
		qtItem = sc.nextInt();
		
		if (codigoItem == 1) {
			custoTotal = 4 * qtItem;
		}
		else if (codigoItem == 2) {
			custoTotal = 4.50 * qtItem;
		}
		else if (codigoItem == 3) {
			custoTotal = 5 * qtItem;
		}
		else if (codigoItem == 4) {
			custoTotal = 2 * qtItem;
		}
		else if (codigoItem == 5) {
			custoTotal = 1.50 * qtItem;
		}
		
		System.out.printf("Total: R$ %.2f", custoTotal);
		sc.close();
	}
}