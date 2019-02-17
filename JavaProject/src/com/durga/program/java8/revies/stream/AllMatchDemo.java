package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.List;

public class AllMatchDemo {

	private static int i;
			
	public static void main(String[] args) {
	
		List<PersonAllMatch> persons = populateWithData();
		persons.stream().forEach(x -> System.out.println(x));
		
		System.out.println();
		
		System.out.println("\nAll Matched: return all element i=of this stream match the provied predicate");
		
		System.out.println("AllMatch Return : "+persons.stream().allMatch( p -> {
			
			boolean flag = p.getCountry().equals("US");
			
			System.out.println("[allMatch - Country='US'] pass # "+(i++)+" | returns: "+flag);
			
			return flag;
		}));
		
	}
	
	public static List<PersonAllMatch> populateWithData()
	{
		List<PersonAllMatch> list = new ArrayList<>();
		
		list.add(new PersonAllMatch("JohnA", "US", 20, 87));
//		list.add(new PersonAllMatch("JohnB", "Maxico", 25, 90));
		list.add(new PersonAllMatch("JohnC", "US", 26, 110));
		list.add(new PersonAllMatch("JohnD", "US", 29, 120));
//		list.add(new PersonAllMatch("JohnE", "Canada", 30, 90));
		
		return list;
	}
}
