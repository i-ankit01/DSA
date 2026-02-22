package Backtracking;

// Leetcode question no = 

public class SudokuSolver {

    public static boolean solve(char[][] board){
        int n = board[0].length;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){

                if(board[i][j] == '.'){

                    for(char value = '1'; value<= '9'; value++){
                        if(isPossible(value, i, j , board, n)){
                            board[i][j] = value;

                            if(solve(board)) return true;
                            else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPossible(int value, int row, int col, char[][] board, int n){
        for(int index = 0; index<n; index++){
            if(board[row][index] == value) return false;
            if(board[index][col] == value) return false;
            if(board[3*(row/3) + index/3][3*(col/3) + index%3] == value) return false;
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public static void main(String[] args) {
        
    }
}
