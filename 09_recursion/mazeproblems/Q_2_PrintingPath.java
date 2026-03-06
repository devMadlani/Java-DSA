package mazeproblems;

import java.util.ArrayList;

public class Q_2_PrintingPath {
    public static void main(String[] args) {
        System.out.println(printingPaths("", 3, 3));
    }

    static ArrayList<String> printingPaths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(printingPaths(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(printingPaths(p + "R", r, c - 1));
        }
        return list;
    }
}
