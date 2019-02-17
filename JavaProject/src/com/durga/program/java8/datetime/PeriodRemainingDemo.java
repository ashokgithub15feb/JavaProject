package com.durga.program.java8.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodRemainingDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate finalday = LocalDate.of(2012+60, 12, 12);
		
		Period p = Period.between(today, finalday);
		
		System.out.printf("Remaining Days: %d", p.getYears()*365+p.getMonths()*30+p.getDays());
	}
}
