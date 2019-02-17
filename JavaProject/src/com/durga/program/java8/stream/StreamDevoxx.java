package com.durga.program.java8.stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class StreamDevoxx {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		numbers.stream()
//			   .parallel()
			   .sequential()
			   .map(StreamDevoxx::transform)
			   .forEachOrdered(StreamDevoxx::printlt);
		
	}

	private static int transform(int numbers) {
		System.out.println("Transform: "+Thread.currentThread());
		return numbers;
	}
	
	private static void printlt(int number)
	{
		System.out.println(Thread.currentThread());
		System.out.println(number);
	}
}

class AA
{
	public void m1()  throws ArrayIndexOutOfBoundsException {
		
		System.out.println("AA-m1()");
	}
}

class AA2 extends AA
{
	public void m1() throws RuntimeException{
		
		System.out.println("AA2-m1()");
	}
}