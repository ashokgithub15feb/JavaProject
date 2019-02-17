package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverCollection {

	public static void main(String[] args) {
		
		List<PersonCollection> persons = populateWithData();
		System.out.println("=========use Collectors.toList() in order to obtain the list of US Based person===========");
		
		persons.stream().filter((PersonCollection p) -> p.getCountry().equals("US"))
						.collect(Collectors.toList()).forEach(x -> System.out.println(x));
		System.out.println();
		Map<String, List<PersonCollection>> personFromCuntryBased = persons.stream().collect(Collectors.groupingBy((PersonCollection p) -> p.getCountry(), Collectors.toList()));
		System.out.println(personFromCuntryBased);
		System.out.println();
		
		personFromCuntryBased.entrySet().forEach(p -> System.out.println(p));
		
		System.out.println();
		System.out.println("=========use Collectors.toSet() in order to obtain the list of US Based person===========");

		persons.stream().filter((PersonCollection p) -> p.getCountry().equals("US"))
		.collect(Collectors.toSet()).forEach(x -> System.out.println(x));

		Map<String, Set<PersonCollection>> uniquePerson = persons.stream()
																 .collect(Collectors.groupingBy((PersonCollection p) -> p.getCountry(), 
																		 Collectors.toSet()));
		System.out.println(uniquePerson);
		
		uniquePerson.entrySet().forEach(p -> System.out.println(p));
		System.out.println();
		System.out.println("==============use Collectors.toCollection() s================");
		
		ArrayList<PersonCollection> listOfPerson = persons.stream().filter((PersonCollection p) -> p.getCountry().equals("US"))
						.collect(Collectors.toCollection(() -> new ArrayList<>()));
		
		System.out.println(listOfPerson);
		
		System.out.println("===========using ArrayList::new===============");
		Map<String, ArrayList<PersonCollection>> mapListOfPersonFromCountry = persons.stream().collect(Collectors.groupingBy(p -> p.getCountry(), 
				Collectors.toCollection(ArrayList::new)));
		
		System.out.println(mapListOfPersonFromCountry);
		
		mapListOfPersonFromCountry.entrySet().forEach(x -> System.out.println(x));
		
		System.out.println();
		System.out.println("===========using Vector::new===============");
		Map<String, Vector<PersonCollection>> mapVectorOfPersonFromCountry = persons.stream().collect(Collectors.groupingBy(p -> p.getCountry(), 
				Collectors.toCollection(Vector::new)));
		
		System.out.println(mapVectorOfPersonFromCountry);
		
		mapVectorOfPersonFromCountry.entrySet().forEach(x -> System.out.println(x));
		
		System.out.println();
		System.out.println("===========using stack::new===============");
		Map<String, Stack<PersonCollection>> mapStackOfPersonFromCountry = persons.stream().collect(Collectors.groupingBy(p -> p.getCountry(), 
				Collectors.toCollection(Stack::new)));
		
		System.out.println(mapStackOfPersonFromCountry);
		
		mapStackOfPersonFromCountry.entrySet().forEach(x -> System.out.println(x));
		
		System.out.println();
		System.out.println("===========using HashSet::new===============");
		Map<String, HashSet<PersonCollection>> mapHashSetOfPersonFromCountry = persons.stream().collect(Collectors.groupingBy(p -> p.getCountry(), 
				Collectors.toCollection(HashSet::new)));
		
		System.out.println(mapHashSetOfPersonFromCountry);
		
		mapHashSetOfPersonFromCountry.entrySet().forEach(x -> System.out.println(x));
		
		
		System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		String input = "I love java programming";
		
		List<String> asList = Arrays.asList(input);
		
		Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		collect.entrySet().stream().forEach(System.out::println);
		
		System.out.println("-==-=-=-=-=-=-=-=-=-=-000000000000=-=-=-=-=-=-=-=-=-=-=-");
		
		Map<String, Long> collect1 = asList.stream().map(mapper -> mapper.split(" ")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		collect1.entrySet().stream().forEach(System.out::println);
		System.out.println("-==-=-=-=-=-=-=-=-=-=-000000000000=-=-=-=-=-=-=-=-=-=-=-");
		Map<String, Long> collect2 = asList.stream().map(mapper -> mapper.trim().split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		collect2.entrySet().stream().forEach(System.out::println);
		System.out.println("-==-=-=-=-=-=-=-=-=-=-000000000000=-=-=-=-=-=-=-=-=-=-=-");
		
		Map<String, Long> collect3 = asList.stream().map(mapper -> mapper.trim().replaceAll("\\s", "").split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect3.entrySet().stream().forEach(System.out::println);
		
		System.out.println("909090090909090900000000000000000000000000000000000");
		
		Stream<String> of = Stream.of(input);
		
//		Map<String, Long> collect4 = of.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		
//		collect4.entrySet().stream().forEach(System.out::println);
		
		System.out.println("-==-=-=-=-=-=-=-=-=-=-000000000000=-=-=-=-=-=-=-=-=-=-=-");
		
//		Map<String, Long> collect5 = of.map(mapper -> mapper.split(" ")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		
//		collect5.entrySet().stream().forEach(System.out::println);
//		System.out.println("-==-=-=-=-=-=-=-=-=-=-000000000000=-=-=-=-=-=-=-=-=-=-=-");
//		Map<String, Long> collect6 = of.map(mapper -> mapper.trim().split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		
//		collect6.entrySet().stream().forEach(System.out::println);
		System.out.println("-==-=-=-=-=-=-=-=-=-=-000000000000=-=-=-=-=-=-=-=-=-=-=-");
		
		Map<String, Long> collect7 = of.map(mapper -> mapper.trim().replaceAll("\\s", "").split("")).flatMap(Arrays::stream).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect7.entrySet().stream().forEach(System.out::println);
		
	}
	
	
	public static List<PersonCollection> populateWithData()
	{
		List<PersonCollection> persons = new ArrayList<>();
		
		persons.add(new PersonCollection("JohnA","US"));
		persons.add(new PersonCollection("JohnB","US"));
		persons.add(new PersonCollection("JohnC","Canada"));
		persons.add(new PersonCollection("JohnD","US"));
		persons.add(new PersonCollection("JohnE","Canada"));
		persons.add(new PersonCollection("JohnF","US"));
		persons.add(new PersonCollection("JohnA","US"));
		persons.add(new PersonCollection("JohnE","Canada"));
		
		return persons;
	}
}
