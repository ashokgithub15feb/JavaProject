package com.datastructures.company.blackrock;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReadOccuranceCharacter {

	public static void main(String[] args) throws IOException {
		
		Map<String, Long> collect = Files.lines(Paths.get("C:\\Users\\Asok\\OneDrive\\Documents\\MNBM.txt"))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);
		
		Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Asok\\OneDrive\\Documents\\MNBM.txt"));
		
		Map<Stream<Character>, Long> collect2 = lines.filter(f -> !f.isEmpty()).map(m -> m.chars().mapToObj(c -> (char) c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		collect2.entrySet().stream().map(Entry::getKey).collect(Collectors.toList()).forEach(f -> f.findFirst());
	}
}
