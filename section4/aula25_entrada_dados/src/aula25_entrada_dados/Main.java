package aula25_entrada_dados;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x;
		int numero1;
		double numero2;
		char caractere;
		
		System.out.print("Digite uma palavra (texto sem espaços): ");
		x = sc.next(); // Ler string sem espaço
		System.out.println("Você digitou a palavra " + x);
		
		System.out.print("Digite um número inteiro: ");
		numero1 = sc.nextInt(); // Ler um número inteiro
		System.out.println("Você digitou o número " + numero1);
		
		System.out.print("Digite um número com ponto flutuante: ");
		numero2 = sc.nextDouble(); // Ler um número com ponto flutuante
		System.out.println("Você digitou o número " + numero2);
		
		System.out.print("Digite um caractere: ");
		caractere = sc.next().charAt(0); // Ler um caractere
		System.out.println("Você digitou o número " + caractere);
		
		String palavra;
		int numero3;
		double numero4;
		
		// Ler vários dados em uma única linha ou ler vários dados em seguida
		palavra = sc.next();
		numero3 = sc.nextInt();
		numero4 = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(palavra);
		System.out.println(numero3);
		System.out.println(numero4);
		
		sc.close();
	}
}
