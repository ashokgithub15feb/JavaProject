package com.datastructures.custom;

public class HashSetCustom<E> {

	private final Object PRESENT = new Object();
	
	private HashMapCustom<E, Object> hashMapCustom;
	
	public HashSetCustom() {
		hashMapCustom = new HashMapCustom<E, Object>();
	}
	
	public void add(E value) {
		hashMapCustom.put(value, PRESENT);
	}
	
	public boolean remove(E obj) {
		return hashMapCustom.remove(obj);
	}
	
	public void display() {
		hashMapCustom.displayKey();
	}
	
	public boolean contains(E obj) {
		return hashMapCustom.contains(obj) ? true : false;
	}
	
	public static void main(String[] args) {

		HashSetCustom<Integer> set = new HashSetCustom<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		set.add(110);
		set.add(210);
		set.add(310);
		set.add(110);
		set.add(410);
		
		set.display();
		System.out.println();
		set.remove(110);
		set.display();
		System.out.println();
		if(set.contains(40)) {
			set.remove(40);
			set.display();
		}
	}
}

class A
{
	void m1() {
		
	}
}

class B extends A
{
	void m1() {
		
	}
}

class C extends A{
	void m1() {
		
	}
}


interface Ai
{
	void m1();
}

interface Bi extends Ai
{
	void m1();
}

interface Ci extends Ai, Bi {
	void m1();
}