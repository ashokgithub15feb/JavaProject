package com.durga.program.java8;

import java.util.function.Predicate;

public class PredicateInterfaceTest {

	public static void main(String[] args) {
		
//		Predicate<Integer> b = (Integer I) -> I%2==0;
//		Predicate<Integer> b = (I) -> I%2==0;
		Predicate<Integer> b = I -> I%2==0;
		System.out.println(b.test(10));
		System.out.println(b.test(11));
		System.out.println(b.test(7));
		System.out.println(b.test(9));
		System.out.println("=============");
		
		String[] str = {"Nag","Nageshwar","Ashokyadav","Durdaprashad","Balaih","Sunny"};
//		Predicate<String> p = s -> s.length()>5;
		Predicate<String> p = s -> s.length()%2==0;
		
		for(String st : str)
		{
			if(p.test(st))
			{
				System.out.println(st);
			}
		}
	}
}


interface Inertf1
{
	void m1();
}