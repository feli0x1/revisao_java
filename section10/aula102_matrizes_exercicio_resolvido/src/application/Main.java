package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			// matrix[i].length -> amount of columns
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int numberOfNegativeValues = 0;
		
		System.out.println("Main diagonal:");
		for (int k = 0; k < matrix.length; k++) {
			for (int l = 0; l < matrix[k].length; l++) {
				if (matrix[k][l] < 0) {
					numberOfNegativeValues += 1;
				}
				if (k == l) {
					System.out.printf("%d ", matrix[k][l]);
				}
			}
		}
		
		System.out.println("\nNumber of negative numbers = " + numberOfNegativeValues);
		sc.close();
	}
}