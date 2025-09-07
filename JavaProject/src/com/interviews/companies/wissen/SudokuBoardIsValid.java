package com.interviews.companies.wissen;import java.util.HashSet;
import java.util.Set;

import com.durga.program.java8.spliterator.CountCharacterInWord;

public class SudokuBoardIsValid {

	public static void main(String[] args) {
		
		String[][] board = 
			{	 {"5","3",".",".","7",".",".",".","."}
				,{"6",".",".","1","9","5",".",".","."}
				,{".","9","8",".",".",".",".","6","."}
				,{"8",".",".",".","6",".",".",".","3"}
				,{"4",".",".","8",".","3",".",".","1"}
				,{"7",".",".",".","2",".",".",".","6"}
				,{".","6",".",".",".",".","2","8","."}
				,{".",".",".","4","1","9",".",".","5"}
				,{".",".",".",".","8",".",".","7","9"}};
		
		boolean result = isValidBoard(board);
		
		if(result) {
			System.out.println("Board is valid: "+result);
		} else {
			System.out.println("Board is not valid: "+result);
		}
		
//		boolean result1 = isValidBoard1(board);
//		
//		if(result1) {
//			System.out.println("Board is valid: "+result1);
//		} else {
//			System.out.println("Board is not valid: "+result1);
//		}
		
	}

	private static boolean isValidBoard(String[][] board) {
		
		boolean[][] rowHasNumber = new boolean[9][9];
		boolean[][] columnHasNumber = new boolean[9][9];
		boolean[][] subBoxHasNumber  = new boolean[9][9];
		
		for(int row = 0; row < 9; row++) {
			for(int column =0; column < 9; column++) {
				String currentCel = board[row][column];
				
				if(currentCel.equals(".")) {
					continue;
				}
				
				int digitIndex = Integer.parseInt(currentCel) - 1;
				
				int subBoxIndex = (row / 3) * 3 + (column / 3);
				
				if(rowHasNumber[row][digitIndex] || 
						columnHasNumber[column][digitIndex] || 
						subBoxHasNumber[subBoxIndex][digitIndex]) {
					return false;
				}
				
				rowHasNumber[row][digitIndex] = true;
				columnHasNumber[column][digitIndex] = true;
				subBoxHasNumber[subBoxIndex][digitIndex] = true;
			}
		}
		
		display(rowHasNumber);
		System.out.println();
		display(columnHasNumber);
		System.out.println();
		display(subBoxHasNumber);
		
		return true;
	}
	
	private static void display(boolean[][] rowHasNumber) {
		
		for(int i = 0; i< rowHasNumber.length; i++) {
			for(int j=0; j < rowHasNumber[0].length; j++) {
				System.out.print("|"+rowHasNumber[i][j]+" ");
			}
			System.out.println("|");
		}
	}

	private static boolean isValidBoard1(String[][] board) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i= 0; i< board.length; i++) {
			for(int j = 0; j< board[0].length; j++) {
				String str = board[i][j];
				
				if(!(Integer.parseInt(str) == '.')) {
					if(!set.add(Integer.parseInt(str)+ i) || 
							!set.add(Integer.parseInt(str) + j) || 
							!set.add(Integer.parseInt(str)+ i / 3  -  j / 3)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
}
