package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Log;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path;
		
		System.out.print("Enter the file's absolute path: ");
		path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Set<Log> set = new HashSet<>();
			String line = br.readLine();
			
			while (line != null) {
				String[] data = line.split(" ");
				String userName = data[0];
				Date lastAccess = Date.from(Instant.parse(data[1])); 
			
				set.add(new Log(userName, lastAccess));
				line = br.readLine();
			}	
			System.out.println("Number of users: " + set.size());
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}