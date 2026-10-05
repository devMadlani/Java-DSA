import java.util.Arrays;

public class LeetCode_73_SetMatrixZerosOptimal {
    static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) return;

        int cols = matrix[0].length;
//        int[] zeroCols = new int[cols];  -> matrix[0][..]
//        int[] zeroRows = new int[rows];  -> matrix[..][0]
        int col0 = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // mark i-th row
                    matrix[i][0] = 0;
                    // mark j-th col
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }

        }

        // start iterating by ignoring marked row and col which is 0-th one

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // now will mark 0-th row starting with 1 col
        if (matrix[0][0] == 0)
            for (int j = 1; j < cols; j++) matrix[0][j] = 0;

        // will mark 0-th col
        if (col0 == 0)
            for (int i = 0; i < rows; i++) matrix[i][0] = 0;

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
