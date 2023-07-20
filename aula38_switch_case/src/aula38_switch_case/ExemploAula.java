package aula38_switch_case;

import java.util.Scanner;

public class ExemploAula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diaSemana = sc.nextInt();
		String dia;
		
		switch (diaSemana) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda-feira";
				break;
			case 3:
				dia = "Terça-feira";
				break;
			case 4:
				dia = "Quarta-feira";
				break;
			case 5:
				dia = "Quinta-feira";
				break;
			case 6:
				dia = "Sexta-feira";
				break;
			case 7:
				dia = "Sábado";
				break;
			default:
				dia = "Valor inválido";
				break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}
}