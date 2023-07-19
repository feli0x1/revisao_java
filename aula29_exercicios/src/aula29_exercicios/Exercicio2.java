package aula29_exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, areaCirculo;
		
		raio = sc.nextDouble();
		areaCirculo = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f", areaCirculo);
		sc.close();
	}

}
