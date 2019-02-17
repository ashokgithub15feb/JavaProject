package com.durga.program.java8.datetime;

import java.time.Year;

public class CheckLeapYearDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the year:");
		int n = 2020;
		Year y = Year.of(n);
		
		if(y.isLeap())
		{
			System.out.printf("%d is a Leap Year:",n );
		}
		else
		{
			System.out.printf("%d is not a Leap Year:",n );
		}
	}
}
