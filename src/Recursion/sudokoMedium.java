package Recursion;

public class sudokoMedium {
	
public static boolean isValidSudoku(char[][] board) {
        
        return solver(board);
    }

    public static boolean solver(char[][] board){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){

                if(board[i][j] != '.'){
                    char c = board[i][j];
                    System.out.println(" "+c);
                    board[i][j] = '.';

                    if(isValid(i,j,board,c)){
                        if(solver(board) == false) return false;
                    }else{
                        return false;
                    } 
                }
               
            }
        }
       return true; 
    }

    public static boolean isValid(int row,int col, char[][] board, char c){

        for(int i=0;i<board.length;i++){

            if(board[row][i] == c) return false;

            if(board[i][col] == c) return false;

            if(board[3*(row/3) + i/3][3*(col/3) + i%3] == c) return false;

        }
        return true;
    } 

	public static void main(String[] args) {
		
		char[][] board = {
				{'.','.','4','.','.','.','6','3','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'5','.','.','.','.','.','.','9','.'},
				{'.','.','.','5','6','.','.','.','.'},
				{'4','.','3','.','.','.','.','.','1'},
				{'.','.','.','7','.','.','.','.','.'},
				{'.','.','.','5','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'}
				};
		
		System.out.println("Answer is -  "+ isValidSudoku(board));

	}

}
