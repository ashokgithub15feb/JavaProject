package com.durga.program.java8.revies;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentMarksDemo {

	public static void main(String[] args) {
		
		Function<Student, String> f = stud ->
		{
			int marks = stud.marks;
			String grade ="";
			
			if(marks >= 80)
			{
				grade = "A[D]";
			}else if(marks >= 60)
			{
				grade = "B[FC]";
			} else if(marks >= 50)
			{
				grade = "C[SC]";
			}else if(marks >= 35)
			{
				grade = "D[TC]";
			}
			else
			{
				grade = "failed";
			}
			
			return grade;
		};
		System.out.println(f.apply(new Student("Ashok", 71))+"\n");
		
		Predicate<Student> p = s -> s.marks >= 60;
		
		Consumer<Student> c = s -> {
			
			System.out.print(s.name+" : "+s.marks+" : ");
			System.out.print(f.apply(s));
			System.out.println();
			
		};
		
		Student[] arr = {new Student("Durga", 100),
						 new Student("Sunny", 65),
						 new Student("Chinny", 55),
						 new Student("Bunny", 45),
						 new Student("Vinny", 25),};

		for(Student s : arr)
		{
			if(p.test(s))
			{
				c.accept(s);
			}
		}
		
		Consumer<String> ss = cc -> System.out.println("A: "+cc.length());
		ss.accept("A");
	}
}

class Student
{
	String name;
	int marks;
	
	Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}
}
