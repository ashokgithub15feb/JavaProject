package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchDemo {

	private static int i, j;
	
	public static void main(String[] args) {
		
		List<PersonAnyMatch> persons = populateWithData();
		
		persons.stream().forEach(x -> System.out.println(x));
		
		System.out.println("\nanyMatch return whether of this stream match the provided predicate");
		
		System.out.println("anyMatch returned: "+persons.stream().filter(p -> {
				boolean flag = p.getAge() > 25;
				System.out.println("[age>25 filter] pass # "+i++ +" returns: "+flag);
				return flag;
				}).anyMatch(p -> {
		 			boolean flag = p.getCountry().equals("Canada");
		 			System.out.println("[Non Match - Country='Canada'] pass # "+j++ +" returns: "+flag);	
		 			return flag;
		 		}));
		 
	}
	
	public static List<PersonAnyMatch> populateWithData()
	{
		List<PersonAnyMatch> personAnyMatchs = new ArrayList<>();
		personAnyMatchs.add(new PersonAnyMatch("JohnA", "US", 20));
		personAnyMatchs.add(new PersonAnyMatch("JohnB", "Maxico", 25));
		personAnyMatchs.add(new PersonAnyMatch("JohnC", "US", 26));
		personAnyMatchs.add(new PersonAnyMatch("JohnD", "US", 29));
		personAnyMatchs.add(new PersonAnyMatch("JohnE", "Canada", 30));
		
		return personAnyMatchs;
	}
}
