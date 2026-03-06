package mazeproblems;

import java.util.ArrayList;

public class Q_3_DiagonalPaths {
    public static void main(String[] args) {
        System.out.println(diagonalPaths("", 3, 3));
    }

    static ArrayList<String> diagonalPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(diagonalPaths(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(diagonalPaths(p + "R", r, c - 1));
        }
        if (r > 1 && c > 1) {
            list.addAll(diagonalPaths(p + "d", r - 1, c - 1));

        }
        return list;
    }
}
