package com.durga.program.netcraker;

import java.util.ArrayList;
import java.util.Collections;

public class CheckMissingNumber {

	public static void main(String[] args) {
	
		ArrayList<Integer> input = new ArrayList<>();
		
		//here i=1 should be start from 1 other view you will get wrong output
		for(int i=1; i<=30; i++)
		{
			input.add(i);
		}
		System.out.println(input);
		Collections.shuffle(input);
		System.out.println(input);
		System.out.println("Removed Number: "+input.remove(0));
		
		Integer[] it = new Integer[input.size()];
		
		Integer[] array = input.toArray(it);
		System.out.println("Missing Numver: "+missingNumber(array));
		
	}
	
	public static int missingNumber(Integer[] input)
	{
		int totalNumber=0;
		for(int n : input)
		{
			totalNumber = totalNumber + n;
		}
		
		//n*(n+1)/2
		
		int numberSize = input.length +1;
		
		int sumOfNumver = numberSize*(numberSize+1)/2;
		
		return sumOfNumver-totalNumber;
	}
}
