package com.ds.string;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class LongestSubstringUniqueChar {

	public static void main(String[] args) {
		
		String s = "pwwkew";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		int maxLength = 0;
		
		int i=0; 
		
		int j = 0;
		
		while(j < s.length())
		{
			if(!set.contains(s.charAt(j)))
			{
				set.add(s.charAt(j));
				j++;
				
				maxLength = Math.max(maxLength, j-i);
			}
			else
			{
				set.remove(s.charAt(j));
				i++;
			}
		}
		
		set.stream().collect(Collectors.toSet()).forEach(System.out::print);
		System.out.println();
		System.out.println("Unique Characte is: "+set+" Max Length is: "+maxLength);
	}
}
