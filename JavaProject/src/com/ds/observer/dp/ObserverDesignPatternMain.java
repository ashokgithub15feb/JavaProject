package com.ds.observer.dp;

import java.util.Enumeration;
import java.util.Vector;

public class ObserverDesignPatternMain {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		ExampDept dept = new ExampDept();
		TranspDept dept2 = new TranspDept();
		
		System.out.println("Present Address: "+student.getAddress());
		
		student.register(dept);
		student.register(dept2);
		student.changedAddress();
		
		System.out.println("UnResister Depart:");
		student.unRegister(dept);
		student.unRegister(dept2);
	}
}

interface MyObserver
{
	void update(Student stud);
}

class ExampDept implements MyObserver
{
	@Override
	public void update(Student stud) {
		
		System.out.println("Student Updated - in Exam Dept");
		System.out.println("New Address: "+stud.getAddress());
	}
	
}

class TranspDept implements MyObserver
{

	@Override
	public void update(Student stud) {
		
		System.out.println("Student Updated - in Transp Dept");
		System.out.println("New Address: "+stud.getAddress());
	}
	
}

class Student
{
	private String address;
	private Vector<MyObserver> myObs;
	
	public Student()
	{
		myObs = new Vector<>();
		address = "Rahulpindi";
	}
	
	public void register(MyObserver obs)
	{
		myObs.addElement(obs);
	}
	
	public void unRegister(MyObserver obs)
	{
		myObs.remove(obs);
	}
	
	private void notifyObs()
	{
		Enumeration<MyObserver> elements = myObs.elements();
		
		while(elements.hasMoreElements())
		{
			elements.nextElement().update(this);
		}
	}
	
	public void changedAddress()
	{
		address = "USA";
		notifyObs();
	}
	
	public String getAddress()
	{
		return address;
	}
}