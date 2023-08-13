package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Program {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
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
			String employeeCsv = br.readLine();
			
			while (employeeCsv != null) {
				String[] data = employeeCsv.split(",");
				String name = data[0];
				double salary = Double.parseDouble(data[1]); 
				
				list.add(new Employee(name, salary));
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Employee emp : list) {
				System.out.println(emp);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}