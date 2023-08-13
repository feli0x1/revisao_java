package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many names? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			ps.addValue(name);
		}

		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}
}