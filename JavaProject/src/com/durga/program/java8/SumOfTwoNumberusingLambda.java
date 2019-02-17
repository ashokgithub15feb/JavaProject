package com.durga.program.java8;

public class SumOfTwoNumberusingLambda{

	public static void main(String[] args) {
		
		AdditionInterface ai = (a,b) -> System.out.println("The Sum is: "+(a+b));
		ai.add(10, 30);
		
		AdditionInterface ai1 = SumOfTwoNumberusingLambda::sum;
		ai1.add(200, 300);
		
	}
	
	public static void sum(int a, int b) {

		System.out.println("The Sum: "+(a+b));
		
	}
}
interface AdditionInterface
{
	public void add(int a, int b);
}