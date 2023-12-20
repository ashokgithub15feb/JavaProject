package com.datastructures.company.blackrock;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NonRepeatingCharInString {

	public static void main(String[] args) {

		String str = "GeeksForGeeks";
		System.out.println("Input: "+str);
		Character character1 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(m -> m.getValue() == 1).map(m -> m.getKey()).findFirst().get();

		System.out.println("First Non Repeating Character = "+character1);

		Character character2 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(m -> m.getValue() == 1).map(m -> m.getKey()).skip(1).findFirst().get();

		System.out.println("Second Non Repeating Character = "+character2);

		Character character3 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(m -> m.getValue() == 1).map(m -> m.getKey()).skip(2).findFirst().get();

		System.out.println("Third Non Repeating Character = "+character3);
		
		
		System.out.println("Sort the map in the case of value");
		
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println("Input: "+collect);
		
		LinkedHashMap<Character, Long> collect2 = collect.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Accending Order of Map by value: "+collect2);
		
		LinkedHashMap<Character, Long> collect3 = collect.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue())).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Dessending Order of Map by value: "+collect3);
		
		
		LinkedHashMap<Character, Long> collect4 = collect.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Accending Order of Map by key: "+collect4);
		
		LinkedHashMap<Character, Long> collect5 = collect.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Dessending Order of Map by Key: "+collect5);
		
		
		Character entry = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(f -> f.getValue() == 1).map(m -> m.getKey()).findFirst().get();
		System.out.println(entry);
		
		LinkedHashMap<Character, Long> collect6 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect6);
		Map<Character, Long> collect7 = collect6.entrySet().stream().sorted(Entry.comparingByValue()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		Map<Character, Long> collect8 = collect6.entrySet().stream().sorted(Entry.comparingByKey()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		LinkedHashMap<Character, Long> collect9 = collect6.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue())).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		LinkedHashMap<Character, Long> collect10 = collect6.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByKey())).collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(collect7);
		System.out.println(collect8);
		System.out.println(collect9);
		System.out.println(collect10);
		
	}
	
}
