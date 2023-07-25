package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int qtd = sc.nextInt();
		int[] a = new int[qtd];
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		
		System.out.println("Digite os valores do vetor A:");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		
		for (int j = 0; j < b.length; j++) {
			b[j] = sc.nextInt();
		}
		
		for (int k = 0; k < c.length; k++) {
			c[k] = a[k] + b[k];
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		for (int l = 0; l < c.length; l++) {
			System.out.println(c[l]);
		}
		
		sc.close();
	}
}