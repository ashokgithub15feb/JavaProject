package com.interviews.companies.globlelogic;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

//Split a large task into subtasks recursively.

//ForkJoinPool efficiently handles large recursive tasks in parallel.


public class ParallelRecursionWithForkJoinPool extends RecursiveTask<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7634817840901387567L;
	private final long[] numbers;
    private final int start;
    private final int end;
    private static final int THRESHOLD = 10_000;
	
    
	public ParallelRecursionWithForkJoinPool(long[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}


	@Override
	protected Long compute() {
        int length = end - start;
        if (length <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++)
                sum += numbers[i];
            return sum;
        } else {
            int mid = start + length / 2;
            ParallelRecursionWithForkJoinPool left = new ParallelRecursionWithForkJoinPool(numbers, start, mid);
            ParallelRecursionWithForkJoinPool right = new ParallelRecursionWithForkJoinPool(numbers, mid, end);
            left.fork();
            long rightResult = right.compute();
            long leftResult = left.join();
            return leftResult + rightResult;
        }
    }
	public static void main(String[] args) {
        long[] numbers = new long[100_000];
        for (int i = 0; i < numbers.length; i++) numbers[i] = i;

        try (ForkJoinPool pool = new ForkJoinPool()) {
			long sum = pool.invoke(new ParallelRecursionWithForkJoinPool(numbers, 0, numbers.length));
			System.out.println("Sum: " + sum);
		}
    }
	
}
