package com.durga.program.java8;

public interface Interface1 {

	public void m1();
	public void m2();
	
	Interface1 r = new Interface1() {
		
		@Override
		public void m2() {
			
			System.out.println("Interface->m1() method");
		}
		
		@Override
		public void m1() {
			
			System.out.println("Interface->m2() method");
		}
	};
}
