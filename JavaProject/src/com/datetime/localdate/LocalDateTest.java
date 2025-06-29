package com.datetime.localdate;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {
		
		//localDateDemo1();
		
		
		//localDateDemo2();
		
		
		//localTimeDemo();
		
		
		LocalTime localTime = LocalTime.now();
		int hour = localTime.getHour();
		System.out.println(hour);
		LocalTime localTime2 = localTime.plus(10, ChronoUnit.HOURS);
		int hour2 = localTime2.getHour();
		System.out.println(hour2);
		System.out.println(localTime2);
		
	}

	private static void localTimeDemo() {
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		
		LocalTime localTime1 = LocalTime.from(LocalTime.now());
		System.out.println(localTime1);
		
		LocalTime localTime2 = LocalTime.now();
		System.out.println(localTime2);
		
		LocalTime localTime3 = LocalTime.now(Clock.systemDefaultZone());
		System.out.println(localTime3);
		
		LocalTime localTime4 = LocalTime.now(Clock.systemUTC());
		System.out.println(localTime4);
		
		LocalTime localTime5 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(localTime5);
	
		LocalTime localTime6 = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		System.out.println(localTime6);
	
		LocalTime localTime7 = LocalTime.of(5, 30);
		System.out.println(localTime7);
		
		LocalTime localTime8 = LocalTime.of(10, 45, 50);
		System.out.println(localTime8);
		
		LocalTime localTime9 = LocalTime.of(7, 5, 15, 20);
		System.out.println(localTime9);
		
		LocalTime localTime10 = LocalTime.ofNanoOfDay(24 * 60 * 60 * 1000000);
		System.out.println(localTime10);
		
		LocalTime localTime11 = LocalTime.ofSecondOfDay(24 * 60 * 60 - 1);
		System.out.println(localTime11);
		
		LocalTime localTime12 = LocalTime.parse("21:55:20.816");
		System.out.println(localTime12);
		
		LocalTime localTime13 = LocalTime.parse("14:15:30", DateTimeFormatter.ISO_TIME);
		System.out.println(localTime13);
	}

	private static void localDateDemo2() {
		LocalDate localDate1 = LocalDate.now();
		System.out.println(localDate1);
		
		LocalDate localDate2 = LocalDate.of(2024, Month.JANUARY, 17);
		System.out.println(localDate2);
		System.out.println(localDate1.isAfter(localDate2));
		System.out.println(localDate1.isBefore(localDate2));
		
		LocalDate localDate3 = LocalDate.of(2024, Month.JANUARY, 19);
		System.out.println(localDate3);
		System.out.println(localDate1.isAfter(localDate3));
		System.out.println(localDate1.isBefore(localDate3));
		System.out.println(localDate1.isEqual(localDate3));
		
		System.out.println(localDate1.getYear());
		System.out.println(localDate1.getDayOfMonth());
		System.out.println(localDate1.getDayOfWeek());
		System.out.println(localDate1.getMonthValue());
		
	 	LocalDate localDate4 = localDate1.plus(2,ChronoUnit.DAYS);
		System.out.println(localDate4);
		
		LocalDate localDate5 = localDate1.plus(2,ChronoUnit.YEARS);
		System.out.println(localDate5);
		
		LocalDate localDate6 = localDate1.plus(2,ChronoUnit.MONTHS);
		System.out.println(localDate6);
	}

	private static void localDateDemo1() {
		LocalDate local =  LocalDate.now();
		System.out.println(local);
		
		LocalDate localDate = LocalDate.from(LocalDate.now());
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.now(Clock.systemUTC());
		System.out.println(localDate2);
		
		LocalDate localDate3 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(localDate3);
		
		LocalDate localDate4 = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println(localDate4);
		
		LocalDate localDate5 = LocalDate.of(2021, Month.AUGUST, 21);
		System.out.println(localDate5);
		
		LocalDate localDate6 = LocalDate.of(2021, 7, 21);
		System.out.println(localDate6);
		
		LocalDate localDate7 = LocalDate.ofEpochDay(0); //default
		System.out.println(localDate7);
		
		LocalDate localDate8 = LocalDate.ofEpochDay(10);
		System.out.println(localDate8);
		
		LocalDate localDate9 = LocalDate.ofYearDay(2021, 156);
		System.out.println(localDate9);
		
		LocalDate localDate10 = LocalDate.ofYearDay(2021, 365);
		System.out.println(localDate10);
		
		LocalDate localDate11 = LocalDate.parse("2024-01-18");
		System.out.println(localDate11);
		
		LocalDate localDate12 = LocalDate.parse("20240118", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(localDate12);
	}
}
