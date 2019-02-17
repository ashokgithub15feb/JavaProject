package com.ds.iq;

public class Example1 {

	void method1() throws Exception {
		throw new Exception("Calculation error");
	}

	void method2() throws Exception {
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println("Exception handled: "+e.getMessage());
		}
	}

	public static void main(String args[]) {
		Example1 obj = new Example1();
		obj.method3();
		System.out.println("End Of Program");
		
		
		
		System.out.println();
		
		
		String s1 = String.valueOf(true);
		String s2 = String.valueOf(false);
		String s3 = String.valueOf(10.5);
		char c = '1';
		String s4 = String.valueOf(c);
		System.out.println(s1+":"+s2+":"+s3+":"+s4);
		
		Integer i1 = Integer.parseInt("1234");
		Integer i2 = Integer.parseInt("12", 3);
		
		System.out.println(i1+"::"+i2);
	}
	
	
	
}
