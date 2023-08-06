package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDate d1 = LocalDate.parse("2023-07-28");
		LocalDateTime d2 = LocalDateTime.parse("2023-07-28T01:00:20");
		Instant d3 = Instant.parse("2023-07-28T01:00:20Z");
		Instant d4 = Instant.now();
		
		// Conversão de data-hora global para uma data-hora local
		LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d4, ZoneId.of("Australia/Sydney"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d4, ZoneId.of("Europe/Berlin"));
		LocalDateTime r4 = LocalDateTime.ofInstant(d4, ZoneId.of("America/Toronto"));
		LocalDateTime r5 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("Current date and time in Sydney = " + r2.format(fmt).toString());
		System.out.println("Current date and time in Berlin = " + r3.format(fmt).toString());
		System.out.println("Current date and time in Toronto = " + r4.format(fmt).toString());
		System.out.println("r5 = " + r5.format(fmt).toString());
		
		System.out.printf("d1 day = %d, month = %d, year = %d\n", d1.getDayOfMonth(), d1.getMonthValue(), d1.getYear());
		System.out.printf("d2 hour(s) = %d, minute(s) = %d, second(s) = %d\n", d2.getHour(), d2.getMinute(), d2.getSecond());
		
		for (String zone : ZoneId.getAvailableZoneIds()) {
			System.out.printf("%s, ", zone);
		}
	}
}