package com.java8.lambdaexp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremTest {

	public static void main(String[] args) {

		Map<String, List<String>> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		list.add("APSP");
		list.add("WEB");
		list.add("DER");
		map.put("regionName", list);

		final StringBuilder sb = new StringBuilder();

//		for(List<String> val : map.values())
//		{
//			for(String s : val)
//			{
//				sb.append("'").append(s).append("'").append(",");
//			}
//		}

		System.out.println(map);
		Collection<List<String>> values = map.values();

		Stream<List<String>> stream = values.stream();

		String collect2 = stream.flatMap(List::stream).peek(s -> System.out.println("1st Stream : " + s))
				.collect(Collectors.toSet()).stream().peek(s -> System.out.println("2nd Stream : " + s))
				.map(s -> sb.append("'").append(s).append("'").append(","))
				.peek(s -> System.out.println("3rd Stream : " + s)).collect(Collectors.joining());
		System.out.println(collect2);

	}
}
