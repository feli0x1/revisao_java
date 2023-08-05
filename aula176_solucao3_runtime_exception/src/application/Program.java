package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();

			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkInDate = sdf.parse(sc.nextLine());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOutDate = sdf.parse(sc.nextLine());

			Reservation res = new Reservation(roomNumber, checkInDate, checkOutDate);
			System.out.println("Reservation: " + res);
			System.out.println();

			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkInDate = sdf.parse(sc.nextLine());

			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOutDate = sdf.parse(sc.nextLine());

			res.updateDates(checkInDate, checkOutDate);
			System.out.print("Reservation: " + res);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}
}