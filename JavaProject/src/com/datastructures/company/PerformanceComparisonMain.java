package com.datastructures.company;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PerformanceComparisonMain {
	
	static int sum = 0;
	public static void main(String[] args) {
		
		long currentTime=System.currentTimeMillis();
		List<Integer> data=new ArrayList<Integer>();
		
		IntStream.range(1, 100000).forEach(f -> data.add(f));
		
		Integer reduce = data.parallelStream().map(m1 -> (int) Math.sqrt(m1)).map(m2 -> {
			
			IntStream.range(1, 100000).forEach(f -> {
				int div = (m2/f);
				sum +=div;
			});
			return sum;
		}).reduce(0, Integer::sum);
		
		System.out.println(reduce);
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken to complete: "+(endTime-currentTime)/(1000*60)+" minutes");

		System.out.println();
		
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
