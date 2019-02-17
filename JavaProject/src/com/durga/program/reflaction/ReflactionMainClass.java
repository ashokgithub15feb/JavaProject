package com.durga.program.reflaction;

import java.util.Arrays;

public class ReflactionMainClass {

	public static void main(String[] args) {
		
		Class<?> concreteClass = ConcreteClass.class;
		
		concreteClass = new ConcreteClass(5).getClass();
		
		try {
		
			concreteClass = Class.forName("com.durga.program.reflaction.ConcreteClass");
			System.out.println(concreteClass.getCanonicalName());
//			Class<?> forName = Class.forName("D");
//			System.out.println(forName.getCanonicalName());
			concreteClass = Class.forName("com.durga.program.reflaction.ConcreteClass").getSuperclass();
			System.out.println(concreteClass.getCanonicalName());
			
			System.out.println(String[][].class.getSuperclass());
			
			System.out.println("=====================================");
			
			Class[] declaringClass = Class.forName("com.durga.program.reflaction.ConcreteClass").getDeclaredClasses();
			System.out.println(Arrays.toString(declaringClass));
			
			for(Class s : declaringClass)
			{
				System.out.println(s.getCanonicalName());
			}
			
			System.out.println("=====================================");
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		Class<?> boo = boolean.class;
		System.out.println(boo.getCanonicalName());
		
		
	}
}
