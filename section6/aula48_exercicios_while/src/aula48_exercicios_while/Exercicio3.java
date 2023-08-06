package aula48_exercicios_while;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo;
		int qtdClientesAlcool = 0;
		int qtdClientesGasolina = 0;
		int qtdClientesDiesel = 0;
		
		codigo = sc.nextInt();
		
		while (codigo != 4) {
			if (codigo == 1) {
				qtdClientesAlcool += 1;
			}
			else if (codigo == 2) {
				qtdClientesGasolina += 1;
			}
			else if (codigo == 3) {
				qtdClientesDiesel += 1;
			}
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + qtdClientesAlcool);
		System.out.println("Gasolina: " + qtdClientesGasolina);
		System.out.println("Diesel: " + qtdClientesDiesel);
		sc.close();

	}

}
