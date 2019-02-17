package com.durga.program.java8.revies.stream;

import java.util.ArrayList;
import java.util.List;
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
		
		
		Dept d = new Dept("AA", 101);
		Dept d2 = new Dept("CC", 131);
		Dept d3 = new Dept("FF", 191);
		Dept d4 = new Dept("SS", 30);
		Dept d5 = new Dept("NN", 40);
		Dept d6 = new Dept("EE", 11);
		Dept d7 = new Dept("EE", 19);
		Dept d8 = new Dept("EE", 12);
		Dept d9 = new Dept("BB", 12);
		Dept d10 = new Dept("BB", 11);

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

		}).collect(Collectors.toList());
		
		System.out.println(collect5);
	}
}

class Dept
{
	String name;
	int deptId;
	
	Dept(String name, int deptId)
	{
		this.deptId = deptId;
		this.name = name;
	}
	
	public String toString()
	{
		return name+":"+deptId;
	}
	
}