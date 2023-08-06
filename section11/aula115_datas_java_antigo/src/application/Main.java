package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date d1 = sdf1.parse("30/07/2023");
		Date d2 = sdf2.parse("30/07/2023 17:00:00");
		Date currentDateTime = new Date();
		
		System.out.println("original d1 = " + d1);
		System.out.println("original d2 = " + d2);
		
		System.out.println("\nformatted d1 = " + sdf1.format(d1));
		System.out.println("formatted d2 = " + sdf2.format(d2));
		
		System.out.println("\ncurrentDateTime = " + currentDateTime);
		System.out.println("formatted currentDateTime = " + sdf2.format(currentDateTime));
		
		Date d3 = Date.from(Instant.parse("2023-07-30T19:25:00Z"));
		
		System.out.println("\noriginal d3 = " + sdf2.format(d3));
		System.out.println("GMT d3 = " + sdf3.format(d3));
	}
}