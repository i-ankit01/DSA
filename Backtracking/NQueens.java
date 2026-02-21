package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void addSolution(char[][] board, List<List<String>> ans, int n){
        List<String> temp = new ArrayList<>();
        for(int i = 0; i<n; i++){
            temp.add(new String(board[i]));
        }
        ans.add(temp);
    }

    public static boolean isSafe(int row, int col ,char[][] board , int n){
        int dupRow = row;
        int dupCol = col;

        while (col >= 0 && row >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = dupRow;
        col = dupCol;

        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }

        row = dupRow;
        col = dupCol;

        while(row < n && col >= 0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }

        return true;
    }

    public static void findNQueensCombinations(char[][] board , int col, List<List<String>> ans, int n){
        if(col >= n){
            addSolution(board, ans, n);
            return;
        }

        for(int row = 0; row<n; row++){
            if(isSafe(row, col, board, n)){
                board[row][col] = 'Q';
                findNQueensCombinations(board, col+1, ans, n);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        findNQueensCombinations(board, 0, ans, n);
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
