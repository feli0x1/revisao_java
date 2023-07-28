package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		// Get local date
		LocalDate dt1 = LocalDate.now();
		
		// Get local date and time
		LocalDateTime dt2 = LocalDateTime.now();
		
		// Get GMT date and time
		Instant dt3 = Instant.now();
		
		// Parse string to date 
		LocalDate dt4 = LocalDate.parse("2023-02-15");
		
		// Parse string to date-time
		LocalDateTime dt5 = LocalDateTime.parse("2023-07-28T15:21");
		
		Instant dt6 = Instant.parse("2023-07-28T10:25:30Z"); 
		Instant dt7 = Instant.parse("2023-07-28T17:25:30-03:00");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd, MM, yyyy, HH, mm");
		LocalDate dt8 = LocalDate.parse("20/05/2023", fmt1);
		LocalDateTime dt9 = LocalDateTime.parse("20/05/2023 15:20", fmt2);
		LocalDateTime dt10 = LocalDateTime.parse("20, 05, 2023, 15, 20", fmt3);
		LocalDate dt11 = LocalDate.of(2023, 05, 20);
		LocalDateTime dt12 = LocalDateTime.of(2023, 05, 20, 17, 40);
		
		System.out.printf("dt1 = %s\n", dt1);
		System.out.printf("dt2 = %s\n", dt2);
		System.out.printf("dt3 = %s\n", dt3);
		System.out.printf("dt4 = %s\n", dt4);
		System.out.printf("dt5 = %s\n", dt5);
		System.out.printf("dt6 = %s\n", dt6);
		System.out.printf("dt7 = %s\n", dt7);
		System.out.printf("dt8 = %s\n", dt8);
		System.out.printf("dt9 = %s\n", dt9);
		System.out.printf("dt10 = %s\n", dt10);
		System.out.printf("dt11 = %s\n", dt11);
		System.out.printf("dt12 = %s\n", dt12);
	}
}