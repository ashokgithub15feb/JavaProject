package com.datastructures.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InsertNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 6, 3, 5, 7);

		Optional<Integer> res = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).findFirst();
		if (res.isPresent()) {
			//System.out.println(res.get());
		}
	}
}
