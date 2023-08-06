package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date d2 = new Date();
		Date d3 = d2;
		Date dateBackup = d;
		
		// Add time to date-time
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 5);
		d = cal.getTime();
		
		cal.setTime(d3);
		cal.add(Calendar.HOUR_OF_DAY, 3);
		d3 = cal.getTime();
		
		System.out.println("Original date and time: " + sdf.format(dateBackup));
		System.out.println("+5 hours added to date and time: " + sdf.format(d));
		
		System.out.println("\nMy current date and time: " + sdf.format(d2));
		System.out.println("+3 hours added to my current date and time: " + sdf.format(d3));
		
		int day, month, year, hours, minutes, seconds;
		day = cal.get(Calendar.DAY_OF_MONTH);
		month = cal.get(Calendar.MONTH) + 1;
		year = cal.get(Calendar.YEAR);
		hours = cal.get(Calendar.HOUR_OF_DAY);
		minutes = cal.get(Calendar.MINUTE);
		seconds = cal.get(Calendar.SECOND);
		
		System.out.printf("\n%d/%d/%d - %d:%d:%d\n", day, month, year, hours, minutes, seconds);
	}
}