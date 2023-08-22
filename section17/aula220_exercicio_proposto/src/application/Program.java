package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		String line;
		
		System.out.print("Enter the input file's path: ");
		String path = sc.nextLine();
		File file = new File(path);
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String name = data[0];
				double price = Double.parseDouble(data[1]);
				int quantity = Integer.parseInt(data[2]);
				products.add(new Product(name, price, quantity));
			}
			
			boolean folderCreatedSuccessfully = new File(file.getParent() + "/out").mkdir();
			String summaryFilePath = file.getParent() + "/out/summary.csv";
			
			if (folderCreatedSuccessfully) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(summaryFilePath))){
					for (Product p : products) {
						bw.write(p.toString());
						bw.newLine();
					}
				}
				catch (IOException e) {
					System.out.print("Error: " + e.getMessage());
				}
			}
		}
		catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}