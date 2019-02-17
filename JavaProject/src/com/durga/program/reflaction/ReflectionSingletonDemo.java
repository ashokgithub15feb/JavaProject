package com.durga.program.reflaction;

import java.lang.reflect.Constructor;

public class ReflectionSingletonDemo {

	public static void main(String[] args) {
		
		ReflectionSingleton instanceOne = ReflectionSingleton.getInstance();
		ReflectionSingleton instanceTwo = null;
		
		
		try
		{
			Constructor<?>[] declaredConstructors = ReflectionSingleton.class.getDeclaredConstructors();
			
			for(Constructor cons : declaredConstructors)
			{
				cons.setAccessible(true);
				
				instanceTwo = (ReflectionSingleton)cons.newInstance();
				
				System.out.println(instanceOne.hashCode());
				System.out.println(instanceTwo.hashCode());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		m1();
		
	}
	
	public static void m1()
	{
		int i=0;
		
		try
		{
			m1();
		}
		catch (StackOverflowError e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally");
		}
		
	}
}
