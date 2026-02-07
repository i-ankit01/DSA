package Backtracking;

import java.util.*;

public class Maze {

    // include right and down paths
    public static ArrayList<String> returnPaths(String p, int i, int j, int[][] maze) {
        ArrayList<String> result = new ArrayList<>();

        if (i == maze.length - 1 && j == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (j < maze[0].length - 1) {
            result.addAll(returnPaths(p + 'R', i, j + 1, maze));
        }

        if (i < maze.length - 1) {
            result.addAll(returnPaths(p + 'D', i + 1, j, maze));
        }

        return result;
    }

    // include right, below, and diagonal paths
    public static ArrayList<String> returnPathsIncludeDiagonal(String p, int i, int j, int[][] maze) {
        ArrayList<String> result = new ArrayList<>();

        if (i == maze.length - 1 && j == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (i < maze.length - 1 && j < maze[0].length - 1) {
            result.addAll(returnPathsIncludeDiagonal(p + 'D', i + 1, j + 1, maze)); // D is diagonal
        }

        if (i < maze.length - 1) {
            result.addAll(returnPathsIncludeDiagonal(p + 'B', i + 1, j, maze)); // B is below
        }

        if (j < maze[0].length - 1) {
            result.addAll(returnPathsIncludeDiagonal(p + 'R', i, j + 1, maze)); // R is right
        }

        return result;
    }

    // maze with obstacles
    public static ArrayList<String> returnPathsMazeWithObstacle(String p, int i, int j, boolean[][] maze) {
        ArrayList<String> result = new ArrayList<>();

        if (i == maze.length - 1 && j == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (!maze[i][j]) {
            return null;
        }

        if (j < maze[0].length - 1) {
            ArrayList<String> ans = returnPathsMazeWithObstacle(p + 'R', i, j + 1, maze); // R is right
            if (ans != null) {
                result.addAll(ans);
            }
        }

        if (i < maze.length - 1) {
            ArrayList<String> ans = returnPathsMazeWithObstacle(p + 'D', i + 1, j, maze); // D is down
            if (ans != null) {
                result.addAll(ans);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // int[][] maze = new int[3][3];
        boolean[][] booleanMaze = { { true, true, true }, { true, false, true }, { true, true, true } };
        // Assuming target is at the last cell

        // ArrayList<String> paths = returnPaths("", 0, 0, maze);
        // ArrayList<String> paths = returnPathsIncludeDiagonal("", 0, 0, maze);
        ArrayList<String> paths = returnPathsMazeWithObstacle("", 0, 0, booleanMaze);
        System.out.println(paths);
    }
}
