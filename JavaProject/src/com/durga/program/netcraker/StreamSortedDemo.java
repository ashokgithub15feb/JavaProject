package com.durga.program.netcraker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StreamSortedDemo {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(65);
		l.add(30);
		l.add(25);
		l.add(30);
		l.add(35);
		
		System.out.println(l);
		
		List<Integer> collect = l.stream().filter(i -> i%2 == 0).map(i -> i+20).sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		//Descending order
		List<Integer> collect2 = l.stream().sorted((i1, i2) -> (i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = l.stream().sorted((i1, i2) -> 
		{
			if(i1>i2) {
				return -1;//:(i1<i2)?1:0).collect(Collectors.toList());
			}
			else if(i1<i2)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}).collect(Collectors.toList());
		
		System.out.println(collect3);
		
		
		Dept d = new Dept("AA", 101, 60000);
		Dept d2 = new Dept("CC", 131, 34000);
		Dept d3 = new Dept("FF", 191, 44000);
		Dept d4 = new Dept("SS", 30, 64000);
		Dept d5 = new Dept("NN", 40, 50000);
		Dept d6 = new Dept("EE", 11, 100000);
		Dept d7 = new Dept("EE", 19, 90000);
		Dept d8 = new Dept("EE", 12, 80000);
		Dept d9 = new Dept("BB", 12, 66000);
		Dept d10 = new Dept("BB", 11, 67000);
		Dept d11 = new Dept("BB", 10, 67000);

		ArrayList<Dept> dl = new ArrayList<>();
		dl.add(d);
		dl.add(d2);
		dl.add(d3);
		dl.add(d4);
		dl.add(d5);
		dl.add(d6);
		dl.add(d7);
		dl.add(d8);
		dl.add(d9);
		dl.add(d10);
		dl.add(d11);

		System.out.println(dl);
		System.out.println();
		List<Dept> collect5 = dl.stream().sorted((d1, dd) -> 
		{
			
			String s1 = d1.name;
			String s2 = dd.name;
			
			int compareTo = s1.compareTo(s2);
			
			if(compareTo!=0)
			{
				return -compareTo;
			}
			
			return (d1.deptId > dd.deptId)?-1:(d1.deptId > dd.deptId)?1:0;
//			
//			if(result != 0)
//			{
//				return result;
//			}
			
		//	return (d1.salary > dd.salary)?-1:(d1.salary > dd.salary)?1:0;
			
		}).collect(Collectors.toList());
		
		System.out.println("==============================");
		collect5.stream().forEach(System.out::println);
		System.out.println("==============================");
		List<Integer> ls = new ArrayList<>();
		ls.add(0);
		ls.add(5);
		ls.add(10);
		ls.add(15);
		
		Integer[] ds = (Integer[]) ls.stream().toArray(Integer[]::new);
		
		System.out.println();
		Dept[] df = dl.stream().toArray(Dept[]::new);
		
		for(Dept dw : df)
		{
			System.out.println(dw);
		}
	}
/**
[0, 5, 10, 15, 20, 65, 30, 25, 30, 35]
[20, 30, 40, 50, 50]
[65, 35, 30, 30, 25, 20, 15, 10, 5, 0]
[65, 35, 30, 30, 25, 20, 15, 10, 5, 0]
[AA:101, CC:131, FF:191, SS:30, NN:40, EE:11, EE:19, EE:12, BB:12, BB:11]
[SS:30, NN:40, FF:191, EE:19, EE:12, EE:11, CC:131, BB:12, BB:11, AA:101]
*/
}


class Dept
{
	String name;
	int deptId;
	double salary;
	
	Dept(String name, int deptId, double salary)
	{
		this.deptId = deptId;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return name+":"+deptId+":"+salary;
	}
	
}