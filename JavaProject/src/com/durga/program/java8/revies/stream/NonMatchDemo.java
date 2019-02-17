package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.List;

public class NonMatchDemo {

	private static int i, j;
	
	public static void main(String[] args) {
		
		
		List<PersonNonMatch> persons = populateWithData();
		persons.stream().forEach(x -> System.out.println(x));
		
		System.out.println("\nnonMatch return whether of this stream match the provided predicate");
		
		System.out.println("nonMatch returned: "+persons.stream().filter(p -> {
				boolean flag = p.getAge() > 25;
				System.out.println("[age>25 filter] pass # "+i++ +" returns: "+flag);
				return flag;
				}).noneMatch(p -> {
		 			boolean flag = p.getCountry().equals("Japan");
		 			System.out.println("[Non Match - Country='Japan'] pass # "+j++ +" returns: "+flag);	
		 			return flag;
		 		}));
		 
	}
	
	
	public static List<PersonNonMatch> populateWithData()
	{
		List<PersonNonMatch> personNonMatchs = new ArrayList<>();
		personNonMatchs.add(new PersonNonMatch("JohnA", "US", 20));
		personNonMatchs.add(new PersonNonMatch("JohnB", "Maxico", 25));
		personNonMatchs.add(new PersonNonMatch("JohnC", "US", 26));
		personNonMatchs.add(new PersonNonMatch("JohnD", "US", 29));
		personNonMatchs.add(new PersonNonMatch("JohnE", "Canada", 30));
		
		return personNonMatchs;
	}
}
