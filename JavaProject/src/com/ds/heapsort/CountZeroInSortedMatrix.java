package com.ds.heapsort;

public class CountZeroInSortedMatrix {

	public static void main(String[] args) {
		  new CountZeroInSortedMatrix();
		 }
		 
		 public CountZeroInSortedMatrix() {
		  int[][] arr = {
		    {0, 0, 0, 0, 1},
		    {0, 0, 0, 1, 1},
		    {0, 1, 1, 1, 1},
		    {1, 1, 1, 1, 1},
		    {1, 1, 1, 1, 1}
		  };
		 
		  int column=arr[0].length-1;
		  int row=0;
		  int zeroCount = 0;
		 
		  while(row<arr.length && column>=0){ 
		   if(arr[row][column] == 1){
		    column--;
		   }else{
		    zeroCount += column+1;
		    row++; 
		   }
		  }
		  System.out.println(zeroCount);
		 }
}
