package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		LocalDate dt1 = LocalDate.parse("2023-07-01");
		LocalDateTime dt2 = LocalDateTime.parse("2023-07-01T10:15:25");
		Instant dt3 = Instant.parse("2023-07-01T10:15:25Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("dt1 = " + dt1);
		System.out.println("dt1 formatted = " + dt1.format(fmt1));
		System.out.println("dt1 formatted = " + fmt1.format(dt1));
		
		System.out.println("dt2 = " + dt2);
		System.out.println("dt2 formatted = " + fmt2.format(dt2));
		
		System.out.println("dt3 = " + dt3);
		System.out.println("dt3 formatted = " + fmt3.format(dt3));
		
		System.out.println("dt2 formatted = " + fmt4.format(dt2));
		System.out.println("dt3 formatted = " + fmt5.format(dt3));
	}
}