import java.util.Arrays;

public class Leetcode_88_MergeSortedArray {
    static void merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0 && i >= 0) {
            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        merge(arr1, arr1.length - arr2.length, arr2, arr2.length);
        System.out.println(Arrays.toString(arr1));
    }
}
