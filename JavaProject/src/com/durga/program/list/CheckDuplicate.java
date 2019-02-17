package com.durga.program.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicate {

	public static void main(String[] args) {
		
		//String[] input = {"One","Two","Three","One"};
		String[] input = {"One","Two","Three"};
		
		System.out.println(duplicateCheckInArray(input));
		System.out.println(duplicateCheckInSet(input));
		System.out.println(duplicateCheckInAddInSetMethod(input));
		
	}

	private static boolean duplicateCheckInAddInSetMethod(String[] input) {
	
		Set<String> set = new HashSet<>();
		
		for(String s : input)
		{
			if(!(set.add(s)))
			{
				return true;
			}
		}
		return false;
	}

	private static boolean duplicateCheckInSet(String[] input) {

		List<String> list = Arrays.asList(input);
		
		Set<String> set = new HashSet<>(list);
		
		if(set.size() < list.size())
		{
			return true;
		}
		
		return false;
	}

	private static boolean duplicateCheckInArray(String[] input) {
		
		for(int i=0; i<input.length ;i++)
		{
			for(int j=0; j<input.length ;j++)
			{
				if(input[i].equals(input[j]) && i != j)
				{
					return true;
				}
			}
		}
		return false;
	}
}
