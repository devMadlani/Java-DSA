package sorting.cyclicSort.leetcode;

import java.util.Arrays;

public class Q_41_FIrstMissingPositiveNum {
    static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositiveNum(arr));
    }
    static int firstMissingPositiveNum(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] < arr.length && arr[i] > 0 && arr[i] != arr[arr[i] -1]){
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j + 1){
                return j+1;
            }
        }
        return arr.length;
    }
}
