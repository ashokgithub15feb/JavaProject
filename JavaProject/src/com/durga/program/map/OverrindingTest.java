package com.durga.program.map;

public class OverrindingTest {


	public static void main(String[] args) {
		
		V1 v1 = new V1();
		V2 v2 = new V2();
		V1 v3 = new V2();
		
		v1.m1(10);
		v2.m1(10, 20);
		v3.m1(10, 20, 30);
		v1.m1();
	}
}

class V1
{
	public void m1(int... i)
	{
		System.out.println("V1-m1(int... i) method"+i);
	}
}

class V2 extends V1
{
	public void m1(int... i)
	{
		System.out.println("V2-m1(int... i) method"+i);
	}
}