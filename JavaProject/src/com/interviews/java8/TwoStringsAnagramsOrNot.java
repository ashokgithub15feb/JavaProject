package com.interviews.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//12) Java 8 program to check if two strings are anagrams or not?


public class TwoStringsAnagramsOrNot {

	public static void main(String[] args) {
		
		String s1 = "RaceCar";
        String s2 = "CarRace";
        
        System.out.println("Original: s1: "+s1+", s2: "+s2 );
        
        String collect = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String collect2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        
        if(collect.equals(collect2)) {
        	System.out.println("Two string are anagrams");
        } else {
        	System.out.println("Two string are not anagrams");
        }
	}
}
