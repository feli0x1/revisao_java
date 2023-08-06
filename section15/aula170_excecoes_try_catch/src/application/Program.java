package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int index = sc.nextInt();
			System.out.println(vect[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}

		sc.close();
	}
}