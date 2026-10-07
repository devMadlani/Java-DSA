import java.util.Arrays;

public class MergeSortedArray_strivers {
    static void swapIfGreater(int[] num1, int len1, int[] num2, int len2) {
        if (num1[len1] > num2[len2]) {
            int temp = num1[len1];
            num1[len1] = num2[len2];
            num2[len2] = temp;
        }
    }

    static void merge(int[] num1, int n, int[] num2, int m) {
        int len = n + m;
        int gap = (len) / 2 + (len % 2);
        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                if (left < n && right >= n) {
                    swapIfGreater(num1, left, num2, right - n);
                }
                // arr2 and arr2
                else if (left >= n) {
                    swapIfGreater(num2, left - n, num2, right - n);
                }
                // arr1 and arr1
                else {
                    swapIfGreater(num1, left, num1, right);
                }
                left++;
                right++;
            }
            if(gap == 1) break;
            gap = (gap / 2)  + (gap % 2);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6};
        int[] arr2 = {5, 4, 3,2};
        merge(arr1, arr1.length, arr2, arr2.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
