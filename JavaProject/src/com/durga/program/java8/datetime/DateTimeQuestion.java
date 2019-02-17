package com.durga.program.java8.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateTimeQuestion {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2018, 11, 1); //32 days java.time.DateTimeException
		date = date.plusDays(8);
		System.out.println(date);
		
		LocalDate parse = LocalDate.parse("2018-11-22");//.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(parse.format(DateTimeFormatter.ISO_DATE));
		
		
//		ArrayList<String> l = new ArrayList<>()
//				{
//					we can use in 1.9 v
//				};
		
		
		List<String> l1 = Arrays.asList("A", "B");
		List<String> l2 = Arrays.asList("C", "D");
		m1(l1, l2);
	}
	
	public void m1(int ... s)
	{
		
	}
	
	public void m1(Object ... s)
	{
		
	}
	
	@SafeVarargs
	public static void m1(List<String> ... s)
	{
		//Type safety: Potential heap pollution via varargs parameter s
	}
}

interface III
{
	void test();
	public void test1();
	default void test2() {}
	static void test3() {}
//	private void test4(); 1.9 versionis possible
//	private void test5() {};
	
	
	
}