import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_54_SpiralOrder {
    static List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = cols - 1;
        int top = 0, bottom = rows - 1;
        List<Integer> ans = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            // here we want to print bottom but to print it we atleas need one row so will add check for that
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // we want to print col but to print it we need to make sure that we still have any col left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
        };
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(spiralOrder(matrix));

    }
}
