package com.durga.program.oops;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringFindTheFirstNonRepeatableCharacter {

	 String ff = "dd";
	
	void m1() {
		System.out.println(ff);
	}
	
	public static void main(String[] args) {
		
	//	System.out.println(StringFindTheFirstNonRepeatableCharacter.ff);
		String s = "nzzzzbbbccccddehhhhiii";
				
		char[] charArray = getChar(s);
		
		char ch = charArray[0];
		int count = 1;
		
		for(int i=1; i<charArray.length ; i++)
		{
			if(ch == charArray[i])
			{
				count++;
			}
			else if(count == 1)
			{
				System.out.println("Non Repeatable character: "+ch);
				ch = charArray[i];
				count = 1;
			}
			else
			{
				ch = charArray[i];
				count = 1;
			}
		}
		
		if(count == 1)
		{
			System.out.println("Last Non Repetable Character: "+ch);
		}
		
		System.out.println(String.class.getClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(StringFindTheFirstNonRepeatableCharacter.class.getClassLoader());
		
		
		s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(entry -> entry.getValue() == 1).map(key -> key.getKey()).limit(1).collect(Collectors.toList()).forEach(System.out::println);
		
		
		int n = 10;
		
		Optional<int[]> orElse = Stream.iterate(new int[] {0, 1}, f -> new int[] {f[0], f[0] + f[1]}).limit(n + 1).map(m -> m).reduce((first, second) -> second);
		
		int[] is = orElse.get();
		
		
		System.out.println(orElse.isPresent() ? is[0] : orElse.isEmpty());
		
	}
	
	public static char[] getChar(String s)
	{
		return s.toCharArray();
	}
}
