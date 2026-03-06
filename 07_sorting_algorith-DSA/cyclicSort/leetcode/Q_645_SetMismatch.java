package sorting.cyclicSort.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_645_SetMismatch {
    static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = setMismatch(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] setMismatch(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i] - 1]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                return new int[]{arr[j], j + 1};
            }

        }
        return new int[]{-1, -1};
    }
}
