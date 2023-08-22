package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		String operatingSystem = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		File file = null;
		Scanner sc = null;
		
		if (operatingSystem.startsWith("Windows")) {
			file = new File(String.format("C:\\Users\\%s\\file.txt", userName));
		}
		else if (operatingSystem.startsWith("Linux")) {
			file = new File(String.format("/home/%s/file.txt", userName));
		}
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}