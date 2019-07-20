package com.ds.program;

public class FindTwoMissionNumber {

	public static void main(String[] args) {

		//https://stackoverflow.com/questions/20026243/find-2-missing-numbers-in-an-array-of-integers-with-two-missing-values
		int arr[] = { 2, 1, 4, 6, 5, 8, 9, 10 };

		int finalSum = 10 * (10 + 1) / 2;
		int finalProduct = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10;

		// a and b are missing number
		int a = 0, b = 0;

		// product if missing number
		int t1 = finalProduct / (1 * 2 * 4 * 5 * 6 * 8 * 9 * 10);

		// sum of missing number
		int t2 = finalSum - (1 + 2 + 4 + 5 + 6 + 8 + 9 + 10);

		// Find out a and b ????

		System.out.println(t1);
		System.out.println(t2);
		
		//t2 = a + b
		//t1 = a- b
		
		int acutualSum = 1 + 2 + 4 + 5 + 6 + 8 + 9 + 10;
		int acutualPro = 1 * 2 * 4 * 5 * 6 * 8 * 9 * 10;
		
		a = acutualSum;
		b = acutualPro;
		
		a = finalSum-acutualSum;
		b = finalProduct/acutualPro;
	
		System.out.println(a+" "+b);
		
		int sd = a+b+a+b;
		int sp = 4*a*b;
		
		System.out.println(sd+" "+sp);
		
		int p = sd+sp;
		
		System.out.println(Math.sqrt(p));
	}
	
}
