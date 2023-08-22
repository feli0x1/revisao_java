package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String operatingSystem = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String path = null;

		if (operatingSystem.startsWith("Windows")) {
			path = String.format("C:\\Users\\%s\\file.txt", userName);
		} 
		else if (operatingSystem.startsWith("Linux")) {
			path = String.format("/home/%s/file.txt", userName);
		}

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}