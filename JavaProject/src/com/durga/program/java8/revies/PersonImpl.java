package com.durga.program.java8.revies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class PersonImpl {

	public static void main(String[] args) {
		
		ArrayList<Person> l = new ArrayList<>();
		
		l.add(new Person("Dan", "Rani", 4));
	    l.add(new Person("Andi", "Jon", 2));
	    l.add(new Person("Bob", "Lol", 42));
	    l.add(new Person("Debby", "Dey", 3));
	    l.add(new Person("Bob", "Uri", 72));
	    l.add(new Person("Barry", "Jeshri", 20));
	    l.add(new Person("Cathy", "Soni",40));
	    l.add(new Person("Bob", "Uri", 40));
	    l.add(new Person("Barry", "Blacky", 50));
	    
	    Comparator<Person> sortByFirstName = ((p1, p2) -> p1.getFirstName().compareToIgnoreCase(p2.getFirstName()));
	    Comparator<Person> sortByLastName = ((p1, p2) -> p1.getLastName().compareToIgnoreCase(p2.getLastName()));
	    Comparator<Person> sortByAge = ((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
	    
	   Stream<Person> sorted = l.stream().sorted(sortByFirstName.thenComparing(sortByLastName).thenComparing(sortByAge));
	   
	   sorted.forEach(p -> System.out.println(p));
	    
	   CC1 cc = new CC1();
	   cc.m1();
	   II1.m1();
	}
}

interface II1
{
	public static void m1()
	{
		System.out.println("Static method-II1");
	}
}

class CC1 implements II1
{
	public static void m1()
	{
		System.out.println("Static method-CC1");
	}
}