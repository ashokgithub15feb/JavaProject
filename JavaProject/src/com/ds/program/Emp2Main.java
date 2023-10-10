package com.ds.program;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Emp2Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("com.ds.program.Emp2");
		Constructor[] constructors = c.getDeclaredConstructors();

		for (Constructor constructor : constructors) {
			System.out.println("Name of Constructor : " + constructor);

			System.out.println("Count of constructor parameter : " + constructor.getParameterCount());

			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("Constructor's parameter : " + parameter);
			}
			System.out.println();
		}
		
		Method[] methods = c.getDeclaredMethods();
        System.out.println("Length of method : "+methods.length);
        
//        for(Method method : methods){
//            System.out.println("Method name: \t"+method);
//            System.out.println("Method return type : \t"+method.getReturnType());
//            System.out.println("Method parameter count: \t"+method.getParameterCount());
//            System.out.println();
//            Parameter[] parameters = method.getParameters();
//            for(Parameter parameter : parameters) {
//                System.out.println("Method's Parameter : "+parameter);
//            }
//            System.out.println();
//        }
	}

}
