package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = null;
		String userName = System.getProperty("user.name");
		String operatingSystem = System.getProperty("os.name");
		
		if (operatingSystem.startsWith("Windows")) {
			path = String.format("C:\\%s\\temp\\in.csv", userName);
		}
		else if (operatingSystem.startsWith("Linux")) {
			path = String.format("/home/%s/in.csv", userName);
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}