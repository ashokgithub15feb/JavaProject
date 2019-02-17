package com.durga.program.java8;

public class Student {

	private String name;
	private int rollno;
	private int pocketMoney;
	
	public int getPocketMoney() {
		return pocketMoney;
	}

	public void setPocketMoney(int pocketMoney) {
		this.pocketMoney = pocketMoney;
	}

	public Student(String name, int rollno, int pocketMoney)
	{
		this.name = name;
		this.rollno = rollno;
		this.pocketMoney = pocketMoney;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
}
