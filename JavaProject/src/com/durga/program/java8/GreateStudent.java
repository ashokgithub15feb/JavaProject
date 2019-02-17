package com.durga.program.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class GreateStudent {

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
		
		
		Function<ClassStudent, String> fun = s -> {
			
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
			
			/*if(marks >= 80)
			{
				grade = "A[Distinction]";
			}
			else if(marks >= 60)
			{
				grade = "B[First Class]";
			}
			else if(marks >= 50)
			{
				grade = "C[Second Class]";
			}
			else if(marks >= 35)
			{
				grade = "D[Third Class]";
			}
			else
			{
				grade = "E[failed]";
			}
			
			return grade;*/
		};
		
		//2-Requirement - if marks >=60
		
		Predicate<ClassStudent> pred = s -> s.getMarks()>=60;
		
		ClassStudent[] studs = {new ClassStudent("Durga", 100),
								new ClassStudent("Bunny", 65),
								new ClassStudent("Vinny", 55),
								new ClassStudent("Sunny", 80),
								new ClassStudent("Chinny", 45),
								new ClassStudent("Rinny", 25)};
		
		for(ClassStudent stud : studs)
		{
			if(pred.test(stud))
			{
				System.out.println("Studeny Name: "+stud.getName()+"\nStudeny Marks: "+stud.getMarks()+"\nStudeny Grade: "+fun.apply(stud));
			}
			System.out.println();
		}
		
	}
}

class ClassStudent
{
	private String name;
	private int marks;
	
	public ClassStudent(String name, int marks) {
		
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