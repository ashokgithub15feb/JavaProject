package com.durga.program.java8.revies;

import java.util.Arrays;

public class ReduceDemo1  {

	public static void main(String[] args) {
  	  
		 int[] array = {23,43,56,97,32};
	  	  
	  	  Arrays.stream(array).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));
	  	  
	  	  Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
	  	  
	  	  Arrays.stream(array).reduce(StatisticsUtility::addIntData).ifPresent(s -> System.out.println(s));
  }
}


class StatisticsUtility {
	public static int addIntData(int num1, int num2) {
		return num1 + num2;
	}
} 