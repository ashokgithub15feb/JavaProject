package com.durga.program.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JodaDateTimeDemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.println();
		System.out.printf("%d/%d/%d",dd,mm,yyyy);
		System.out.println();
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.printf("%d:%d:%d.%d",h,m,s,n);
		System.out.println();
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println(dt.plusMonths(1));
		
		LocalDateTime dtf = LocalDateTime.of(1992,07,10, 12,45);
		System.out.println(dtf);
		
		System.out.println("After 2 months: "+dtf.plusMonths(2));
		System.out.println("Before 3 Months: "+dtf.minusMonths(3));
		
	}
}
