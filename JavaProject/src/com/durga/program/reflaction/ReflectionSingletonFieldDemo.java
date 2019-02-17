package com.durga.program.reflaction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionSingletonFieldDemo {

	public static void main(String[] args) {

		ReflectionSingleton instanceOne = ReflectionSingleton.getInstance();
		ReflectionSingleton instanceTwo = null;

		try {
				Field declaredField = ReflectionSingleton.class.getDeclaredField("instance");
				declaredField.setAccessible(true);
				declaredField.set(declaredField, null);

				
				Constructor<ReflectionSingleton> declaredConstructor = ReflectionSingleton.class.getDeclaredConstructor();
				
				declaredConstructor.setAccessible(true);
				
				instanceTwo = declaredConstructor.newInstance();
				
				
				
				System.out.println(instanceOne.hashCode());
				System.out.println(instanceTwo.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
