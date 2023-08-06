package aula36_exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int horaInicial, horaFinal;
		int duracaoJogo = 0;
		Scanner sc = new Scanner(System.in);
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial == horaFinal) {
			duracaoJogo = 24;
		}
		else {
			if (horaInicial > horaFinal) {
				duracaoJogo = 24 - horaInicial + horaFinal;
			}
			else {
				duracaoJogo = horaFinal - horaInicial;
			}
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", duracaoJogo);
		sc.close();
	}
}