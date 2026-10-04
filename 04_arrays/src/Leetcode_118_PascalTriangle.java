import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_119_PascalTriangle_II {
    static int[] printRow1Indexed(int r) {
        int[] arr = new int[r];
        arr[0] = 1;
        for (int i = 1; i < r; i++) {
            arr[i] = arr[i - 1] * (r - i) / (i);
        }
        return arr;
    }

    static List<Integer> printRow0th(int rowIndex) {

        List<Integer> ans = new ArrayList<>();
        long current = 1;
        ans.add((int) current);
        for (int i = 1; i <= rowIndex; i++) {
            current = current * (rowIndex - i + 1) / i;
            ans.add((int) current);
        }
        return ans;
    }

    public static void main(String[] args) {
        int r = 5;
        System.out.println(Arrays.toString(printRow1Indexed(r)));
        System.out.println(printRow0th(r));
    }
}
