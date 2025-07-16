package com.interviews.leetcode.easy;

import java.util.Arrays;

public class ConvertTheTemprature {

	public static void main(String[] args) {
		
		String[] temp = {"Kelvin", "Fahrenheit"};
		
		double celius = 35.5;
		
		
		double[] result = convertTheTemprature(celius, temp);
		
		System.out.println("Result: "+Arrays.toString(result));
		
	}

	private static double[] convertTheTemprature(double celius, String[] temp) {
		
		double[] d = new double[2];
		double kalvin = celius + 273.15;
		double f = ( celius * 1.8 ) + 32;
		
		d[0] = kalvin;
		d[1] = f;
		
		return d;
	}
}
