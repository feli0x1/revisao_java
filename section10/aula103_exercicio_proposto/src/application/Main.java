package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		// Input to test the code's logic
		// 4 4
		// 8 9 6 3  
		// 1 8 2 3
		// 4 5 7 8
		// 4 3 8 2
		// 8
		
		for (int k = 0; k < matrix.length; k++) {
			for (int l = 0; l < matrix[k].length; l++) {
				// If the current element matches the number being searched
				if (matrix[k][l] == x) {
					System.out.printf("Position %d,%d:\n", k, l);
					
					// Check if there is a number to the left of the current element
					if (l - 1 >= 0) {
						System.out.printf("Left: %d\n", matrix[k][l-1]);
					}
					
					// Check if there is a number above the current element
					if (k - 1 >= 0) {
						System.out.printf("Up: %d\n", matrix[k-1][l]);
					}
					
					// Check if there is a number to the right of the current element
					if (l + 1 < matrix[k].length) {
						System.out.printf("Right: %d\n", matrix[k][l+1]);
					}
					
					// Check if there is a number below the current element
					if (k + 1 < matrix.length) {
						System.out.printf("Down: %d\n", matrix[k+1][l]);
					}
				}
			}
		}
		
		sc.close();
	}
}