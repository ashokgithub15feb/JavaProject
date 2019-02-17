package com.ds.iq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStrng {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("as");
		l.add("ah");
		l.add("es");
		l.add("dd");
		l.add("re");
		l.add("ac");
		l.add("as");
		l.add("as");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String s : l)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		map.entrySet().forEach(System.out::println);
		System.out.println();
		Map<String, Long> collect = l.stream().
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().forEach(System.out::println);
		System.out.println();
		collect.entrySet().forEach( key -> {
			
			if(key.getValue()>1)
			{
				System.out.println(key.getKey()+":"+key.getValue());
			}
		});
		
	}
}
