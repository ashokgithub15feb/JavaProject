package com.durga.program.java8.revies;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(15));
		
		System.out.println();
		
		Predicate<String> ps = s -> s.length() > 5;
		System.out.println(ps.test("Ashok Kumar"));
		
		System.out.println();
		
		String[] strArr = {"Nag","Chiranjeevi","Venkatesth","Balaish", "Sunny", "Katrina"};
		
		Predicate<String> psa = s -> s.length() > 5;
		
		for(String s : strArr)
		{
			if(psa.test(s))
			{
				System.out.println(s);
			}
		}
	} 
}
