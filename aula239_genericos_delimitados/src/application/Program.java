package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;
import model.services.CalculationService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		String userName = System.getProperty("user.name");
		String operatingSystem = System.getProperty("os.name");
		boolean osIsWindows = operatingSystem.toLowerCase().contains("windows");
		boolean osIsLinux = operatingSystem.toLowerCase().contains("linux");
		String path = null;
		
		if (osIsWindows) {
			path = "C:\\Users\\" + userName + "\\in.csv";
		}
		else if (osIsLinux) {
			path = "/home/" + userName + "/in.csv";
		}

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] data = line.split(",");
				String productName = data[0];
				double productPrice = Double.parseDouble(data[1]);
				list.add(new Product(productName, productPrice));
			
				line = br.readLine();
			}

			Product x = CalculationService.max(list);
			System.out.println("Most expensive product:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}