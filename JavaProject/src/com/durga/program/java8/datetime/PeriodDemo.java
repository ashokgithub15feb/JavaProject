package com.durga.program.java8.datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate birthday = LocalDate.of(1994, 10, 02);
		Period p = Period.between(birthday, today);
		
		System.out.printf("My Age is %d Years, %d Months, %d Days",p.getYears(),p.getMonths(),p.getDays());
		
	}
}
