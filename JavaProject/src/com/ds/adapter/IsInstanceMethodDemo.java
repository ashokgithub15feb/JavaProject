package com.ds.adapter;

public class IsInstanceMethodDemo {

	public static void main(String[] args) {
		
		Integer i = new Integer(5);
		
		boolean fun = fun(i, "java.lang.Integer");
		boolean fun2 = fun(i, "java.lang.String");
		boolean fun3 = fun(i, "java.lang.Number");
		
		System.out.println("java.lang.Integer: "+fun);
		System.out.println("java.lang.String: "+fun2);
		System.out.println("java.lang.Number: "+fun3);

		int t =0;
		
		Class<?> c = int.class;
		System.out.println(c.getName());
		
		Class<Integer> type = Integer.TYPE;
		
		System.out.println(type.getName());
	}

	private static boolean fun(Object obj, String str) {

			try {
			
				return Class.forName(str).isInstance(obj);
				
				
			
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			return false;
	}
}
