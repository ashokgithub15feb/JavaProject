package com.durga.program.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {

public static void main(String[] args) {
		
		/**
		 * Write the function for below requirement
		 * >=80 ==> A[Distinction]
		 * >=60 ==> B[First Class]
		 * >=50 ==> C[Second Class]
		 * >=35 ==> D[Third Class]
		 * >=30 ==> E[Failed]
		 * 
		 * Input Type - StudendClass
		 * Output Type - Grade Type
		 */
		
		
		Function<ClassStudents, String> fun = s -> {
			
			int marks = s.getMarks();
			String grade = "";
			
			Predicate<Integer> p1 = m -> m >= 80;
			Predicate<Integer> p2 = m -> m >= 60;
			Predicate<Integer> p3 = m -> m >= 50;
			Predicate<Integer> p4 = m -> m >= 35;
			
			if(p1.test(marks))
			{
				grade = "A[Distinction]";
			}
			else if(p2.test(marks))
			{
				grade = "B[First Class]";
			}
			else if(p3.test(marks))
			{
				grade = "C[Second Class]";
			}
			else if(p4.test(marks))
			{
				grade = "D[Third Class]";
			}
			else
			{
				grade = "E[failed]";
			}
			
			return grade;
		};
		
		//2-Requirement - if marks >=60
		Predicate<ClassStudents> pred = s -> s.getMarks()>=60;
		
		System.out.println("Printing Student Information\n============================");
		Consumer<ClassStudents> consumer = stud -> 
		{
			System.out.println("Studeny Name: "+stud.getName()+"\nStudeny Marks: "+stud.getMarks()+"\nStudeny Grade: "+fun.apply(stud));
		};
		
		ClassStudents[] studs = {
									new ClassStudents("Durga", 100),
									new ClassStudents("Bunny", 65),
									new ClassStudents("Vinny", 55),
									new ClassStudents("Sunny", 80),
									new ClassStudents("Chinny", 45),
									new ClassStudents("Rinny", 25)
							    };
		
		for(ClassStudents stud : studs)
		{
			if(pred.test(stud))
			{
				consumer.accept(stud);
			}
			System.out.println();
		}
		
	}
}

class ClassStudents
{
	private String name;
	private int marks;
	
	public ClassStudents(String name, int marks) {
		
		this.name= name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}