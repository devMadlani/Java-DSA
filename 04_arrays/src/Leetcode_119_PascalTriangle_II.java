import java.util.Arrays;

public class PascalTriangle_II {
    static int[] printRow1Indexed(int r) {
        int[] arr = new int[r];
        arr[0] = 1;
        for (int i = 1; i < r; i++) {
            arr[i] = arr[i - 1] * (r - i) / (i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int r = 5;
        System.out.println(Arrays.toString(printRow1Indexed(r)));
    }
}
