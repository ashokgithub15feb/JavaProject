package com.datastructures.company.epam;

import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {

	public static void main(String[] args) {

		String str = "epam system";

		str.chars().mapToObj(c -> (char) c).filter(f -> (f != ' '))
				.collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting())).entrySet()
				.stream().forEach(f -> System.out.print(f.getKey() + "" + f.getValue()));
		// {a=1, e=2, m=2, p=1, s=2, t=1, y=1}
		//a1e2m2p1s2t1y1
	}
}
