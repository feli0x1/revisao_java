package application;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] peoplesHeights = new double[n];
		double sum = 0.0;
		
		for (int i = 0; i < n; i++) {
			peoplesHeights[i] = sc.nextDouble();
			sum += peoplesHeights[i];
		}
		
		double averageHeight = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f", averageHeight);
		
		sc.close();
	}
}