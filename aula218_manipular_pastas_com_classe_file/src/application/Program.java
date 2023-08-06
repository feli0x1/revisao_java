package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String folderPath = sc.nextLine();
		
		File path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.printf("Folders inside the path %s:\n", folderPath);
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.printf("Files inside the path %s:\n", folderPath);
		
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean folderCreationSuccess = new File(folderPath + "/random_folder").mkdir();
		System.out.printf("Directory created successfully: %b", folderCreationSuccess);
		
		sc.close();
	}
}