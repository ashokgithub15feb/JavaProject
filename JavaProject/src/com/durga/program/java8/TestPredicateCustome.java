package com.durga.program.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicateCustome {

	public static void main(String[] args) {
		
		ArrayList<Student> l = new ArrayList<>();
		l.add(new Student("Durga", 30001, 5000));
		l.add(new Student("Shiva", 30003, 6000));
		l.add(new Student("Mukesh", 30003, 4000));
		l.add(new Student("Sagar", 30002, 10000));
		l.add(new Student("Adarsh", 30008, 8000));
		l.add(new Student("ravi", 30009, 7000));
		
		//Multiple condition
		Predicate<Student> p = s -> s.getPocketMoney() > 5000 && s.getName().length() > 5 && s.getRollno()>30001;
		
		for(Student stud : l)
		{
			if(p.test(stud))
			{
				System.out.println("Student Roll Number: "+stud.getRollno()+"\nName of Student: "+stud.getName()+"\nPocket Money: "+stud.getPocketMoney());
			}
		}
	}
}
