package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode question no = 51 

public class NQueensOptimised {

    public static void addSolution(char[][] board, List<List<String>> ans, int n) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            temp.add(new String(board[i]));
        }
        ans.add(temp);
    }

    public static void findNQueensCombinations(int col, char[][] board, List<List<String>> ans, int n, int[] leftRow,
            int[] upperDiagonal, int[] lowerDiagonal) {

        if (col >= n) {
            addSolution(board, ans, n);
            return;
        }

        for (int row = 0; row < n; row++) {

            if (leftRow[row] == 1 || upperDiagonal[(n - 1) + (col - row)] == 1 || lowerDiagonal[row + col] == 1)
                continue;

            board[row][col] = 'Q';
            leftRow[row] = 1;
            upperDiagonal[(n - 1) + (col - row)] = 1;
            lowerDiagonal[row + col] = 1;
            findNQueensCombinations(col + 1, board, ans, n, leftRow, upperDiagonal, lowerDiagonal);
            board[row][col] = '.';
            leftRow[row] = 0;
            upperDiagonal[(n - 1) + (col - row)] = 0;
            lowerDiagonal[row + col] = 0;
        }
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> ans = new ArrayList<>();

        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];

        findNQueensCombinations(0, board, ans, n, leftRow, upperDiagonal, lowerDiagonal);
        return ans;
    }

    public static void main(String[] args) {

    }
}
