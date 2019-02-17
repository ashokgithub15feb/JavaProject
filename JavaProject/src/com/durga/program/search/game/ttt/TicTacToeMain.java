package com.durga.program.search.game.ttt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {

		TicTacToe t = new TicTacToe();
		
		Scanner s = new Scanner(System.in);
		
		int x = 0, y = 0;
		
		do {
			System.out.println(t.player == Constant.X ? "Player X turn" : "Player O turn");
			System.out.println("Enter x and y places");
			
			try
			{
				x = s.nextInt();
				y = s.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Only Number allow");
				break;
			}

			t.putSign(x, y);
			System.out.println(t.toString());
			System.out.println("_____________________________");
			t.displayWinner();

		} while (t.isEmpty);

		s.close();
	}
}

class TicTacToe {

	public int player = Constant.X;
	private int[][] board = new int[3][3];
	public boolean isEmpty = false;

	public void putSign(int x, int y) {
		if (x < 0 || x > 2 || y < 0 || y > 2) {
			System.out.println("Invalid board position");
			return;
		}
		if (board[x][y] != Constant.EMPTY) {
			System.out.println("Board position occupied");
			return;
		}
		board[x][y] = player;
		player = -player;
	}

	public boolean isWin(int player) {
		return ((board[0][0] + board[0][1] + board[0][2] == player * 3)
				|| (board[1][0] + board[1][1] + board[1][2] == player * 3)
				|| (board[2][0] + board[2][1] + board[2][2] == player * 3)
				|| (board[0][0] + board[1][0] + board[2][0] == player * 3)
				|| (board[0][1] + board[1][1] + board[2][1] == player * 3)
				|| (board[0][2] + board[1][2] + board[2][2] == player * 3)
				|| (board[0][0] + board[1][1] + board[2][2] == player * 3)
				|| (board[2][0] + board[1][1] + board[0][2] == player * 3));
	}

	public void displayWinner() {
		if (isWin(Constant.X)) {
			System.out.println("\n X wins...!!");
			isEmpty = false;
		} else if (isWin(Constant.O)) {
			System.out.println("\n O wins...!!");
			isEmpty = false;
		} else {
			if (!isEmpty) {
				System.out.println("its a tie");
			}

		}
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		isEmpty = false;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch (board[i][j]) {
				case Constant.X:
					s.append(" X ");
					break;
				case Constant.O:
					s.append(" O ");
					break;
				case Constant.EMPTY:
					s.append("   ");
					isEmpty = true;
					break;
				}
				if (j < 2) {
					s.append("|");
				}

			}
			if (i < 2) {
				s.append("\n-----------\n");
			}
		}
		return s.toString();
	}
}

class Constant {
	public static final int X = 1;
	public static final int O = -1;
	public static final int EMPTY = 0;

}