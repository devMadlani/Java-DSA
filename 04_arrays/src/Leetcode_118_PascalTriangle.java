import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_118_PascalTriangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            int cur = 1;
            temp.add(cur);
            for (int col = 1; col < i; col++) {
                cur = cur * (i - col) / col;
                temp.add(cur);
            }
            ans.add(temp);

        }
        return ans;
    }

    public static void main(String[] args) {
        int r = 5;
        System.out.println(generate(r));

    }
}
