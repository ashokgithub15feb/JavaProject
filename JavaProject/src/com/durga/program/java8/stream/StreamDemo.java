package com.durga.program.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(720438949);
		
		System.out.println("Total: "+l);
		
		Stream<Integer> stream = l.stream();
		Stream<Integer> filter = stream.filter(i -> i%2==0);
		List<Integer> collect = filter.collect(Collectors.toList());
		System.out.println("Even: "+collect);
		
		List<Integer> collect2 = l.stream().filter(i -> i%2 !=0).collect(Collectors.toList());
		System.out.println("Odd: "+collect2);
		
		//for every object we need to perform some operation or function - should go for map
		//Mapping - for every student can you add 5 grace marks
		//for every object if we want to perform some function and you want some preserved object then should go for Map
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		List<Integer> updateMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println("Student marks: "+updateMarks);
		
		System.out.println("=======================================");
		
		ArrayList<Integer> studMarks = new ArrayList<>();
		studMarks.add(70);
		studMarks.add(75);
		studMarks.add(60);
		studMarks.add(15);
		studMarks.add(90);
		studMarks.add(25);
		studMarks.add(25);
		studMarks.add(25);
		
		System.out.println(studMarks);
		//number of mailed student in list object
		int noOfFailedStudents = (int) studMarks.stream().filter(i -> (i < 35)).count();
		
		System.out.println(noOfFailedStudents);
		
		Map<Integer, Long> collect3 = studMarks.stream().map(i -> i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("======================================================================+++++++++++++++++++++++++++++++++++++++++");
		collect3.entrySet().forEach(System.out::println);
		System.out.println("======================================================================+++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("=========================================");
		
		ArrayList<Integer> studMark = new ArrayList<>();
		studMark.add(70);
		studMark.add(75);
		studMark.add(60);
		studMark.add(15);
		studMark.add(90);
		studMark.add(25);
		
		List<Integer> sortedOrder = studMark.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedOrder);
		
		System.out.println("==============================================");
		
		ArrayList<Integer> studMarkSort = new ArrayList<>();
		studMarkSort.add(70);
		studMarkSort.add(75);
		studMarkSort.add(60);
		studMarkSort.add(15);
		studMarkSort.add(90);
		studMarkSort.add(25);
		System.out.println(studMarkSort);
		List<Integer> sortedCustOrder = studMarkSort.stream().sorted((I1,I2)-> ((I1 < I2)?1:(I1>I2)?-1:0)).collect(Collectors.toList());
		List<Integer> sortedCustOrder2 = studMarkSort.stream().sorted((I1,I2)-> I1.compareTo(I2)).collect(Collectors.toList());
		System.out.println(sortedCustOrder);
		System.out.println(sortedCustOrder2);
		
		System.out.println("==============================================");
		
		
		ArrayList<String> naturalSorting = new ArrayList<>();
		naturalSorting.add("Anushka");
		naturalSorting.add("Sunny");
		naturalSorting.add("Mallika");
		naturalSorting.add("Kajal");
		naturalSorting.add("Priyanka");
		naturalSorting.add("Malseka");
		naturalSorting.add("Shilpa");
		
		System.out.println(naturalSorting);
		
		List<String> natralSortingOrder = naturalSorting.stream().sorted().collect(Collectors.toList());
		
		System.out.println(natralSortingOrder);
		
		System.out.println("==============================================");
		
		ArrayList<String> cutsSorting = new ArrayList<>();
		cutsSorting.add("Anushka");
		cutsSorting.add("Sunny");
		cutsSorting.add("Mallika");
		cutsSorting.add("Kajal");
		cutsSorting.add("Priyanka");
		cutsSorting.add("Malseka");
		cutsSorting.add("Shilpa");
		
		System.out.println(cutsSorting);
		
		List<String> custSortingOrder = cutsSorting.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		
		System.out.println(custSortingOrder);
		
		System.out.println("=====================Sort bashed on the number of lenght =========================");
		
		ArrayList<String> lstSorting = new ArrayList<>();
		lstSorting.add("Anushka Sharma");
		lstSorting.add("Sunny Leone");
		lstSorting.add("Mallika Sherawt");
		lstSorting.add("Kajal Agarwal");
		lstSorting.add("Priyanka Chopdha");
		lstSorting.add("Twinkal Khana");
		lstSorting.add("Shilpa Shetty");
		
		System.out.println(lstSorting);
		
		/*Comparator<String> c = (s1, s2) ->
		{
			int l1 = s1.length();
			int l2 = s2.length();
			
			return (l1>l2)?1:(l1<l2)?-1:s1.compareTo(s2;
			
		};*/
		
		/*Comparator<String> c = (s1, s2) ->
		{
			int l1 = s1.length();
			int l2 = s2.length();
			
			if(l1>l2)
			{
				return 1;
			}
			else if(l1<l2)
			{
				return -1;
			}
			else
			{
				return s1.compareTo(s2);
			}
		};*/
		
		
		Comparator<String> c = (s1, s2) ->
		{
			return (s1.length()>s2.length())?1:(s1.length()<s2.length())?-1:s1.compareTo(s2);
		};
		
		List<String> lstSortingOrder = lstSorting.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(lstSortingOrder);
		
		
		//[Anushka Sharma, Sunny Leone, Mallika Sherawt, Kajal Agarwal, Priyanka Chopdha, Twinkal Khana, Shilpa Shetty]
		//[Sunny Leone, Kajal Agarwal, Shilpa Shetty, Twinkal Khana, Anushka Sharma, Mallika Sherawt, Priyanka Chopdha]
		//[Sunny Leone, Kajal Agarwal, Shilpa Shetty, Twinkal Khana, Anushka Sharma, Mallika Sherawt, Priyanka Chopdha]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
