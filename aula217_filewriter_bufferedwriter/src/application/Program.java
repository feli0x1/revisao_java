package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main(String[] args) {
		String[] content = new String[] {"Etiam bibendum eleifend ultrices. ", "Nunc at nisl nulla.", "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;"};
		String operatingSystem = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String path = null;

		if (operatingSystem.startsWith("Windows")) {
			path = String.format("C:\\Users\\%s\\file2.txt", userName);
		} 
		else if (operatingSystem.startsWith("Linux")) {
			path = String.format("/home/%s/file2.txt", userName);
		}
		
		// The following code: 
		// BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))
		// would append the content to the file, instead of
		// overwriting or creating the file
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : content) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}