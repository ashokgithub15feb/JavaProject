package com.ds.program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseOfStringDemo {

	public static void main(String[] args)
	{
		String input = "Ashok Kumar Yadav";
		
		String reverse = reverse(input);
		System.out.println(input);
		System.out.println(reverse);
		
		String reverseWord = reverserecu(input);
		System.out.println(reverseWord);
		
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse());
		
		removeWhiteSpace(input);
		
		findDuplicateChar(input);
		
		String randomStr = "Kumar Yadav Ashok";
		checkAnagarm(input, randomStr );
		
		reverWord(input);
		
		reverStringOfWord(input);
		
		input = "i am Ashok";
		revStringPreservingSpace(input);
		
		input = "javaconceptoftheday";
		
		longestSubstring(input);
		
		String f1 = "Ashok";
		String f2 = "Yadav";
		
		swapTwoString(f1, f2);
		
		input = "ABCD";
		allPermutations(input);
	}

	private static void allPermutations(String input) {

		permutation("", input);
	}

	private static void permutation(String permutation, String input) {
		
		if(input.length() == 0)
		{
			System.out.println(permutation);
		}
		else
		{
			for(int i=0; i<input.length();i++)
			{
				permutation(permutation+input.charAt(i), input.substring(0, i)+input.substring(i+1, input.length()));
			}
		}
	}

	private static void swapTwoString(String f1, String f2) {
		
		System.out.println(f1);
		System.out.println(f2);
		
		f1 = f1+f2;
		f2 = f1.substring(0, f1.length()-f2.length());
		f1 = f1.substring(f2.length());
		
		System.out.println(f1);
		System.out.println(f2);
		
	}

	private static void longestSubstring(String input) {
		
		char[] ch = input.toCharArray();
		
		String longestSubString = "";
		
		int logestSubStringLen = 0;
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<ch.length;i++)
		{
			char ch1 = ch[i];
			
			if(!map.containsKey(ch1))
			{
				map.put(ch1, i);
			}else
			{
				i = map.get(ch1);
				map.clear();
			}
			
			if(map.size() > logestSubStringLen)
			{
				logestSubStringLen = map.size();
				
				longestSubString = map.keySet().toString();
			}
		}
		
		System.out.println(input);
		System.out.println(longestSubString);
		System.out.println(logestSubStringLen);
			
	}

	private static void revStringPreservingSpace(String input) {
		
		char[] ch1 = input.toCharArray();
		char[] ch2 = new char[ch1.length];
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i] == ' ')
			{
				ch2[i] = ' ';
			}
			
		}
		int j = ch1.length-1;
		
		for(int i=0; i<input.length();i++)
		{
			
			if(ch1[i] != ' ')
			{
				if(ch2[j] == ' ')
				{
					j--;
				}
				
				ch2[j] = ch1[i];
				
				j--;
			}
		}
		System.out.println(input);
		System.out.println(String.valueOf(ch2));
	}

	private static void reverStringOfWord(String input) {

		String[] split = input.split(" ");
		String revString = "";
		
		for(int i=split.length-1;i>=0;i--)
		{
			String word = split[i];
			
			String revWrod = "";
			
			for(int j=0;j<word.length();j++)
			{
				revWrod = revWrod + word.charAt(j);
			}
			
			revString = revString + revWrod+" ";
		}
		System.out.println(revString);
	}

	private static void reverWord(String input) {
		
		String[] split = input.split(" ");
		
		String revString = "";
		
		for(int i=0; i<split.length; i++)
		{
			String word = split[i];
			
			String revWord = "";
			
			for(int j = word.length()-1;j>=0;j--)
			{
				revWord = revWord + word.charAt(j);
			}
			
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
	}

	private static void checkAnagarm(String input, String randomStr) {
		
		char[] ch1 = input.replaceAll("\\s", "").toCharArray();
		char[] ch2 = randomStr.replaceAll("\\s", "").toCharArray();
		
		boolean flag = true;
		
		if(ch1.length != ch2.length)
		{
			flag = false;
		}
		else
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			flag = Arrays.equals(ch1, ch2);
		}
		
		if(flag)
		{
			System.out.println("String is Anaglram");
		}
		else
		{
			System.out.println("String is not a Anagram");
		}
	}

	private static void findDuplicateChar(String input) {

		Stream<String> of = Stream.of(input);
		Map<String, Long> collect = of.map(str -> str.replaceAll("\\s", "").split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		collect.entrySet().forEach(System.out::println);
		
	}

	private static void removeWhiteSpace(String input) {

		char[] ch = input.toCharArray();
		String tmp = "";
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i] == ' ')
			{
				continue;
			}
			else
			{
				tmp = tmp + ch[i];
			}
		}
		System.out.println(tmp);
	}

	private static String reverserecu(String input) {

		if(input == null || input.length() == 1)
		{
			return input;
		}
		
		return reverserecu(input.substring(1))+input.charAt(0);
		
	}

	private static String reverse(String input) {
		
		if(input.isEmpty())
		{
			return "";
		}
		
		return reverse(input.substring(1))+input.charAt(0);
	}
}
