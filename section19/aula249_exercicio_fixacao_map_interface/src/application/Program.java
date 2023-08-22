package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the file's absolute path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Map<String, Integer> candidates = new HashMap<>();
			String line = br.readLine();
			
			while (line != null) {
				String[] candidateCsv = line.split(",");
				String candidateName = candidateCsv[0];
				int currentNumberOfVotes = Integer.parseInt(candidateCsv[1]);
				
				if (candidates.containsKey(candidateName)) {
					int candidateVotes = candidates.get(candidateName);
					candidates.put(candidateName, currentNumberOfVotes + candidateVotes);
				}
				else {
					candidates.put(candidateName, currentNumberOfVotes);
				}
				line = br.readLine();
			}
			
			for (String key : candidates.keySet()) {
				System.out.printf("%s: %d\n", key, candidates.get(key)); 
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}