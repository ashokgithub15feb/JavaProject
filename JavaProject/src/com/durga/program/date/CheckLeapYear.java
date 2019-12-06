package com.durga.program.date;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		int year = 2020;
		
		boolean isLeap = false;
		
		if(year % 400 == 0)
		{
			isLeap = true;
		}
		else if(year % 100 == 0)
		{
			isLeap = true;
		}
		else if(year % 4 == 0)
		{
			isLeap = true;
		}
		else
		{
			isLeap = false;
		}
		
		if(isLeap)
		{
			System.out.println("Is Leap Year: "+year);
		}
		else
		{
			System.out.println("Is not a Leap Year: "+year);
		}
	}
}
