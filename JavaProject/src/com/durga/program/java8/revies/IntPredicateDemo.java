package com.durga.program.java8.revies;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {
		
		int[] x = {0,5,10,15,20,25,30};
		
		IntPredicate p = i -> i%2 == 0;
		
		for(int x1 : x)
		{
			if(p.test(x1))
			{
				System.out.println(x1);
			}
		}
	}
}
