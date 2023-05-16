package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		
		LocalDate d01 = LocalDate.now();
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String text = d01.format(fmt1);
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//LocalDate d04 = LocalDate.parse("2023-03-15");
		//LocalDateTime d05 = LocalDateTime.parse("2023-03-15T01:30:26");
		//Instant d06 = Instant.parse("2023-03-15T01:30:26Z");
		//Instant d07 = Instant.parse("2022-11-04T01:30:26+03:00");
		
		LocalDate d08 = LocalDate.parse("12-08-2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("11-07-2023 01:00", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 5, 28);
		LocalDateTime d11 = LocalDateTime.of(2023, 7, 21, 1, 30);
		
		System.out.println(d11);
		System.out.println(d10);
		System.out.println(d09);
		System.out.println(d08);
		//System.out.println(d07);
		//System.out.println(d06);
		//System.out.println(d05);
		//System.out.println(d04);
		System.out.println(d03);
		System.out.println(d02);
		System.out.println(d01);
		
		
		//******************************Customizar localDate*******************************************
		
		//LocalDate d04 = LocalDate.parse("2023-03-15");
		//LocalDateTime d05 = LocalDateTime.parse("2023-03-15T01:30:26");
		//Instant d06 = Instant.parse("2023-03-15T00:30:26Z");
		
		//DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		//DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm").withZone(ZoneId.systemDefault());
		//DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		
		
		//System.out.println(d05.format(fmt4));
		//System.out.println(d05.format(fmt));
		//System.out.println(d04.format(fmt));
		//System.out.println(fmt5.format(d06));
		//System.out.println(d05.format(fmt6));
		
		
		//******************************Customizar localDateTime*******************************************
		
		//LocalDate d04 = LocalDate.parse("2023-03-15");
		//LocalDateTime d05 = LocalDateTime.parse("2023-03-15T01:30:26");
		//Instant d06 = Instant.parse("2023-03-15T00:30:26Z");
		
		//for (String s : ZoneId.getAvailableZoneIds()) {
			//System.out.println(s);
		
		//LocalDate r = LocalDate.from(ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Canada/Central")));
		//LocalDate r1 = LocalDate.from(ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		//LocalDateTime r2 = LocalDateTime.from(ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Canada/Central")));
		//LocalDateTime r3 = LocalDateTime.from(ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		
		//System.out.println(r);
		//System.out.println(r1);
		//System.out.println(r2);
		//System.out.println(r3);
		
		//System.out.println(d04.getDayOfMonth());	
		//System.out.println(d04.getMonthValue());
		//System.out.println(d04.getYear());
		
		//System.out.println(d05.getHour());
		//System.out.println(d05.getMinute());
		
		

		//******************************Calculo data-hora*******************************************
		
		LocalDate d04 = LocalDate.parse("2023-03-15");
		LocalDateTime d05 = LocalDateTime.parse("2023-03-15T01:30:26");
		Instant d06 = Instant.parse("2023-03-15T00:30:26Z");
		
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		Duration t = Duration.between(pastWeekLocalDateTime, d05);
		
		System.out.println(t.toDays());
		
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		
		System.out.println(t1.toDays());
		
		Duration t2 = Duration.between(pastWeekInstant, d06);
		
		Duration t3 = Duration.between(d06, pastWeekInstant);
		
		System.out.println(t2.toDays());
		
		System.out.println(t3.toDays());
		
		
	}	
}
