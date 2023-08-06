package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.parse("2023-07-29T10:39:00");
		Instant d3 = Instant.parse("2023-07-29T10:39:00Z");
		
		LocalDate pastWeek = d1.minusWeeks(1);
		LocalDate nextWeek = d1.plusDays(7);
		LocalDate nextTwoWeeks = d1.plusDays(14);
		LocalDate nextThreeWeeks = d1.plusDays(21);
		
		System.out.println("Current date: " + d1.format(fmt));
		System.out.println("Past week: " + pastWeek.format(fmt));
		System.out.println("Next week: " + nextWeek.format(fmt));
		System.out.println("Next two weeks: " + nextTwoWeeks.format(fmt));

		LocalDateTime pastWeekMinusTwoHours = d2.minusDays(7).minusHours(2);
		LocalDateTime nextWeekPlusFiveHours = d2.plusDays(7).plusHours(5);
		
		System.out.println("Current date-time: " + d2.format(fmt));
		System.out.println("Past week -2 hours: " + pastWeekMinusTwoHours.format(fmt2));
		System.out.println("Next week +5 hours: " + nextWeekPlusFiveHours.format(fmt2));
		
		Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekMinusTwoHours, nextWeekPlusFiveHours);
		Duration t2 = Duration.between(d2, pastWeekMinusTwoHours);
		Duration t3 = Duration.between(d1.atTime(0, 0, 0), nextThreeWeeks.atStartOfDay());
		Duration t4 = Duration.between(pastWeekInstant, nextWeekInstant);
		Duration t5 = Duration.between(nextWeekInstant, pastWeekInstant);
		
		System.out.println("t1 = " + t1.toDays() + " days");
		System.out.println("t2 = " + t2.toDays() + " days");
		System.out.println("t3 = " + t3.toDays() + " days");
		System.out.println("t4 = " + t4.toDays() + " days");
		System.out.println("t5 = " + t5.toDays() + " days");
	}
}