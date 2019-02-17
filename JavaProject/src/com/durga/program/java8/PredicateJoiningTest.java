package com.durga.program.java8;

import java.util.function.Predicate;

public class PredicateJoiningTest {

	public static void main(String[] args) {
		
		int[] x = {0,5,10,15,20,25,30,35};
		
		Predicate<Integer> p1 = i -> i%2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		
		System.out.println("The Number which are even and >(greater then) 10");
		
		for(int x1: x)
		{
			if(p1.and(p2).test(x1))
			{
				System.out.println(x1);
			}
		}
		
		System.out.println("The Number which are even or > 10");
		
		for(int x1 : x)
		{
			if(p1.or(p2).test(x1))
			{
				System.out.println(x1);
			}
		}
		
		System.out.println("The number which are even");
		
		for(int x1 : x)
		{
			if(p1.test(x1))
			{
				System.out.println(x1);
			}
		}
		
		System.out.println("The Number which are > 10");
		
		for(int x1 : x)
		{
			if(p2.test(x1))
			{
				System.out.println(x1);
			}
		}
		
		System.out.println("The number which are not even");
		
		for(int x1 : x)
		{
			if(p1.negate().test(x1))
			{
				System.out.println(x1);
			}
		}
	}
}
