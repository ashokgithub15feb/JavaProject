package com.java8.lambdaexp;

import java.util.PriorityQueue;

public class FindMedianOfDataStream {

	//make two bucket left and right bucket - maxPQ(left) and minPQ(right) bucket
	
	private PriorityQueue<Integer> leftMaxPQ;
	private PriorityQueue<Integer> rightMinPQ;
	private int totalCount;
	
	public FindMedianOfDataStream() {
		leftMaxPQ = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
		rightMinPQ = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
		totalCount = 0;
	}

	public void addNum(int num)
	{
		//try to check incoming number with right minPQ bucket minimum element
		//OR add incoming number with left maxPQ bucket
		
		if(!rightMinPQ.isEmpty())
		{
			if(rightMinPQ.peek() < num)
			{
				rightMinPQ.add(num);
			}
			else
			{
				leftMaxPQ.add(num);
			}
		}
		else
		{
			leftMaxPQ.add(num);
		}
		
		totalCount++;
		
		//balancing the left and right Priority Queue bucket
		if(totalCount % 2 == 0) // this is for Even element of bucket
		{
			if(leftMaxPQ.size() > rightMinPQ.size())
			{
				rightMinPQ.add(leftMaxPQ.poll());
			}
			else if(rightMinPQ.size() > leftMaxPQ.size())
			{
				leftMaxPQ.add(rightMinPQ.poll());
			}
		}
		else // this is for odd element of bucket
		{
			if(leftMaxPQ.size() > rightMinPQ.size() + 1)
			{
				rightMinPQ.add(leftMaxPQ.poll());
			}
			else
			{
				if(rightMinPQ.size() > leftMaxPQ.size())
				{
					leftMaxPQ.add(rightMinPQ.poll());
				}
			}
		}
	}
	
	public double findMedian()
	{
		if(totalCount % 2 == 0)
		{
			double median = (double) (leftMaxPQ.peek() + rightMinPQ.peek())/2;
			return median;
		}
		else
		{
			return leftMaxPQ.peek();
		}
	}
	
	public static void main(String[] args) {
		
		FindMedianOfDataStream dataStream = new FindMedianOfDataStream();
//		dataStream.addNum(1);
//		dataStream.addNum(5);
//		dataStream.addNum(4);
//		dataStream.addNum(3);
//		System.out.println("Median: of [1, 5, 4, 3] is: "+dataStream.findMedian());
		
		dataStream.addNum(1);
		dataStream.addNum(8);
		dataStream.addNum(2);
		dataStream.addNum(4);
		dataStream.addNum(5);
		System.out.println("Median: of [1, 8, 2, 4, 5] is: "+dataStream.findMedian());
		
	}
}
