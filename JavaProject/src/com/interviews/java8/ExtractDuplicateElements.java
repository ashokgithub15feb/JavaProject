package com.interviews.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//25) How do you extract duplicate elements from an array?


public class ExtractDuplicateElements {

	public static void main(String[] args) {
		
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        
        System.out.println("Original: "+listOfIntegers);
        
        listOfIntegers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        
//        Map<Integer, Long> collect = listOfIntegers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        
//        System.out.println(collect);
        
//        Optional<Entry<Integer, Long>> optional = collect.entrySet().stream().max(Map.Entry.comparingByValue());
//        
//        Entry<Integer, Long> entry = optional.get();
//        
//        System.out.println("Duplicate: Key: "+entry);
	}
}
