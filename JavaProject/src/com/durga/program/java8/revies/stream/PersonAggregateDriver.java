package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonAggregateDriver {

	public static void main(String[] args) {
		
		List<PersonAggregate> persons = populateWithData();
		System.out.println("======Obtain US and non US based person using partitioningBy abd groupingBy=======");
		Map<Boolean, List<PersonAggregate>> partitionMap = persons.stream().collect(Collectors.partitioningBy((PersonAggregate p) -> p.getCountry().equals("US")));
		
		System.out.println(partitionMap);
		//{false=[PersonAggregate [name=Person-4, country=Brazil], 
		//        PersonAggregate [name=Person-6, country=London], 
		//		  PersonAggregate [name=Person-8, country=Germany], 
		//        PersonAggregate [name=Person-7, country=Brazil]], 
		// true=[PersonAggregate [name=Person-1, country=US], 
		//       PersonAggregate [name=Person-2, country=US], 
		//       PersonAggregate [name=Person-3, country=US], 
		//       PersonAggregate [name=Person-5, country=US]]}

		//{false=[Person-4, Person-6, Person-8, Person-7], - non US
		// true=[Person-1, Person-2, Person-3, Person-5]} - US
		System.out.println();
		Map<Boolean, List<PersonAggregate>> groupingMap = persons.stream().collect(Collectors.groupingBy((PersonAggregate p) -> p.getCountry().equals("US")));
		System.out.println(groupingMap);
		
		
		System.out.println("=========count US and non US based person using partitioningBy abd groupingBy ============");
		Map<Boolean, Long> countByPartitiningBy = persons.stream().collect(Collectors.partitioningBy((PersonAggregate p) -> p.getCountry().equals("US"), 
																		   Collectors.counting()));
		
		Map<Boolean, Long> countByGroupingBy = persons.stream().collect(Collectors.groupingBy((PersonAggregate p) -> p.getCountry().equals("US"), 
				                                                        Collectors.counting()));
		System.out.println(countByPartitiningBy);
		System.out.println(countByGroupingBy);
		
		//{false=5, true=4}
		//{false=5, true=4}
		
		System.out.println("=========obtain the persons in each country and count them using groupingBy============");
		Map<String, List<PersonAggregate>> countryMap = persons.stream().collect(Collectors.groupingBy((PersonAggregate p) -> p.getCountry()));
		Map<String, Long> countryCount = persons.stream().collect(Collectors.groupingBy((PersonAggregate p) -> p.getCountry(), Collectors.counting()));
		
		System.out.println(countryMap);
		System.out.println(countryCount);
		
		//{London=[Person-6], Brazil=[Person-4, Person-7], Paris=[Person-9], Germany=[Person-8], US=[Person-1, Person-2, Person-3, Person-5]}
		// {London=1, Brazil=2, Paris=1, Germany=1, US=4}
		
		System.out.println("==============Obtain US and non US based person using partitioningBy  and map names to uppercase usinf mapping================");
		
		Map<Boolean, List<String>> partiningByMapNameInUpperCase = persons.stream().collect(Collectors.partitioningBy((PersonAggregate p) -> p.getCountry().equals("US"), Collectors.mapping((PersonAggregate p) -> p.getName().toUpperCase(), Collectors.toList())));
		System.out.println(partiningByMapNameInUpperCase);
		
		System.out.println("==============Obtain US and non US based person using groupingBy  and map names to uppercase usinf mapping================");
		
		Map<String, List<String>> groupingByMapCountryInUpperCase = persons.stream().collect(Collectors.groupingBy((PersonAggregate p) -> p.getCountry(), 
																						   Collectors.mapping((PersonAggregate p) -> p.getName().toUpperCase(), 
																						   Collectors.toList())));
		System.out.println(groupingByMapCountryInUpperCase);
		
		
		System.out.println("===========using <A> A[] toArray(IntFuncation<A[]> generator) method===============");
		
		PersonAggregate[] aggregates = persons.stream().toArray(PersonAggregate[]::new);
		Arrays.asList(aggregates).forEach(s -> System.out.println(s.getCountry()));
		
		System.out.println("===========usnig object[] toArray() method============");
		
		Object[] array = persons.stream().toArray();
		
		Arrays.asList(array).forEach(x -> System.out.println(((PersonAggregate)x).getCountry()));
	}
	
	public static List<PersonAggregate> populateWithData()
	{
		List<PersonAggregate> persons = new ArrayList<>();
		
		persons.add(new PersonAggregate("Person-1","US"));
		persons.add(new PersonAggregate("Person-2","US"));
		persons.add(new PersonAggregate("Person-4","Brazil"));
		persons.add(new PersonAggregate("Person-3","US"));
		persons.add(new PersonAggregate("Person-6","London"));
		persons.add(new PersonAggregate("Person-5","US"));
		persons.add(new PersonAggregate("Person-8","Germany"));
		persons.add(new PersonAggregate("Person-7","Brazil"));
		persons.add(new PersonAggregate("Person-9","Paris"));
		
		
		
		return persons;
	}
}
