package com.interviews.companies.randstaddigital;

public class PrimeNumber {

	public static void main(String[] args) {

		printFirst20PrimeNumber();
		printNumber(100);
	}

	private static void printNumber(int num) {
		
		for(int i = 1; i < num; i++) {
			int count = 0;
			
			for(int j = i; j > 0; j--) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println("Prime Number: "+i);
			}
		}
	}

	private static void printFirst20PrimeNumber() {
		int num = 2;

		int count = 0;

		while (count < 20) {
			if (primeNumber(num)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	private static boolean primeNumber(int num) {
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			}
		}
		return true;
	}
}
