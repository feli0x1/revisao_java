package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Room[] rooms = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int numberOfRoomsToRent = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		
		for (int i = 0; i < numberOfRoomsToRent; i++) {
			System.out.printf("Rent #%d:\n", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			System.out.println();
			rooms[roomNumber] = new Room(name, email);
		}

		System.out.println("Busy rooms:");
		for (int j = 0; j < rooms.length; j++) {
			// Check if there is someone renting the current room
			if (rooms[j] != null) {
				System.out.println("" + j + ": " + rooms[j]);
			}
		}
		sc.close();
	}
}