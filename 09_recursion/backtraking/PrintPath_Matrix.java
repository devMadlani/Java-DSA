package backtraking;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintPath_Matrix {
    public static void main(String[] args) {
        int[][] maze = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        printPathMatrix("", maze, 0, 0, 1);
    }

    static void printPathMatrix(String p, int[][] maze, int r, int c, int count) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            maze[r][c] = count;
            for (int[] arr : maze) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if (maze[r][c] != 0) return;
        maze[r][c] = count;
        if (r < maze.length - 1) {
            printPathMatrix(p + "D", maze, r + 1, c, count + 1);
        }
        if (c < maze[0].length - 1) {
            printPathMatrix(p + "R", maze, r, c + 1, count + 1);
        }
        if (r > 0) {
            printPathMatrix(p + "U", maze, r - 1, c, count + 1);
        }
        if (c > 0) {
            printPathMatrix(p + "L", maze, r, c - 1, count + 1);
        }
        if( r < maze.length - 1 && c < maze[0].length - 1){
            printPathMatrix(p + "d", maze, r + 1, c + 1, count + 1);
        }
        maze[r][c] = 0;
    }
}
