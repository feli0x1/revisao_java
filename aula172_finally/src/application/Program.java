package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String userName = System.getProperty("user.name");
		boolean isWindows = System.getProperty("os.name").startsWith("Windows");
		boolean isLinux = System.getProperty("os.name").startsWith("Linux");
		File file = null;
		
		if (isWindows) {
			file = new File("C:\\temp\\in.txt");
		}
		else if (isLinux) {
			file = new File("/home/" + userName + "/in.txt");
		}
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Program finished executing!");
		}
	}
}