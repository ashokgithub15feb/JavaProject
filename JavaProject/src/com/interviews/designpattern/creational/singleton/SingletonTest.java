package com.interviews.designpattern.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();
		
		Singleton anotherSingletonInstance = Singleton.getInstance();
		anotherSingletonInstance.showMessage();
		
		System.out.println(singleton == anotherSingletonInstance);
		System.out.println(singleton.hashCode() == anotherSingletonInstance.hashCode());
		System.out.println(singleton.equals(anotherSingletonInstance));
		
	}
}
