package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkInDate = sdf.parse(sc.nextLine());
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOutDate = sdf.parse(sc.nextLine());
		
		
		if (!checkOutDate.after(checkInDate)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation res = new Reservation(roomNumber, checkInDate, checkOutDate);
			System.out.println("Reservation: " + res);
			System.out.println();
			
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkInDate = sdf.parse(sc.nextLine());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOutDate = sdf.parse(sc.nextLine());
			
			String error = res.updateDates(checkInDate, checkOutDate);
			if (error != null) {
				System.out.print("Error in reservation: " + error);
			}
			else {
				System.out.print("Reservation: " + res);
			}
		}
		
		sc.close();
	}
}