package mazeproblems;

import java.util.ArrayList;

public class Q_4_MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(maze.length - 1);
        System.out.println(mazeWtihObstacles2("", maze, 0, 0));
    }

    static ArrayList<String> mazeWithObstacles1(String p, int r, int c) {
        if (r == 2 && c == 2) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r == 1 && c == 1) return list;
        if (r <= 2) {
            list.addAll(mazeWithObstacles1(p + "D", r + 1, c));
        }
        if (c <= 2) {
            list.addAll(mazeWithObstacles1(p + "R", r, c + 1));
        }
        if (r < 2 && c < 2) {
            list.addAll(mazeWithObstacles1(p + "d", r + 1, c + 1));

        }
        return list;
    }

    static ArrayList<String> mazeWtihObstacles2(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (!maze[r][c]) return ans;

        if (r < maze.length - 1) {
            ans.addAll(mazeWtihObstacles2(p + "D", maze, r + 1, c));
        }
        if (c < maze[0].length - 1) {
            ans.addAll(mazeWtihObstacles2(p + "D", maze, r, c + 1));
        }
        if (r < maze.length - 1 && c < maze[0].length - 1) {
            ans.addAll(mazeWtihObstacles2(p + "d", maze, r + 1, c + 1));

        }
        return ans;
    }
}
