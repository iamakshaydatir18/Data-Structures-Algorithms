package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueen {

	public static List<List<String>> solveNQueens(int n) {

		List<List<String>> ans = new ArrayList<>();
		char[][] board = new char[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}
		System.out.println("Board length "+board.length);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	
		
		solve(0, board, ans);
		return ans;
	}

	public static void solve(int col, char[][] board, List<List<String>> ans) {
		
		if(col == board.length) {
			ans.add(convert(board));
			return;
		}
		
		for(int row=0;row<board.length;row++) {
			
			if(isSafe(row,col,board)) {
				
				board[row][col] = 'Q';
				solve(col+1,board,ans);
				board[row][col] = '.';
			}
		}
	}

	private static boolean isSafe(int row, int col, char[][] board) {
		
		int dupcol =col;
		
		while(dupcol >= 0) {
			if(board[row][dupcol] == 'Q') return false;
			
			dupcol--;
		}
		
		int i =row;
		int j = col;
		
		while(i>=0 && j>=0) {
			if(board[i][j] == 'Q') return false;
			
			i--;
			j--;
		}
		
		i = row;
		j = col;
		
		while( i < board.length && j >=0) {
			if(board[i][j] == 'Q') return false;

			i++;
			j--;
		}
		
		return true;
	}

	public static List<String> convert(char[][] board) {
		
		List<String> list = new LinkedList<>();
		
		for(int i =0;i<board.length;i++) {
			String s = new String(board[i]);
			list.add(s);
		}
		return list;
	}

	public static void main(String[] args) {
		
		List<List<String>> list = solveNQueens(4);
		
		System.out.println("Board is  ");
		for(List a:list) {
			System.out.println(" "+a);
		}


	}

}
