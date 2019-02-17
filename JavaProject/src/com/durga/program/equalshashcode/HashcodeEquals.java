package com.durga.program.equalshashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * https://dzone.com/articles/working-with-hashcode-and-equals-in-java
 * If two objects are equal, they MUST have the same hash code.
 * If two objects have the same hash code, it doesn't mean that they are equal.
 * Overriding equals() alone will make your business fail with hashing data structures like: HashSet, HashMap, HashTable ... etc.
 * Overriding hashcode() alone doesn't force Java to ignore memory addresses when comparing two objects.
 */
public class HashcodeEquals {

	public static void main(String[] args) {

		Student s1 = new Student(1, "Alex");
		Student s2 = new Student(1, "Alex");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println("Checking equality between s1 and s2 using == operator = " + (s1 == s2));
		System.out.println("Checking equality between s1 and s2 = " + s1.equals(s2));

		System.out.println("==============================");

		List<Student> studentsLst = new ArrayList<Student>();
		studentsLst.add(s1);
		studentsLst.add(s2);

		System.out.println("Arraylist size = " + studentsLst.size());
		System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Student(1, "Alex")));

		System.out.println("==============================");

		HashSet<Student> students = new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		System.out.println("HashSet size = " + students.size());
		System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex")));
	}
}
