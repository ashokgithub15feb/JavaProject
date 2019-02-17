package com.ds.program;

import java.lang.reflect.Method;
import java.util.List;

public class ClassForNameDemo {

	public static void main(String[] args) {
		
		try 
		{
			
			Object forName = Class.forName("java.util.List");
			
			Class<? extends Object> class1 = forName.getClass();
			
			Method[] declaredMethods = class1.getDeclaredMethods();
			
			
			for(Method m : declaredMethods)
			{
				System.out.println(m);
			}
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
}
