package com.interviews.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//17) How do you find common elements between two arrays?


public class CommonElementsBetweenTwoArrays {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        
        System.out.println("Original:\n"+list1+"\n"+list2+"\n");
        
        List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(collect);
	}
}
