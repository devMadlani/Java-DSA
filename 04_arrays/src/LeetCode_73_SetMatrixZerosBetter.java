import java.util.Arrays;

public class LeetCode_73_SetMatrixZerosBetter {
    static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) return;

        int cols = matrix[0].length;
        int[] zeroRows = new int[rows];
        int[] zeroCols = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0){
                    zeroRows[i] = 1;
                    zeroCols[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                if(zeroRows[i] == 1 || zeroCols[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
