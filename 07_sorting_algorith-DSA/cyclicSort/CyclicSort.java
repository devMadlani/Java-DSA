package sorting.cyclicSort;

import java.util.Arrays;

// Used CyclicSort when the range of array is 1 to n.

public class CyclicSort {
    static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}