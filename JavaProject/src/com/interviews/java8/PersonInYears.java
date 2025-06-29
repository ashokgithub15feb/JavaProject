package com.interviews.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//32) Find the age of a person in years if the birthday has given?


public class PersonInYears {

	public static void main(String[] args) {
		
		LocalDate birthDay = LocalDate.of(1986, 10, 15);
		LocalDate date = LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(birthDay, date));
	}
}
