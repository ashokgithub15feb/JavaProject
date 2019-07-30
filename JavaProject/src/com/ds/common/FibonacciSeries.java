package com.ds.common;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.println("fibonacci series");

		fibonacciSeries();
		
		System.out.println("\n\n\n\n");
		
		int n = 20;
		for(int i=1; i<=n;i++)
		{
			System.out.print(fibonacciSeries1(i)+" ");
		}
		
		System.out.println("\n\n\n\n\n\n");
		
		int num=100;
		fibonacciSeries2(num);
		
		System.out.println("\n\n\n\n\n");
		
		System.out.print(f1 +" "+ f2);
		fibonacciSeriesRec(n);
		
		System.out.println("\n\n\n\n\n\n\n");
		
		n = 9;
		System.out.print("find "+n+"th fibonacci number: "+fibonacciSeriesRec1(n));
		System.out.println("\n\n\n\n\n\n\n");
		fibonacciSeriesRecDynamicProgramming (n);
		
		System.out.println("\n\n\n\n\n\n\n\n");
		
		n = 7;
		fibonacciSeriesRecUsingFormula(n);
	
	}

	private static void fibonacciSeriesRecUsingFormula(int n) {
		
		double s = Math.sqrt(5);
		System.out.println("sqrt:"+s);
		double phi = (1 + s) / 2;
		
		double d1 = Math.pow(phi, n);
		double d2 = Math.sqrt(5);
		double d = Math.round(d1 / d2);
		
		int dd = (int)d;
		System.out.println("phi: "+phi);
		System.out.println("pow: "+d1);
		System.out.println("sqrt: "+d2);
		System.out.println("round: "+d);
		
		System.out.println("dd: "+dd);
		
	}

	private static void fibonacciSeriesRecDynamicProgramming(int n) {
		
		//1 extra space to handle case, n = 0
		int[] f = new int[n+1];
		
		int i;
		
		f[0] = 0;
		f[1] = 1;
		System.out.print(f[1]);
		for(i=2; i<=n ; i++)
		{
			f[i] = f[i - 1] + f[i - 2];
			
			System.out.print(" "+f[i]+" ");
		}
	}

	private static int fibonacciSeriesRec1(int n) {
		
		if(n <= 1)
		{
			return n;
		}
		
		return fibonacciSeriesRec1(n - 1) + fibonacciSeriesRec1(n - 2);
		
	}

	static int f1 = 0;
	static int f2 = 1;
	static int f3 = 0;
	
	private static void fibonacciSeriesRec(int n) {
		
		if(n > 0)
		{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			
			System.out.print(" "+f3+" ");
			fibonacciSeriesRec(n - 1);
		}
	}

	private static void fibonacciSeries2(int num) {
		
		int f1 = 0;
		int f2 = 0;
		int f3 = 1;
		
		while(f3 <= num)
		{
			System.out.print(f3+" ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
	}

	private static int fibonacciSeries1(int n) {
		
		if(n == 1 || n == 2)
		{
			return 1;
		}

		return fibonacciSeries1(n -1) + fibonacciSeries1(n - 2);
	}

	private static void fibonacciSeries() {
		int n = 20;
		int f1, f2 = 0, f3 = 1;
		
		for (int i = 1; i <= n; i++) 
		{
			System.out.print(" " + f3 + " ");
			f1 = f2;
			f2 = f3;
			f3 = f1 + f2;
		}
		
	}
}
