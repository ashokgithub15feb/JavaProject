package com.durga.program.reflaction;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the number of row and column");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] first = new int[r][c];
		int[][] second = new int[r][c];
		
		int[][] sum = new int[r][c];
		
		System.out.println("Enter the first matrix element");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c;j++)
			{
				first[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the second matrix elemnt");
		
		for(int i=0; i<r;i++)
		{
			for(int j=0; j<c;j++)
			{
				second[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Print first matrix");
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c;j++)
			{
				System.out.print(first[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("Print second matrix");
		
		for(int i=0; i<r;i++)
		{
			for(int j=0; j<c;j++)
			{
				System.out.print(second[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Adding tow matrix....");
		
		for(int i=0; i<r;i++)
		{
			for(int j=0; j<c;j++)
			{
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		
		System.out.println("Sum of two matrix is:");
		
		for(int i=0; i<r;i++)
		{
			for(int j=0; j<c;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("Main End");
		sc.close();
	}
}
