package com.durga.program.reflaction;

public class ReflectionSingleton {

	private final static ReflectionSingleton instance = new ReflectionSingleton();
	
	private ReflectionSingleton() 
	{
		if(instance != null)
		{
			throw new IllegalStateException("instance is already created");
		}
		System.out.println("Singleton Instance being created");
	}
	
	public static ReflectionSingleton getInstance()
	{
		return instance;
	}
}
