package backtraking;

import java.util.ArrayList;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(allPath("", maze, 0, 0));
    }

    static ArrayList<String> allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c]) return list;
        maze[r][c] = false;

        if (r < maze.length - 1) {
            list.addAll(allPath(p + "D", maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            list.addAll(allPath(p + "R", maze, r, c + 1));
        }
        if( r < maze.length - 1 && c < maze[0].length - 1){
            list.addAll(allPath(p + "d", maze, r + 1, c + 1));
        }
        if (r > 0) {
            list.addAll(allPath(p + "U", maze, r - 1, c));
        }
        if (c > 0) {
            list.addAll(allPath(p + "L", maze, r, c - 1));
        }
        maze[r][c] = true;
        return  list;
    }
}
