package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file's path: ");
		String filePath = sc.nextLine();
		
		File file = new File(filePath);
		
		System.out.println("The file name is: " + file.getName());
		System.out.println("The file path is: " + file.getPath());
		System.out.println("The file's parent path is: " + file.getParent());
		
		sc.close();
	}
}