package com.durga.program.java8;


class Student1
{
	String name;
	int rno;
	int marks;
	int age;
	
	public Student1(String name, int rno, int marks, int age) {
		
		this.name = name;
		this.rno = rno;
		this.marks = marks;
		this.age = age;
			
		System.out.println(name+":"+rno+":"+marks+":"+age);
	}
}

interface Studdent1Interface
{
	public Student1 get(String name, int rno, int marks, int age);
}


class Sample
{
	Sample(String s)
	{
		System.out.println("Sample class constructor execution with argument.......");
	}
	
	Sample()
	{
		System.out.println("NO argument.......");
	}
}
interface ConstInterface
{
	public Sample get(String s);
}
public class ConstractorReferenceDemo {

	public static void main(String[] args) {
		
		ConstInterface i = Sample::new;
		Sample s1 = i.get("Ashok");
		Sample s2 = i.get("Ashok");
		Sample s3 = i.get("Ashok");
		Sample s4 = i.get("Ashok");
		Sample s5 = i.get("Ashok");
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		
		System.out.println("===========================");
		
		Studdent1Interface si = (name, rno, marks, age) -> new Student1(name, rno, marks, age);
		
		si.get("Ashok", 10001, 85, 27);
		si.get("Durga", 10002, 95, 36);
		si.get("Ravi", 10003, 55, 32);
		si.get("Shiva", 1004, 65, 23);
		
	}
}
