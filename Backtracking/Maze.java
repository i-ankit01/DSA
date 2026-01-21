package Backtracking;

import java.util.*;

public class Maze {

    public static ArrayList<String> returnPaths(String p, int i , int j, int [][] maze){
        ArrayList<String> result = new ArrayList<>();

        if(i == maze.length-1 && j == maze[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(i<maze.length){
            result.addAll(returnPaths(p+'R', i+1, j, maze));
        }
        
        if(j<maze[0].length){
            result.addAll(returnPaths(p+'D', i, j+1, maze));
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] maze = new int[3][3];
        // Assuming target is at the last cell
        ArrayList<String> paths = returnPaths("", 0, 0, maze);
        System.out.println(paths);
    }
}
