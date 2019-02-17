package com.durga.program.java8;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class IntPredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(10));
		System.out.println(p.test(new Integer(50)));
		
		Integer ii = 10;
		
		System.out.println(ii.toString());
		
		System.out.println("=======================");
		
		int[] x = {0,5,10,15,20,25,30,35};
		
		Predicate<Integer> p1 = i -> i%2==0;
		for(int x1 : x)
		{
			if(p1.test(x1))
			{
				System.out.println(x1);
			}
		}
		
		System.out.println("=============================================");
		System.out.println("=============================================");
		
		IntPredicate ip = i -> i%2==0;
		for(int x1 : x)
		{
			if(ip.test(x1))
			{
				System.out.println(x1);
			}
		}
		
		
		DoublePredicate dp = i -> i%2 == 0;
		System.out.println(dp.test(15.00));
	}
}
