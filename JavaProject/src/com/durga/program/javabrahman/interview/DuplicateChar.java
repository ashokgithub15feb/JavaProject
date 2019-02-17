package com.durga.program.javabrahman.interview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateChar {

	public static void main(String[] args) {
		
		String word = "Java versions";
		
		List<String> l = Arrays.asList(word);
		
		Stream<String[]> map = l.stream().map(w -> w.split(""));
		
		Stream<String> flatMap = map.flatMap(Arrays::stream);
		
		Map<String, Long> collect = flatMap.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<Entry<String,Long>> entrySet = collect.entrySet();

		

		Iterator<Entry<String, Long>> iterator = entrySet.iterator();
		
		while(iterator.hasNext())
		{
			Entry<String, Long> next = iterator.next();
			
			if(next.getValue() >= 2)
			{
				System.out.println(next.getKey()+":"+next.getValue());
			}
		}
		
		
		
		Stream<Entry<String,Long>> filter = entrySet.stream().filter(i -> i.getValue() >= 2);//.collect(Collectors.toList()).iterator().next().getKey();
		
		
		
		
		
		
		
	}
}
